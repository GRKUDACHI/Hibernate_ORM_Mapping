package com.alin;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student
{
    @Id
    private int id;
    private String name;
    private String edu;

    public int getId(int i) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEdu(String s) {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public String getName(String happy) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", edu='" + edu + '\'' +
                '}';
    }
}
