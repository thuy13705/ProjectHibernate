package pojo;

import java.sql.Date;
import java.sql.Time;
import java.util.Objects;
import java.util.Set;

public class CourseOpen {
    private String idCourse;
    private String teacher;
    private String room;
    private Date dayCourse;
    private Time studyTime;
    private Integer slots;
    private Subjects idSubject;
    private CourseSession idSession;
    private Set<CourseRegistration> registrations;

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

    public Date getDayCourse() {
        return dayCourse;
    }

    public void setDayCourse(Date dayCourse) {
        this.dayCourse = dayCourse;
    }

    public Time getStudyTime() {
        return studyTime;
    }

    public void setStudyTime(Time studyTime) {
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
