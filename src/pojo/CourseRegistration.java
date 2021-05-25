package pojo;

import java.sql.Time;
import java.util.Objects;

public class CourseRegistration {
    private int id;
    private Time timeRegistration;
    private CourseOpen idCourse;
    private Student idStudent;

    public Student getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Student idStudent) {
        this.idStudent = idStudent;
    }

    public CourseOpen getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(CourseOpen idCourse) {
        this.idCourse = idCourse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Time getTimeRegistration() {
        return timeRegistration;
    }

    public void setTimeRegistration(Time timeRegistration) {
        this.timeRegistration = timeRegistration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseRegistration that = (CourseRegistration) o;
        return id == that.id && Objects.equals(timeRegistration, that.timeRegistration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, timeRegistration);
    }
}
