package fetureDemo.dslDemo.kotlin

import fetureDemo.dslDemo.java.CourseDto
import fetureDemo.dslDemo.java.PersonDto
import fetureDemo.dslDemo.java.Student
import fetureDemo.dslDemo.java.StudentDto

fun main(args: Array<String>) {

    val studentDto = createStudent {
        id = "StudentId_123"
        username = "Student's username"
        password = "Student's password"

        person2 {
            firstName = "Nguyen Trung"
            lastName = "Name Anh"
            address = "XXX Quang Trung Go Vap"
            phoneNum = "0983XXXXXX"
            email = "anhtnnguyen@kms-technolgy.com"
        }

        course {
            id = "Course's Id_123"
            name = "Course's Name"
            cost = 100
            credit = 2
        }

        course {
            id = "Course's Id_345"
            name = "Course's Name"
            cost = 200
            credit = 3
        }
    }
}

fun createStudent(block: StudentDto.() -> Unit): Student {
    val builder = StudentDto()
    builder.block()
    return builder.createStudent()
}
fun StudentDto.person2(block: PersonDto.() -> Unit) {
    person = PersonDto().apply(block).createPerson()
}

fun StudentDto.course(block: CourseDto.() -> Unit) {
    coursesList.add(CourseDto().apply(block).createCourse())
}




