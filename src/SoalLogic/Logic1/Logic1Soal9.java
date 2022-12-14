package SoalLogic.Logic1;

public class Logic1Soal9 extends BasicLogic {
    public Logic1Soal9(int n) {
        super(n);
    }

    public void isiArray9() {
        for (int r = 0; r < this.n; r++) {
            this.array1[0][r] = (int) Math.pow(3, r);
        }
    }

    public void cetakArray9(){
        this.isiArray9();
        this.printSingle1();
    }
}
