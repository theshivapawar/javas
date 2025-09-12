package oops.classes;

// Constructor Overloading

public class Employee7 {
    private int baseSalary;
    private int hourlyRate;

    /*
    public Employee7(int baseSalary) {
        //setBaseSalary(baseSalary);
        //setHourlyRate(0);
        // Employee() not valid
        this(baseSalary, 0);
    }
    */

    public Employee7(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    /*
    public int calculateWage() {
        //return baseSalary;
        return calculateWage(0);
    }
    */

    public int calculateWage(int extraHours) {
        return baseSalary + (extraHours * hourlyRate);
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Base Salary can not be 0 or less.");
        this.baseSalary = baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly Rate can not be 0 or less.");
        this.hourlyRate = hourlyRate;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }
}
