package com.kodilla.abstracts.homework.secondpart;

public abstract class Job {

    String name;
    public int age;
    public int salary;

    String responsibilities;

    public Job (int salary, String responsibilities, String name, int age){
        this.salary = salary;
        this.responsibilities = responsibilities;
        this.age = age;
        this.name = name;
    }

    public abstract void showSalary();
    public abstract void showResponsibilities();

    public abstract void yourName();
    public abstract void yourAge();


}
