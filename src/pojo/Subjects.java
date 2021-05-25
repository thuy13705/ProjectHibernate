package pojo;

import java.util.Objects;

public class Subjects {
    private String idSubject;
    private String nameSubject;
    private Integer credits;

    public String getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(String idSubject) {
        this.idSubject = idSubject;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subjects subjects = (Subjects) o;
        return Objects.equals(idSubject, subjects.idSubject) && Objects.equals(nameSubject, subjects.nameSubject) && Objects.equals(credits, subjects.credits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSubject, nameSubject, credits);
    }
}
