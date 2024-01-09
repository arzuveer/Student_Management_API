package com.losBlancos.studentManagement;

public class Student {
    private String name;
    private int admno;
    private int age;
    private String branch;

    public Student(String name, int admno, int age, String branch) {
        this.name = name;
        this.admno = admno;
        this.age = age;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAdmno() {
        return admno;
    }

    public void setAdmno(int admno) {
        this.admno = admno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

}
