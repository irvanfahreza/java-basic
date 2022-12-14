import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // sampleConvert(scanner);

        System.out.println("Masukkan angka: ");
        String input = scanner.next();
        int nilai = stringConverter(input);
        nilaiABCDE(nilai); // memanggil psv nilaiABCDE

        // cara kedua, param method
        // nilaiABCDE2(stringConverter(input));


        // pakai return
        System.out.println(nilaiABCDE2(stringConverter(input)));
    }

    public static void nilaiABCDE(int nilai) {
        System.out.print("Nilainya: ");
        if (nilai>=0 && nilai <= 20) {
            System.out.println("E");
        }
        else if (nilai>20 && nilai <= 40) {
            System.out.println("D");
        }
        else if (nilai>40 && nilai <= 60) {
            System.out.println("C");
        }
        else if (nilai>60 && nilai <= 80) {
            System.out.println("B");
        }
        else {
            System.out.println("A");
        }
    }

    // pakai return
    public static String nilaiABCDE2(int nilai) {
        System.out.print("Nilainya (pakai return): ");
        if (nilai <= 20) {
            return "E";
        }
        else if(nilai <= 40) {
            return "D";
        }
        else if (nilai <= 60) {
            return "C";
        }
        else if (nilai <= 80) {
           return "B";
        }
        else {
            return "A";
        }
    }

    public static Integer stringConverter(String input) {
        int  result = 0;
        try {
            result = Integer.parseInt(input);
        } catch (Exception e) {
            System.out.println("Error = " + e.getMessage());
        }
        return result;
    }
    public static void sampleConvert(Scanner scanner) {

        // input pertama
        System.out.println("Masukkan Angka: ");
        String input1 = scanner.next(); // catch
        System.out.println("input 1 = " + input1);

        // input kedua
        System.out.println("Masukkan kata:");
        String input2 = scanner.next();
        System.out.println("input 2 = " + input2);


        System.out.println("Convert...");
        int angka1 = 0;
        int angka2 = 0;
        try {
            angka1 = Integer.parseInt(input1);
            angka2 = Integer.parseInt(input2);
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }

        System.out.println("hitung..");
        int hasil = angka1 + angka2;
        System.out.println("Hasil Jumlah: " + hasil);
    }
}


