package pojo;

import java.util.Objects;

public class Users {

    private String username;
    private String passUser;
    private Integer role;

    public Users(String username, String passUser, Integer role) {
        this.username = username;
        this.passUser = passUser;
        this.role = role;
    }

    public Users() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassUser() {
        return passUser;
    }

    public void setPassUser(String passUser) {
        this.passUser = passUser;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }


}
