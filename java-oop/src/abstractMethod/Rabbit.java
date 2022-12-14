package abstractMethod;

public class Rabbit extends Animal{
    public Rabbit(String name, String makan) {
        this.makan= makan;
        this.name = name;
    }

    @Override
    void run() {
        System.out.println("\nKelinci bernama: "+name);
    }

    @Override
    void canEat() {
        System.out.println("Kelinci makannya "+makan);
    }
}
