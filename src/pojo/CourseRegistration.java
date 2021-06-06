package pojo;
import java.util.Date;
import java.util.Objects;

public class CourseRegistration {
    private int id;
    private Date timeRegistration;
    private CourseOpen idCourse;
    private Student idStudent;
    private Semester idSemester;

    public Semester getIdSemester() {
        return idSemester;
    }

    public void setIdSemester(Semester idSemester) {
        this.idSemester = idSemester;
    }

    public CourseRegistration(Date timeRegistration, CourseOpen idCourse, Student idStudent, Semester idSemester) {
        this.timeRegistration = timeRegistration;
        this.idCourse = idCourse;
        this.idStudent = idStudent;
        this.idSemester = idSemester;
    }

    public CourseRegistration() {

    }

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

    public Date getTimeRegistration() {
        return timeRegistration;
    }

    public void setTimeRegistration(Date timeRegistration) {
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
