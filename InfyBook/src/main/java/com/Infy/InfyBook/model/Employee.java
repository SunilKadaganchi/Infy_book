package com.Infy.InfyBook.model;

import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class Employee extends BaseModel{
    private int empId;
    private String name;
    private String email;
    private String password;
    private String role;

    private int dueAmount;


    public Employee() {
    }

    public Employee(int empId, String name, String email, String password, String role, int dueAmount) {
        this.empId = empId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.dueAmount = dueAmount;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(int dueAmount) {
        this.dueAmount = dueAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return getEmpId() == employee.getEmpId() && getDueAmount() == employee.getDueAmount() && Objects.equals(getName(), employee.getName()) && Objects.equals(getEmail(), employee.getEmail()) && Objects.equals(getPassword(), employee.getPassword()) && Objects.equals(getRole(), employee.getRole());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpId(), getName(), getEmail(), getPassword(), getRole(), getDueAmount());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", dueAmount=" + dueAmount +
                '}';
    }
}
