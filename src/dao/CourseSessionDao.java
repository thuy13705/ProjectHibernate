package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojo.CourseSession;
import util.HibernateUtil;

import javax.persistence.Query;
import java.util.List;

public class CourseSessionDao {
    public static List<CourseSession> getSessionList(){
        List<CourseSession> ds=null;
        SessionFactory factory= HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        try {
            String hql = "select sv from CourseSession sv";
            Query query = session.createQuery(hql);
            ds = (List<CourseSession>) ((org.hibernate.query.Query<?>) query).list();
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }


    public static CourseSession getSession(String idSession) {
        CourseSession courseSession = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            courseSession = (CourseSession) session.get(CourseSession.class,
                    idSession);
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return courseSession;
    }

    public static boolean addSession(CourseSession courseSession) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (CourseSessionDao.getSession(courseSession.getIdSession())!=null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(session);
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

    public static boolean deleteSession(String idSession) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        CourseSession session1 = CourseSessionDao.getSession(idSession);
        if(session1==null){
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(session1);
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

    public static boolean updateSession(CourseSession courseSession) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (CourseSessionDao.getSession(courseSession.getIdSession()) == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(courseSession);
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
