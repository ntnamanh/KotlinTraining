package fetureDemo.dslDemo.java;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class PersonDto {
    private String lastName;
    private String firstName;
    private String email;
    private Date dateOfBirth;
    private String address;
    private String phoneNum;

    public PersonDto() {
    }

    public PersonDto(String lastName, String firstName, String email, Date dateOfBirth, String address, String phoneNum) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @NotNull
    public Person createPerson() {
        return new Person(lastName, firstName, email, dateOfBirth, address, phoneNum);
    }


}
