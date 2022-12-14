package logic;

public class Logic02Soal04 extends BasicLogic{
    public Logic02Soal04(int n) {
        super(n);
    }

    public void isiArray(){
        int[][] deret = new int[n][n];
        for (int i = 0; i < deret.length; i++) {
            for (int j = 0; j < deret.length; j++) {
                if(i>=0 || j ==0) {
                    deret[i][j] = 1;
                } else if (i<j && i==0){
                    deret[i][j] = deret[i-1][j] + deret[i-2][j];

                }
            }
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.print();
    }
}
