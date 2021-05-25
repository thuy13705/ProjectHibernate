package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojo.Student;
import pojo.Users;
import util.HibernateUtil;

import javax.persistence.Query;
import java.util.List;

public class UsersDao {
    public static List<Users> getUserList(){
        List<Users> ds=null;
        SessionFactory factory= HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        try {
            String hql = "select sv from Student sv";
            Query query = session.createQuery(hql);
            ds = (List<Users>) ((org.hibernate.query.Query<?>) query).list();
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }

    public static Users getUser(String idUser) {
        Users users = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            users = (Users) session.get(Users.class,
                    idUser);
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return users;
    }

    public static boolean addUser(Users users) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (UsersDao.getUser(users.getUsername())!=null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(users);
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

    public static boolean deleteUser(String idUser) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Users users = UsersDao.getUser(idUser);
        if(users==null){
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(users);
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

    public static boolean updateUser(Users users) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (UsersDao.getUser(users.getUsername()) == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(users);
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
