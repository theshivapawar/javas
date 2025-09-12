package oops.classes;

public class Employee1 {
    public int baseSalary;
    public int extraHours;
    public int hourlyRate;

    public int calculateWage() {
        return baseSalary + (extraHours * hourlyRate);
    }
}