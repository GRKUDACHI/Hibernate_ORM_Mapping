package org.orm_demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee
{
    @Id
    private int E_id;
    private String E_name;
    private String Dept;

    public int getE_id() {
        return E_id;
    }

    public void setE_id(int e_id) {
        E_id = e_id;
    }

    public String getE_name() {
        return E_name;
    }

    public void setE_name(String e_name) {
        E_name = e_name;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "E_id=" + E_id +
                ", E_name='" + E_name + '\'' +
                ", Dept='" + Dept + '\'' +
                '}';
    }
}
