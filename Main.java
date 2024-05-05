import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Worker("John", 50000, 1, "2020-01-10", "Developer"));
        employees.add(new Worker("Jane", 52000, 2, "2019-05-15", "Developer"));
        employees.add(new Worker("John", 50000, 1, "2020-01-10", "Developer")); // Duplikat id
        employees.add(new Manager("Bruce", 100000, 5, "2017-02-11", "Kierownik Projektu"));
        employees.add(new Worker("Steve", 55000, 3, "2021-08-19", "Starszy Developer"));
        employees.add(new Manager("Emma", 102000, 5, "2019-06-25", "Kierownik działu marketingu")); // Duplikat id

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
            if (employee instanceof Manager) {
                totalManagerSalary += employee.getSalary();
            } else if (employee instanceof Worker) {
                totalWorkerSalary += employee.getSalary();
            }
        }

        System.out.println("Total salary of all employees: $" + totalSalary);
        System.out.println("Total salary of all managers: $" + totalManagerSalary);
        System.out.println("Total salary of all workers: $" + totalWorkerSalary);

        
        ArrayList<Integer> seenIds = new ArrayList<>();
        ArrayList<Integer> duplicateIds = new ArrayList<>();
        for (Employee employee : employees) {
            if (seenIds.contains(employee.getId())) {
                if (!duplicateIds.contains(employee.getId())) {
                    duplicateIds.add(employee.getId());
                }
            } else {
                seenIds.add(employee.getId());
            }
        }

        System.out.println("Duplicate IDs: " + duplicateIds);
    }
}