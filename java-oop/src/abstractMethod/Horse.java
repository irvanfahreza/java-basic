package abstractMethod;

import javax.xml.namespace.QName;

public class Horse extends Animal{

    public Horse(String name, String makan){
        this.name= name;
        this.makan= makan;
    }
    @Override
    void run() {
        System.out.println("\nHorse name: "+name);
    }

    @Override
    void canEat() {
        System.out.println("Horse can eat " +makan);
    }
}
