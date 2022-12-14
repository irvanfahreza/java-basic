package logic;

public class Logic01Soal02 extends BasicLogic{
    public Logic01Soal02(int n) {
        super(n);
    }
    
    public void isiArray(){
        int a=1;
        int b=3;
        for (int i = 0; i < this.n; i++) {
            if (i%2==0){
                this.array[0][i] = String.valueOf(a);
                a+=1;
            } else if (i%2==1){
                this.array[0][i] = String.valueOf(b);
                b+=3;
            }
        }
    }
    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
