public class IfNested {
    public static void main(String[] args) {
        nestedIf(10);
        nestedIf(15);
        nestedIf(0);

        pararelInt(9);
    }

    public static void nestedIf(int angka) {
        System.out.println("======= Nested If =======");
        if (angka > 0){
            if (angka % 2 == 0) {
                int result = angka * 4;
                System.out.println("Hasil " + result);
            } else {
                int result = angka * 3;
                System.out.println("Hasil " + result);
            }
        } else {
            System.out.println("angka kurang dari 0");
        }
    }

    public static void pararelInt(int angka) {
        System.out.println("");
        System.out.println("======= Pararel Int =======");
        if (angka>0) {
            System.out.println("Angka lebih dari 0");
        }

        if (angka % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }

        if (angka/2 >= 5 ) {
            System.out.println("angka lebih dari 10");
        } else {
            System.out.println("angka kurang dari 10");
        }
    }
}
