package Polymorphism;

public class MainPolymorphism {

    public static void main(String[] args) {
        Employee employee = new Employee("Irvan");
        Manager manager = new Manager("Fah");
        VicePresident vicePresident = new VicePresident("Reza");

        employee.sayHello();
        manager.sayHello();
        vicePresident.sayHello();
    }
}
