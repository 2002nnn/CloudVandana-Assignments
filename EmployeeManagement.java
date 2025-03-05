package assignmentcloudvandana;

import java.util.ArrayList;
import java.util.List;


public class EmployeeManagement {
	
	public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "virat", 5000));
        employees.add(new Employee(2, "Aarya", 63000));
        employees.add(new Employee(3, "Anvesh", 59000));
        System.out.println("Employee Details:");
        for (Employee employee : employees) {
            employee.displayDetails();
        }
    }
}