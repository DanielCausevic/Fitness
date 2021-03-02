package com.company;

public class Instructor extends Employee{

    public Instructor(String name, String cpr, int hours, int salary, int vacation) {
        this.name = name;
        this.cpr = cpr;
        this.hours = hours;
        this.salary = salary;
        this.vacation = vacation;
    }

    public int getSalary(){
        return salary;
    }
}
