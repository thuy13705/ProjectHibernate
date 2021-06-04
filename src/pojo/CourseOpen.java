package pojo;

import java.sql.Date;
import java.sql.Time;
import java.util.Objects;
import java.util.Set;

public class CourseOpen {
    private String idCourse;
    private Semester idSemester;
    private CourseSession idSession;
    private Subjects idSubject;
    private String teacher;
    private String room;
    private Integer dayCourse;
    private Integer studyTime;
    private Integer slots;
    private Set<CourseRegistration> registrations;

    public CourseOpen(String idCourse, Semester idSemester, CourseSession idSession, Subjects idSubject, String teacher, String room, Integer dayCourse, Integer studyTime, Integer slots, Set<CourseRegistration> registrations) {
        this.idCourse = idCourse;
        this.idSemester = idSemester;
        this.idSession = idSession;
        this.idSubject = idSubject;
        this.teacher = teacher;
        this.room = room;
        this.dayCourse = dayCourse;
        this.studyTime = studyTime;
        this.slots = slots;
        this.registrations = registrations;
    }

    public CourseOpen() {

    }

    public Semester getIdSemester() {
        return idSemester;
    }

    public void setIdSemester(Semester idSemester) {
        this.idSemester = idSemester;
    }

    public Set<CourseRegistration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(Set<CourseRegistration> registrations) {
        this.registrations = registrations;
    }

    public CourseSession getIdSession() {
        return idSession;
    }

    public void setIdSession(CourseSession idSession) {
        this.idSession = idSession;
    }

    public Subjects getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(Subjects idSubject) {
        this.idSubject = idSubject;
    }

    public String getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(String idCourse) {
        this.idCourse = idCourse;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Integer getDayCourse() {
        return dayCourse;
    }

    public void setDayCourse(Integer dayCourse) {
        this.dayCourse = dayCourse;
    }

    public Integer getStudyTime() {
        return studyTime;
    }

    public void setStudyTime(Integer studyTime) {
        this.studyTime = studyTime;
    }

    public Integer getSlots() {
        return slots;
    }

    public void setSlots(Integer slots) {
        this.slots = slots;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseOpen that = (CourseOpen) o;
        return Objects.equals(idCourse, that.idCourse) && Objects.equals(teacher, that.teacher) && Objects.equals(room, that.room) && Objects.equals(dayCourse, that.dayCourse) && Objects.equals(studyTime, that.studyTime) && Objects.equals(slots, that.slots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCourse, teacher, room, dayCourse, studyTime, slots);
    }
}
