package com.example.springcore;

public class Student {
    private String name;
    private int rollno;
    private String email;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) { this.name = name; }
    public void setRollno(int rollno) { this.rollno = rollno; }
    public void setEmail(String email) { this.email = email; }

    public String getName() { return name; }
    public int getRollno() { return rollno; }
    public String getEmail() { return email; }
    public int getAge() { return age; }

    public void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollno + ", Email: " + email);
    }
} 