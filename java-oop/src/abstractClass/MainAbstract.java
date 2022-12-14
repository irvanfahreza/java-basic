package abstractClass;

public class MainAbstract {
    public static void main(String[] args) {
        Location location = new Location();
        City city = new City();
        city.name = "Jakarta";
        System.out.println("City Name: "+city.name);
    }
}
