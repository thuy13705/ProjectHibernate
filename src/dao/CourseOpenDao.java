package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojo.CourseOpen;
import util.HibernateUtil;

import javax.persistence.Query;
import java.util.List;

public class CourseOpenDao {
    public static List<CourseOpen> getCourseList(){
        List<CourseOpen> ds=null;
        SessionFactory factory= HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        try {
            String hql = "select sv from CourseOpen sv";
            Query query = session.createQuery(hql);
            ds = (List<CourseOpen>) ((org.hibernate.query.Query<?>) query).list();
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }

    public static CourseOpen getCourse(String idCourse) {
        CourseOpen courseOpen = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            courseOpen = (CourseOpen) session.get(CourseOpen.class,
                    idCourse);
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return courseOpen;
    }

    public static boolean addCourse(CourseOpen courseOpen) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (CourseOpenDao.getCourse(courseOpen.getIdCourse())!=null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(courseOpen);
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

    public static boolean deleteCourse(String idCourse) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        CourseOpen courseOpen = CourseOpenDao.getCourse(idCourse);
        if(courseOpen==null){
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(courseOpen);
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

    public static boolean updateCourse(CourseOpen courseOpen) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (CourseOpenDao.getCourse(courseOpen.getIdCourse()) == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(courseOpen);
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
