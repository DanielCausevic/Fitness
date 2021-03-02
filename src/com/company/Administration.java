package com.company;

public class Administration extends Employee{
    int vacation;

    public Administration(String name, String cpr, int hours, int salary, int vacation) {
        this.name = name;
        this.cpr = cpr;
        this.hours = hours;
        this.salary = salary;
        this.vacation = vacation;
    }

    public int getVacation() {
        return vacation;
    }

    public void setVacation(int vacation) {
        this.vacation = vacation;
    }

}
