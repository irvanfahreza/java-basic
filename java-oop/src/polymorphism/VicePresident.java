package Polymorphism;

public class VicePresident extends Employee{

    VicePresident (String name){
        super(name);
    }

    void sayHello(){
        System.out.println("Hello Vice President "+this.name);
    }
}
