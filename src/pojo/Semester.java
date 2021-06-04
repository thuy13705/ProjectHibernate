package pojo;

import java.util.Date;
import java.util.Objects;
import java.util.Set;

public class Semester {
    private String idSemester;
    private String nameSemester;
    private String yearSemester;
    private Date startDay;
    private Date endDay;
    private Set<CourseOpen> courses;
    private Integer state;
    private Set<CourseSession> sessions;

    public Semester() {

    }
    public Semester(String idSemester, String nameSemester, String yearSemester, Date startDay, Date endDay, Set<CourseOpen> courses, Integer state, Set<CourseSession> sessions) {
        this.idSemester = idSemester;
        this.nameSemester = nameSemester;
        this.yearSemester = yearSemester;
        this.startDay = startDay;
        this.endDay = endDay;
        this.courses = courses;
        this.state = state;
        this.sessions = sessions;
    }

    public Set<CourseSession> getSessions() {
        return sessions;
    }

    public void setSessions(Set<CourseSession> sessions) {
        this.sessions = sessions;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Set<CourseOpen> getCourses() {
        return courses;
    }

    public void setCourses(Set<CourseOpen> courses) {
        this.courses = courses;
    }


    public String getIdSemester() {
        return idSemester;
    }

    public void setIdSemester(String idSemester) {
        this.idSemester = idSemester;
    }

    public String getNameSemester() {
        return nameSemester;
    }

    public void setNameSemester(String nameSemester) {
        this.nameSemester = nameSemester;
    }

    public String getYearSemester() {
        return yearSemester;
    }

    public void setYearSemester(String yearSemester) {
        this.yearSemester = yearSemester;
    }

    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public Date getEndDay() {
        return endDay;
    }

    public void setEndDay(Date endDay) {
        this.endDay = endDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Semester semester = (Semester) o;
        return Objects.equals(idSemester, semester.idSemester) && Objects.equals(nameSemester, semester.nameSemester) && Objects.equals(yearSemester, semester.yearSemester) && Objects.equals(startDay, semester.startDay) && Objects.equals(endDay, semester.endDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSemester, nameSemester, yearSemester, startDay, endDay);
    }
}
