package logic;

public class Logic01Soal10 extends BasicLogic{
    public Logic01Soal10(int n) {
        super(n);
    }
    
    public void isiArray(){
//        int[][] deret = new int[n][n];
        for (int i = 0; i <this.n ; i++) {
            this.array[0][i] = String.valueOf((int)Math.pow(i,3));
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
