package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojo.ClassSubject;
import pojo.Semester;
import util.HibernateUtil;

import javax.persistence.Query;
import java.util.List;

public class SemesterDao {
    public static List<Semester> getSemester(){
        List<Semester> ds=null;
        SessionFactory factory= HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        try {
            String hql = "select sv from Semester sv";
            Query query = session.createQuery(hql);
            ds = (List<Semester>) ((org.hibernate.query.Query<?>) query).list();
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }

    public static Semester getSemester(String idSemester) {
        Semester semester = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            semester = (Semester) session.get(Semester.class,
                    idSemester);
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return semester;
    }

    public static boolean addSemester(Semester semester) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (SemesterDao.getSemester(semester.getIdSemester())!=null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(semester);
            transaction.commit();
        } catch (HibernateException ex) {
            //Log the exception
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }

    public static boolean deleteSemester(String idSemester) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Semester semester = SemesterDao.getSemester(idSemester);
        if(semester==null){
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(semester);
            transaction.commit();
        } catch (HibernateException ex) {
            //Log the exception
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }

    public static boolean updateSemester(Semester semester) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (SemesterDao.getSemester(semester.getIdSemester()) == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(semester);
            transaction.commit();
        } catch (HibernateException ex) {
            //Log the exception
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    public static List<Semester> fullTextSearch(String textSearch){
        List<Semester> ds=null;
        SessionFactory factory= HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        try {
            if (textSearch==null)
                textSearch="%";
            else
                textSearch="%" +textSearch +"%";
            Query query = session.createQuery("from Semester where idSemester like: textSearch or nameSemester like: textSearch");
            query.setParameter("textSearch",textSearch);
            List<Semester> list1= (List<Semester>) ((org.hibernate.query.Query<?>) query).list();
            ds=list1;
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }

    public static Semester semesterCurrent(){
        Semester ds=null;
        SessionFactory factory= HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        try {

            Query query = session.createQuery("from Semester where state=1");
            List<Semester> list1= (List<Semester>) ((org.hibernate.query.Query<?>) query).list();
            if (list1.size()!=0)
                ds=list1.get(0);
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }
}
