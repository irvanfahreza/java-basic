package abstractMethod;

public class MainAbstractMethod {
    public static void main(String[] args) {
        Cat cat = new Cat ("Pussy", "Whiskas");
        cat.run();
        cat.canEat();

        Horse horse = new Horse("Horses", "Rumput");
        horse.run();
        horse.canEat();

        Rabbit rabbit = new Rabbit("Rabb", "Rumput");
        rabbit.run();
        rabbit.canEat();

        Frog frog = new Frog("Froggy", "Jangkrik");
        frog.run();
        frog.canEat();

        Rat rat = new Rat("Jerry", "Anything");
        rat.run();
        rat.canEat();
    }
}
