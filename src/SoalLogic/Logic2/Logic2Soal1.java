package SoalLogic.Logic2;

import SoalLogic.Logic1.BasicLogic;

public class Logic2Soal1 extends BasicLogic {
    public Logic2Soal1(int n) {
        super(n);
    }

    public void isiArray1() {
        for (int j = 0; j < this.n; j++) {
            int angka = 1;
            //kolom
            for (int k = 0; k < this.n; k++) {
                if (j == k) {
                    this.array[j][k] = String.valueOf(angka);
                } else if (j + k == this.n - 1) {
                    this.array[j][k] = String.valueOf(angka);
                }
                angka++;
            }
        }
    }
    public void cetakArray1(){
        this.isiArray1();
        this.print();
    }
}
