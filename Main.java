import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker("John", 50000, 1);
        Worker w2 = new Worker("Jane", 52000, 2);
        Worker w3 = new Worker("Joe", 53000, 3);
        Worker w4 = new Worker("Jill", 54000, 4);
        Manager m1 = new Manager("Bruce", 100000, 5);
        
        Worker[] workers = {w1, w2, w3, w4};
        for (Worker worker : workers) {
            System.out.println(worker.getName() + "'s salary is " + worker.getSalary());
            worker.work();
        }
        
        System.out.println(m1.getName() + "'s salary is " + m1.getSalary());
        m1.work();
    }
}