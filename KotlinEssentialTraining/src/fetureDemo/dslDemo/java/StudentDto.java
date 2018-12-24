package fetureDemo.dslDemo.java;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

public class StudentDto {
    private String id;
    private String username;
    private String password;
    private Person person;
    private List<Course> coursesList;

    public StudentDto() {
        coursesList = new ArrayList<>();
    }

    public StudentDto(String id, String username, String password, Person person, List<Course> coursesList) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.person = person;
        this.coursesList = coursesList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Course> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(List<Course> coursesList) {
        this.coursesList = coursesList;
    }

    @NotNull
    public Student createStudent() {
        return new Student(id, username, password, person, coursesList);
    }

    @NotNull
    public void addCourse(Course course) {
        coursesList.add(course);
    }

}
