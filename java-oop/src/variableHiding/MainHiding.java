package VariableHiding;

public class MainHiding {

    public static void main(String[] args) {
        System.out.println("Parent...");
        Parent parent = new Parent();
        parent.name="Irvan";
        parent.toDoIt();
        System.out.println("Parent name: "+parent.name);

        System.out.println("\nChild...");
        Child child = new Child();
        child.name = "Anak";
        child.toDoIt();
        System.out.println("Child name: "+child.name);

        System.out.println("\nChild cast");
        Parent parent2 = (Parent) child;
        parent2.toDoIt();
        System.out.println("Parent2 name: "+parent2.name);
    }
}
