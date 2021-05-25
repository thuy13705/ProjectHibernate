package pojo;

import java.util.Objects;
import java.util.Set;

public class ClassSubject {
    private String idClass;
    private String nameClass;
    private Set<Student> students;

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public String getIdClass() {
        return idClass;
    }

    public void setIdClass(String idClass) {
        this.idClass = idClass;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassSubject that = (ClassSubject) o;
        return Objects.equals(idClass, that.idClass) && Objects.equals(nameClass, that.nameClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idClass, nameClass);
    }
}
