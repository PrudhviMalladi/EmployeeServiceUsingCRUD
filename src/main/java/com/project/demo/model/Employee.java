package com.project.demo.model;


import javax.persistence.*;

@Entity
@Table(name ="employeeinfo")
public class Employee {
    private Long id;

    private String name;
    private float salary;
    private String designation;

    public Employee() {
    }

    public Employee(Long id, String designation, String name, float salary) {
        super();
        this.id = id;
        this.designation = designation;
        this.name = name;
        this.salary = salary;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
