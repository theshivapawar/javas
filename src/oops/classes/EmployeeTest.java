package oops.classes;

public class EmployeeTest {
    public static void main(String[] args) {

        /*
        var employee = new Employee2();
        employee.baseSalary = 50_000;
        employee.hourlyRate = 20;
        int wage = employee.calculateWage(10);
        System.out.println("Wage: " + wage);
        */

        /*
        var employee = new Employee3();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        System.out.println("Base Salary: " + employee.getBaseSalary());
        System.out.println("Hourly Rate: " + employee.getHourlyRate());
        int wage = employee.calculateWage(10);
        System.out.println("Wage: " + wage);
        */
        /*
        var employee = new Employee4();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        System.out.println("Wage: " + wage);
        */

        /*
        var employee = new Employee4();
        int wage = employee.calculateWage(10);
        System.out.println("Wage: " + wage);
        */

        var employee1 = new Employee5(50_000, 20);
        int wage1 = employee1.calculateWage(10);
        System.out.println("Wage: " + wage1);

        /*
        var employee2 = new Employee6(50_000, 20);
        int wage2 = employee2.calculateWage();
        System.out.println("Wage: " + wage2);
        */

        var employee2 = new Employee6(50_000, 20);
        int wage2 = employee2.calculateWage(0);
        System.out.println("Wage: " + wage2);

        /*
        var employee3 = new Employee7(50000);
        int wage3 = employee3.calculateWage();
        System.out.println("Wage: " + wage3);
        */

        var employee3 = new Employee7(50000, 0);
        int wage3 = employee3.calculateWage(0);
        System.out.println("Wage: " + wage3);

        var shivam = new Employee(20_000, 0);
        var satyam = new Employee(40_000, 0);
        System.out.println(Employee.numberOfEmployees);
        Employee.printNumberOfEmployees();

        // System.out -> static field
        // Integer.parseInt() -> static method

    }
}
