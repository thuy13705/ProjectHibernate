package pojo;

import java.util.Objects;
import java.util.Set;

public class Student {
    private String idStudent;
    private String nameStudent;
    private String username;
    private String passwordSt;
    private String email;
    private Integer gender;
    private ClassSubject idClass;
    private Set<CourseRegistration> registrations;

    public Student() {
    }

    public Student(String idStudent, String nameStudent, String username, String passwordSt, String email, Integer gender) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.username = username;
        this.passwordSt = passwordSt;
        this.email = email;
        this.gender = gender;
    }

    public Student(String idStudent, String nameStudent, String username, String passwordSt, String email, Integer gender, ClassSubject idClass) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.username = username;
        this.passwordSt = passwordSt;
        this.email = email;
        this.gender = gender;
        this.idClass = idClass;
    }

    public Set<CourseRegistration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(Set<CourseRegistration> registrations) {
        this.registrations = registrations;
    }

    public ClassSubject getIdClass() {
        return idClass;
    }

    public void setIdClass(ClassSubject idClass) {
        this.idClass = idClass;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordSt() {
        return passwordSt;
    }

    public void setPasswordSt(String passwordSt) {
        this.passwordSt = passwordSt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(idStudent, student.idStudent) && Objects.equals(nameStudent, student.nameStudent) && Objects.equals(username, student.username) && Objects.equals(passwordSt, student.passwordSt) && Objects.equals(email, student.email) && Objects.equals(gender, student.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idStudent, nameStudent, username, passwordSt, email, gender);
    }
}
