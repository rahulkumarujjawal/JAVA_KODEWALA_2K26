package com.company.employee;
public class Employee {

    public static void greet(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        greet("Vikash");
    Employee.greet("Kumar");
    }
}