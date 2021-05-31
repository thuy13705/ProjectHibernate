package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojo.Student;
import pojo.Teacher;
import util.HibernateUtil;

import javax.persistence.Query;
import java.util.List;

public class TeacherDao {
    public static List<Teacher> getTeacherList(){
        List<Teacher> ds=null;
        SessionFactory factory= HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        try {
            String hql = "select sv from Teacher sv";
            Query query = session.createQuery(hql);
            ds = (List<Teacher>) ((org.hibernate.query.Query<?>) query).list();
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }

    public static Teacher getTeacher(String idTeacher) {
        Teacher teacher = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            teacher = (Teacher) session.get(Teacher.class,
                    idTeacher);
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return teacher;
    }

    public static boolean addTeacher(Teacher teacher) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (TeacherDao.getTeacher(teacher.getIdTeacher())!=null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(teacher);
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

    public static boolean deleteTeacher(String idTeacher) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Teacher teacher = TeacherDao.getTeacher(idTeacher);
        if(teacher==null){
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(teacher);
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

    public static boolean updateTeacher(Teacher teacher) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (TeacherDao.getTeacher(teacher.getIdTeacher()) == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(teacher);
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

    public static List<Teacher> fullTextSearch(String textSearch){
        List<Teacher> ds=null;
        SessionFactory factory= HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        try {
            if (textSearch==null)
                textSearch="%";
            else
                textSearch="%" +textSearch +"%";
            Query query = session.createQuery("from Teacher where idTeacher like: textSearch or nameTeacher like: textSearch");
            query.setParameter("textSearch",textSearch);
            List<Teacher> list1= (List<Teacher>) ((org.hibernate.query.Query<?>) query).list();
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
