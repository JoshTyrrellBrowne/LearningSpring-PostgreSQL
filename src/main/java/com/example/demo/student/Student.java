package com.example.demo.student;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

    //  Constructor with no variables passed
    public Student (){
    }
    // Constructor with all variables passed
    public Student (Long id, 
                    String name, 
                    String email, 
                    LocalDate dob, 
                    Integer age){
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }
    // Constructor, with no ID, because it can be auto generated
    public Student (String name, 
                    String email, 
                    LocalDate dob, 
                    Integer age){
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    // Getters:
    public Long getID() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public LocalDate getDOB() {
        return this.dob;
    }
    public Integer getAge() {
        return this.age;
    }
    // Setters:
    public void setID(Long id) {
        this.id = id;
    }
    public void getName(String name) {
        this.name = name;
    }
    public void getEmail(String email) {
        this.email = email;
    }
    public void getDOB(LocalDate dob) {
        this.dob = dob;
    }
    public void getAge(Integer age) {
        this.age = age;
    }

    //@Override
    //public String toString() {
    //    return "Student{" +
    //            "id=" + id +
    //            ", name='" + name + '\'' +
    //            ", email='" + email + '\'' +
    //            ", dob=" = dob +
    //            ", age=" + age + 
    //            '}';
    //}
}

