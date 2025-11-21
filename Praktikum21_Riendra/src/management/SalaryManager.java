package management;

import employee.Employee;

public class SalaryManager {
    public double calculateBonus(Employee employee) {
        if (employee.getPosition().equals("Manager")) {
            return employee.getSalary() * 0.2;
        } else if (employee.getPosition().equals("Staff")) {
            return employee.getSalary() * 0.1;
        }
        return 0;
    }

    public double calculateTotalSalary(Employee employee) {
        return employee.getSalary() + calculateBonus(employee);
    }
}
