package com.company;

import java.util.ArrayList;

public class NewPersons {

    public ArrayList<Employee> employees(){
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(new Administration("Klaus", "230685-9901", 37, 33000, 5));
        employeeArrayList.add(new Administration("Camilla", "060800-3444", 37, 33000, 5));
        employeeArrayList.add(new Instructor("Sarah", "050501-0022", 20, 3980, 0));
        employeeArrayList.add(new Instructor("Hannah", "080998-1256", 10, 1990, 0));
        return employeeArrayList;
    }

    public ArrayList<Member> members(){
        ArrayList<Member> memberArrayList = new ArrayList<>();
        memberArrayList.add(new Member("Søren", "020266-0233", true));
        memberArrayList.add(new Member("Mikkel", "040498-0239", false));
        return memberArrayList;
    }

    public void printEmployees(){
        ArrayList<Employee> employeeArrayList = employees();
        System.out.println("Employees:");

        System.out.println("Name " + "Cpr " + "Hours " + "Salary " + "Vacation ");
        for(Employee e : employeeArrayList){
            if(e instanceof Administration) {
                e = (Administration) e;
                System.out.println(e.getName() + " " + e.getCpr() + " " + e.getHours() + " " + e.getSalary() + " " + e.getVacation());
            } else if(e instanceof Instructor){
                System.out.println(e.getName() + " " + e.getCpr() + " " + e.getHours() + " " + e.getSalary());
            }
        }
    }

    public void printMembers(){
        ArrayList<Member> memberArrayList = members();
        System.out.println("Members:");
        System.out.println("Name " + "Cpr " + "Membership");
        for(Member m : memberArrayList){
            m = (Member) m;
                System.out.println(m.getName() + " " + m.getCpr() + " " + m.getMemberType());
        }
    }

}
