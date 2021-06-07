package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojo.ClassSubject;
import pojo.CourseSession;
import pojo.Semester;
import pojo.Student;
import util.HibernateUtil;

import javax.persistence.Query;
import java.util.List;

public class CourseSessionDao {
    public static List<CourseSession> getSessionList(Semester semester){
        List<CourseSession> ds=null;
        SessionFactory factory= HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        try {
            String hql = "select sv from CourseSession sv where sv.idSemester=:semester";
            Query query = session.createQuery(hql);
            query.setParameter("semester",semester);
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

    public static boolean addSession(CourseSession sv) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (CourseSessionDao.getSession(sv.getIdSession())!=null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(sv);
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
    public static List<CourseSession> fullTextSearch(String textSearch){
        List<CourseSession> ds=null;
        SessionFactory factory= HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        try {
            if (textSearch==null)
                textSearch="%";
            else
                textSearch="%" +textSearch +"%";
            Query query = session.createQuery("from CourseSession where idSession like: textSearch or nameSession like: textSearch");
            query.setParameter("textSearch",textSearch);
            List<CourseSession> list1= (List<CourseSession>) ((org.hibernate.query.Query<?>) query).list();
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
