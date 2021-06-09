package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojo.Semester;
import pojo.Student;
import util.HibernateUtil;

import javax.persistence.Query;
import java.util.List;

public class StudentDao {
    public static List<Student> getStudentList(){
        List<Student> ds=null;
        SessionFactory factory= HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        try {
            String hql = "select sv from Student sv";
            Query query = session.createQuery(hql);
            ds = (List<Student>) ((org.hibernate.query.Query<?>) query).list();
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }

    public static Student getStudent(String idStudent) {
        Student student = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            student = (Student) session.get(Student.class,
                    idStudent);
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return student;
    }

    public static boolean addStudent(Student sv) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (StudentDao.getStudent(sv.getIdStudent())!=null) {
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

    public static boolean deleteStudent(String idStudent) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Student sv = StudentDao.getStudent(idStudent);
        if(sv==null){
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(sv);
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

    public static boolean updateStudent(Student student) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (StudentDao.getStudent(student.getIdStudent()) == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(student);
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

    public static List<Student> fullTextSearch(String textSearch){
        List<Student> ds=null;
        SessionFactory factory= HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        try {
            if (textSearch==null)
                textSearch="%";
            else
                textSearch="%" +textSearch +"%";
            Query query = session.createQuery("from Student where idStudent like: textSearch or nameStudent like: textSearch");
            query.setParameter("textSearch",textSearch);
            List<Student> list1= (List<Student>) ((org.hibernate.query.Query<?>) query).list();
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
