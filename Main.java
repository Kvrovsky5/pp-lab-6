import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Worker("John", 50000, 1, "2020-01-10", "Developer"));
        employees.add(new Worker("Jane", 52000, 2, "2019-05-15", "Developer"));
        employees.add(new Worker("Joe", 53000, 3, "2018-03-20", "Developer"));
        employees.add(new Worker("Jill", 54000, 4, "2021-07-22", "Developer"));
        employees.add(new Manager("Bruce", 100000, 5, "2017-02-11", "Starszy Developer"));

        for (Employee employee : employees) {
            employee.work();
            System.out.println("-" + employee.getName() + " (ID: " + employee.getId() + ", Position: " + employee.getPosition() + ", Hire date: " + employee.getHireDate() + ", Salary: $" + employee.getSalary() + ".");
        }
    }
}