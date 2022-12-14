package logic;

public class Logic01Soal04 extends BasicLogic{
    public Logic01Soal04(int n) {
        super(n);
    }

    public void isiArray(){
        int[][] deret = new int[n][n];
        for (int i = 0; i < deret.length ; i++) {
            if(i==0 || i==1){
                deret[0][i] = 1;
            } else {
                deret[0][i] = deret [0][i-1] + deret[0][i-2];
            }
            this.array[0][i] = String.valueOf(deret[0][i]);
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
