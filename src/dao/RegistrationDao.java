package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojo.CourseRegistration;
import util.HibernateUtil;

import javax.persistence.Query;
import java.util.List;

public class RegistrationDao {
    public static List<CourseRegistration> getRegistrationList(){
        List<CourseRegistration> ds=null;
        SessionFactory factory= HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        try {
            String hql = "select sv from CourseRegistration sv";
            Query query = session.createQuery(hql);
            ds = (List<CourseRegistration>) ((org.hibernate.query.Query<?>) query).list();
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }
    public static List<CourseRegistration> getRegistrationStudentList(String idStudent){
        List<CourseRegistration> ds=null;
        SessionFactory factory= HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        try {
            String hql = "select sv from CourseRegistration sv where sv.idStudent=idStudent";
            Query query = session.createQuery(hql);
            ds = (List<CourseRegistration>) ((org.hibernate.query.Query<?>) query).list();
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }

    public static CourseRegistration getRegistration(String idRegistration) {
        CourseRegistration courseRegistration = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            courseRegistration = (CourseRegistration) session.get(CourseRegistration.class,
                    idRegistration);
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return courseRegistration;
    }

    public static boolean addRegistration(CourseRegistration courseRegistration) {
        Session session = HibernateUtil.getSessionFactory().openSession();
//        if (RegistrationDao.getRegistration(courseRegistration.getId())!=) {
//            return false;
//        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(courseRegistration);
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

    public static boolean deleteRegistration(String id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        CourseRegistration courseRegistration = RegistrationDao.getRegistration(id);
        if(courseRegistration==null){
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(courseRegistration);
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

    public static boolean updateRegistration(CourseRegistration courseRegistration) {
        Session session = HibernateUtil.getSessionFactory().openSession();
//        if (RegistrationDao.getRegistration(courseRegistration.g()) == null) {
//            return false;
//        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(courseRegistration);
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
