package fetureDemo.dslDemo.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        StudentDto studentDto = new StudentDto();

        studentDto.setId("StudentId_123");
        studentDto.setUsername("Student's username");
        studentDto.setPassword("Student's password");

        PersonDto personDto = new PersonDto();
        personDto.setFirstName("Nguyen Trung");
        personDto.setLastName("Name Anh");
        personDto.setAddress("XXX Quang Trung Go Vap");
        personDto.setPhoneNum("0983XXXXXX");
        personDto.setEmail("anhtnnguyen@kms-technolgy.com");
        studentDto.setPerson(personDto.createPerson());

        CourseDto courseDto1 = new CourseDto();
        courseDto1.setId("Course's Id_123");
        courseDto1.setName("Course's Name");
        courseDto1.setCost(100);
        courseDto1.setCredit(2);
        studentDto.addCourse(courseDto1.createCourse());

        CourseDto courseDto2 = new CourseDto();
        courseDto2.setId("Course's Id_345");
        courseDto2.setName("Course's Name");
        courseDto2.setCost(200);
        courseDto2.setCredit(3);
        studentDto.addCourse(courseDto2.createCourse());

        final Student student = studentDto.createStudent();
        System.out.println(student);
    }
}
