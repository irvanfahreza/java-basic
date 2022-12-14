public class Logic01 {
    public static void main(String[] args) {
        soal01(9);
        soal02(9);
        soal03(9);
        soal04(9);
        soal05(9);
        soal06(9);
        soal07();
        soal08(9);
    }

    public static void soal01(int n) {
        System.out.println("Soal 1: ");
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + "\t");
        }
        System.out.println("");
    }

    public static void soal02(int n) {
        int a = 1;
        int b = 3;
        System.out.println("Soal 2: ");
        for (int i = 1; i <= n; i++) {
            if (i%2==1){
                System.out.print(a+"\t");
                a+=1;
            } else if (i%2 ==0) {
                System.out.print(b+"\t");
                b+=3;
            }
        }
        System.out.println("");
    }

    public static void soal03(int n) {
        System.out.println("Soal 3: ");
        for (int i = 0; i < n; i++) {
            System.out.print(i*2 + "\t");
        }
        System.out.println("");
    }

    public static void soal04(int n) {
        System.out.println("Soal 4: ");
        int[] deret = new int[n];
        for (int i=0; i < deret.length; i++){
            if (i == 0 || i == 1){
                deret[i] = 1;
            } else {
                deret[i] = deret[i-1] + deret[i-2];
            }
            System.out.print(deret[i] + "\t");
        }
        System.out.println("");
    }

    public static void soal05(int n) {
        System.out.println("Soal 05: ");
        int[] deret = new int[n];
        for (int i = 0; i < deret.length; i++) {
            if (i==0 || i==1 || i==2){
                deret[i]=1;
            } else {
                deret[i] = deret[i-1] + deret[i-2] + deret[i-3];
            }
            System.out.print(deret[i] + "\t");
        }
        System.out.println("");
    }

    public static void soal06(int n) {
        System.out.println("Soal 06: ");
        int b;
        for (int i = 2; i <= n; i++) {
            b = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    b += 1;
                }
            }
            if (b == 2) {
                System.out.print(i + "\t");
            }
        }
        System.out.println("");
    }

    public static void soal07() {
        System.out.println("Soal 7: ");
        char c;
        for (c = 'A'; c <= 'I'; c++) {
            System.out.print(c+"\t");
        }
        System.out.println(" ");
    }

    public static void soal08(int n) {
        System.out.println("Soal 08: ");
        char a = 'A';
        int b = 2;
        char c;
        for (c = 'A'; c <= n; c++) {
            if (c%2==0) {
                System.out.println(a + " ");
                a = 'A' + 1;
            }
            else if (c%2==1) {
                System.out.println(b+" ");
                b = b+1;
            }
        }
        System.out.println("");
    }
}
