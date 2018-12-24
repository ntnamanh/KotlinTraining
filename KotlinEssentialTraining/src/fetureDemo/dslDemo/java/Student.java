package fetureDemo.dslDemo.java;

import java.util.List;

public class Student {
    private String id;
    private String username;
    private String password;
    private Person person;
    private List<Course> courseList;

    public Student() {
    }

    public Student(String id, String username, String password, Person person, List<Course> courseList) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.person = person;
        this.courseList = courseList;
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

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
}
