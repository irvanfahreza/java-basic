package abstractMethod;

public class Frog extends Animal{
    public Frog(String name, String makan) {
        this.name=name;
        this.makan=makan;
    }

    @Override
    void run() {
        System.out.println("\nFrog name: "+name);
    }

    @Override
    void canEat() {
        System.out.println("Frog eat "+makan);
    }
}
