package com.kodilla.abstracts.homework;

public abstract class Job {

    public int name;
    public int age;
    public int salary;

    public int responsibilities;

    public Job (int salary, int responsibilities, int name, int age){
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
