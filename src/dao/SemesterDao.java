package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
}
