import java.util.Arrays;
import java.util.List;

public class Looping {
    public static void main(String[] args) {
        sample01(10);
        sample02(11);
        sample03(10);
        sample04();
    }

    public static void sample01(int n) {
        for (int i=0; i<=n; i++){
            System.out.println(i);
        }
    }

    public static void sample02(int n) {
        for (int i=0; i<=n; i++){
            if (i %2 == 0){
                System.out.println("Fizz");
            } else {
                System.out.print(i + "\t");
            }
        }
    }

    public static void sample03(int n) {
        System.out.println("");
        for (int i=0; i<=n; i++){
            for (int j=0; j<=n; j++) {
                System.out.print("["+i+", "+j+"]\t");
            }
            System.out.println("\n");
        }
    }

    public static void sample04() {
        List<String> listString = Arrays.asList("Coding", "Reading", "Sport");
        System.out.println("List Hobby: ");
        for(String item: listString){
            System.out.println(item+"\t");
        }

        System.out.println("List of Number: ");
        List<Integer> listNumber = Arrays.asList(1,4,5,6,7,10);
        for (Integer item: listNumber){
            System.out.print(item+"\t");
        }
    }
}
