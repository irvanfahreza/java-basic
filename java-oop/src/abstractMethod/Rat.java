package abstractMethod;

public class Rat extends Animal{
    public Rat(String name, String makan) {
        this.name=name;
        this.makan=makan;
    }

    @Override
    void run() {
        System.out.println("\nRats name: "+name);
    }

    @Override
    void canEat() {
        System.out.println("Rats eat "+makan);
    }
}
