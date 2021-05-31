package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojo.Subjects;
import pojo.Teacher;
import util.HibernateUtil;

import javax.persistence.Query;
import java.util.List;

public class SubjectDao {
    public static List<Subjects> getSubjectList(){
        List<Subjects> ds=null;
        SessionFactory factory= HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        try {
            String hql = "select sv from Subjects sv";
            Query query = session.createQuery(hql);
            ds = (List<Subjects>) ((org.hibernate.query.Query<?>) query).list();
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }

    public static Subjects getSubject(String idSubject) {
        Subjects subjects = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            subjects = (Subjects) session.get(Subjects.class,
                    idSubject);
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return subjects;
    }

    public static boolean addSubject(Subjects subjects) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (SubjectDao.getSubject(subjects.getIdSubject())!=null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(subjects);
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

    public static boolean deleteSubject(String idSubject) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Subjects subjects = SubjectDao.getSubject(idSubject);
        if(subjects==null){
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(subjects);
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

    public static boolean updateSubject(Subjects subjects) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (SubjectDao.getSubject(subjects.getIdSubject()) == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(subjects);
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
    public static List<Subjects> fullTextSearch(String textSearch){
        List<Subjects> ds=null;
        SessionFactory factory= HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        try {
            if (textSearch==null)
                textSearch="%";
            else
                textSearch="%" +textSearch +"%";
            Query query = session.createQuery("from Subjects where idSubject like: textSearch or nameSubject like: textSearch");
            query.setParameter("textSearch",textSearch);
            List<Subjects> list1= (List<Subjects>) ((org.hibernate.query.Query<?>) query).list();
            ds=list1;
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }

}
