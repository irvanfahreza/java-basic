package logic;

public class Logic01Soal05 extends BasicLogic{
    public Logic01Soal05(int n) {
        super(n);
    }
    
    public void isiArray(){
        int[][] deret = new int [n][n];
        for (int i = 0; i < this.n; i++) {
            if (i==0 || i ==1 | i == 2) {
                deret[0][i] = 1;
            } else {
                deret[0][i] = deret[0][i-1] + deret[0][i-2] + deret[0][i-3];
            }
            this.array[0][i] = String.valueOf(deret[0][i]);
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
