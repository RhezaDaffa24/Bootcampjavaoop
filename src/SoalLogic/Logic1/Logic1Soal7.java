package SoalLogic.Logic1;

import SoalLogic.BasicLogic;

public class Logic1Soal7 extends BasicLogic {
    public Logic1Soal7(int n) {
        super(n);
    }

    public void isiArray7() {
        char huruf = 'A';
        for (int p = 0; p < this.n; p++) {
            this.array[0][p] = String.valueOf(huruf);
            huruf++;
        }
    }

    public void cetakArray7(){
        this.isiArray7();
        this.printSingle();
    }
}
