package SoalLogic.Logic1;

import SoalLogic.BasicLogic;

public class Logic1Soal10 extends BasicLogic {
    public Logic1Soal10(int n) {
        super(n);
    }
    public void isiArray10() {
        for (int r = 0; r < this.n; r++) {
            this.array1[0][r] = (int) Math.pow(r, 3);
        }
    }

    public void cetakArray10(){
        this.isiArray10();
        this.printSingle1();
    }
}
