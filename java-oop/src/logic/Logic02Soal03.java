package logic;

public class Logic02Soal03 extends BasicLogic{
    public Logic02Soal03(int n) {
        super(n);
    }
    
    public void isiArray(){
        for (int i = 0; i < this.n; i++) {
            int angka = 0;
            int awal = 0;
            int akhir = 16;
            for (int j = 0; j < this.n; j++) {
                if(i==j||i+j == this.n-1){
                    this.array[i][j] = String.valueOf(angka);
                } else if (i>j && j == 0){
                    this.array[i][j] = String.valueOf(awal);
                } else if (i<j && j == 8) {
                    this.array[i][j] = String.valueOf(akhir);
                } else if (i<j && i == 0 || i>j && i == 8) {
                    this.array[i][j] = String.valueOf(angka);
                }
                angka+=2;
            }
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.print();
    }
}
