import dao.StudentDao;

import dao.UsersDao;
import pojo.Student;
import pojo.Users;


public class Main {


    public static void main(final String[] args) throws Exception {
        Student student = new Student();
        student.setIdStudent("18120592");
        student.setNameStudent("Nguyễn Lương Phương Thuỷ");
        student.setUsername(student.getIdStudent());
        student.setPasswordSt(student.getIdStudent());
        student.setEmail("nguyenbinhnhi@gmail.com");
        student.setGender(1);
        boolean kq = StudentDao.addStudent(student);
        if (kq == true) {
            Users user=new Users(student.getUsername(),student.getPasswordSt(),1);
            boolean results= UsersDao.addUser(user);
            if (results == true) {

                System.out.println("Thêm thành công");
            } else {
                System.out.println("Thêm thất bại");
            }
            System.out.println("Thêm thành công");
        } else {
            System.out.println("Thêm thất bại");
        }

//        SignIn signIn=new SignIn();
//        signIn.setVisible(true);
    }
}