package org.fai.study.iasf_demo.entity.dtos;


public class StudentDto {
    private Integer id;
    private String email;
    private String firstName;
    private String lastName;
    private String className;

    public StudentDto() {
    }

    public StudentDto(String className, String email, String firstName, Integer id, String lastName) {
        this.className = className;
        this.email = email;
        this.firstName = firstName;
        this.id = id;
        this.lastName = lastName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
