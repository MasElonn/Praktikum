package praktikum21_riendra;

import employee.Employee;
import management.SalaryManager;

public class Soal8 {
    public static void main(String[] args) {
        Employee manager = new Employee("Manager", "Manager", 5000000);
        Employee staff = new Employee("Staff", "Staff", 3000000);

        SalaryManager salaryManager = new SalaryManager();

        double managerBonus = salaryManager.calculateBonus(manager);
        double staffBonus = salaryManager.calculateBonus(staff);

        double managerTotalSalary = salaryManager.calculateTotalSalary(manager);
        double staffTotalSalary = salaryManager.calculateTotalSalary(staff);

        System.out.println("Manager Name: " + manager.getName());
        System.out.println("Manager Position: " + manager.getPosition());
        System.out.println("Manager Salary: " + manager.getSalary());
        System.out.println("Manager Bonus: " + managerBonus);
        System.out.println("Manager Total Salary: " + managerTotalSalary);

        System.out.println();

        System.out.println("Staff Name: " + staff.getName());
        System.out.println("Staff Position: " + staff.getPosition());
        System.out.println("Staff Salary: " + staff.getSalary());
        System.out.println("Staff Bonus: " + staffBonus);
        System.out.println("Staff Total Salary: " + staffTotalSalary);
    }
}
