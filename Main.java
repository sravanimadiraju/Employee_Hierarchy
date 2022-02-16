package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Employee Hierarchy
        Developer developer1=new Developer("Sravani",1702,"Associate Software Engineer","Digital");
        Developer developer2=new Developer("lalitha",1703,"Associate Software Engineer","Digital");
        Developer developer3=new Developer("Shivani",1704,"Associate Software Engineer","Digital");
        Manager manager=new Manager("Umakanth",1500,"Team manager","Digital",3,"Bangalore");
        President president=new President("Purna Veer",530,"President","Digital",50,"OnSite","Digital Platforms");
        ArrayList<Developer> developers=new ArrayList<>();
        developers.add(developer1);
        developers.add(developer2);
        developers.add(developer3);
        for(Developer d:developers){
            System.out.println(d.toString());
        }
        System.out.println(manager.getEmpName());
        System.out.println(president.getEmpName());
        System.out.println(manager.toString());
        System.out.println(president.toString());
    }
}

class Developer{
    protected String empName;
    protected int empId;
    protected String empDesignation;
    protected String empDepartment;

    public Developer(String empName, int empId, String empDesignation, String empDepartment) {
        this.empName = empName;
        this.empId = empId;
        this.empDesignation = empDesignation;
        this.empDepartment = empDepartment;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "empName='" + empName + '\'' +
                ", empId=" + empId +
                ", empDesignation='" + empDesignation + '\'' +
                ", empDepartment='" + empDepartment + '\'' +
                '}';
    }
}

class Manager extends Developer{
    protected int teamSize;
    private String location;

    public Manager(String empName, int empId, String empDesignation, String empDepartment, int teamSize, String location) {
        super(empName, empId, empDesignation, empDepartment);
        this.teamSize = teamSize;
        this.location = location;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return  "Manager{" +
                "teamSize=" + teamSize +
                ", location='" + location + '\'' +
                '}';
    }

}

class President extends Manager{
    private String businessUnit;

    public President(String empName, int empId, String empDesignation, String empDepartment, int teamSize, String location, String businessUnit) {
        super(empName, empId, empDesignation, empDepartment, teamSize, location);
        this.businessUnit = businessUnit;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    @Override
    public String toString() {
        return "President{" +
                "businessUnit='" + businessUnit + '\'' +
                '}';
    }
}