package com.jacode;

public class WageCalculator {

    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);
        employee.
        //employee.setBaseSalary(50_000);
        //employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}
// before encapsulation:
/*public class WageCalculator {
    public static void main(String[] args) {
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;

        int wage = calculateWage(baseSalary, extraHours, hourlyRate);
        System.out.println(wage);
    }

    public static int calculateWage(
            int baseSalary,
            int extraHours,
            int hourlyRate
    ) {
        return baseSalary + (extraHours * hourlyRate);
    }
    }
}*/
