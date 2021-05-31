package pojo;

import java.util.Objects;

public class Teacher {
    private String idTeacher;
    private String nameTeacher;
    private String username;
    private String passwordTc;
    private String email;

    public Teacher(String idTeacher, String nameTeacher, String username, String passwordTc, String email) {
        this.idTeacher = idTeacher;
        this.nameTeacher = nameTeacher;
        this.username = username;
        this.passwordTc = passwordTc;
        this.email = email;
    }

    public Teacher() {

    }

    public String getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(String idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordTc() {
        return passwordTc;
    }

    public void setPasswordTc(String passwordTc) {
        this.passwordTc = passwordTc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(idTeacher, teacher.idTeacher) && Objects.equals(nameTeacher, teacher.nameTeacher) && Objects.equals(username, teacher.username) && Objects.equals(passwordTc, teacher.passwordTc) && Objects.equals(email, teacher.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTeacher, nameTeacher, username, passwordTc, email);
    }
}
