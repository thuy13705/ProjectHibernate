import dao.StudentDao;

import dao.TeacherDao;
import dao.UsersDao;
import gui.SignIn;
import pojo.Student;
import pojo.Teacher;
import pojo.Users;


public class Main {


    public static void main(final String[] args) throws Exception {
//        Teacher teacher = new Teacher();
//        teacher.setIdTeacher("GV1012");
//        teacher.setNameTeacher("Nguyễn Ngọc Hà");
//        teacher.setUsername(teacher.getIdTeacher());
//        teacher.setPasswordTc(teacher.getIdTeacher());
//        teacher.setEmail("GV1012@hcmus.edu.vn");
//        boolean kq = TeacherDao.addTeacher(teacher);
//        if (kq == true) {
//            Users user=new Users(teacher.getUsername(),teacher.getPasswordTc(),0);
//            boolean results= UsersDao.addUser(user);
//            if (results == true) {
//
//                System.out.println("Thêm thành công");
//            } else {
//                System.out.println("Thêm thất bại");
//            }
//            System.out.println("Thêm thành công");
//        } else {
//            System.out.println("Thêm thất bại");
//        }

        SignIn signIn=new SignIn();
        signIn.setVisible(true);
    }
}