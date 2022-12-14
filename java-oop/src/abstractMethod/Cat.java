package abstractMethod;

public class Cat extends Animal{
    public Cat(String name, String makan){
        this.name=name;
        this.makan = makan;
    }
    @Override
    void run() {
        System.out.println("\nCat name: "+name);
    }

    @Override
    void canEat() {
        System.out.println("Cat eat: "+makan);
    }
}
