package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojo.ClassSubject;
import pojo.Student;
import util.HibernateUtil;

import javax.persistence.Query;
import java.util.List;

public class ClassSubjectDao {
    public static List<ClassSubject> getClassList(){
        List<ClassSubject> ds=null;
        SessionFactory factory= HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        try {
            String hql = "select sv from ClassSubject sv";
            Query query = session.createQuery(hql);
            ds = (List<ClassSubject>) ((org.hibernate.query.Query<?>) query).list();
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }

    public static ClassSubject getClass(String idClass) {
        ClassSubject classSubject = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            classSubject = (ClassSubject) session.get(ClassSubject.class,
                    idClass);
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return classSubject;
    }

    public static boolean addClass(ClassSubject classSubject) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (ClassSubjectDao.getClass(classSubject.getIdClass())!=null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(classSubject);
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

    public static boolean deleteClass(String idClass) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        ClassSubject classSubject = ClassSubjectDao.getClass(idClass);
        if(classSubject==null){
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(classSubject);
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

    public static boolean updateClass(ClassSubject classSubject) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (ClassSubjectDao.getClass(classSubject.getIdClass()) == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(classSubject);
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
    public static List<ClassSubject> fullTextSearch(String textSearch){
        List<ClassSubject> ds=null;
        SessionFactory factory= HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        try {
            if (textSearch==null)
                textSearch="%";
            else
                textSearch="%" +textSearch +"%";
            Query query = session.createQuery("from ClassSubject where idClass like: textSearch or nameClass like: textSearch");
            query.setParameter("textSearch",textSearch);
            List<ClassSubject> list1= (List<ClassSubject>) ((org.hibernate.query.Query<?>) query).list();
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
