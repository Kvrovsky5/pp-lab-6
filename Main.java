import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker("John", 50000, 1, "2020-01-10", "Developer");
        Worker w2 = new Worker("Jane", 52000, 2, "2019-05-15", "Developer");
        Worker w3 = new Worker("John", 50000, 1, "2020-01-10", "Developer"); // Ten sam ID co w1
        Manager m1 = new Manager("Bruce", 100000, 5, "2017-02-11", "Head of Development");

        Employee[] employees = {w1, w2, w3, m1};

        for (Employee employee : employees) {
            System.out.println(employee.getName() + " has code: " + employee.hashCode());
        }

        System.out.println("porównywanie Worker(3) o ID:1 z resztą pracowników");
        for (Employee employee : employees) {
            System.out.println("Comparing " + w3.getName() + " and " + employee.getName() + ": " + w3.equals(employee));
        }
    }
}