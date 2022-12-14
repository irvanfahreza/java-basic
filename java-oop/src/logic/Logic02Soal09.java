package logic;

public class Logic02Soal09 extends BasicLogic {
    public Logic02Soal09(int n) {
        super(n);
    }

    public void isiArray(){
        int nilaiTengah = this.n/2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j-i <= nilaiTengah && i-j <= nilaiTengah &&
                i+j >= nilaiTengah && i+j <= nilaiTengah + n-1){
                    this.array[i][j] = String.valueOf(1);
                } else if(j+i <= nilaiTengah+1 && i-j <= nilaiTengah &&
                        i-j >= nilaiTengah-1 && i+j <= nilaiTengah + n) {
                    this.array[i][j] = "3";
                }
            }
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.print();
    }
}
