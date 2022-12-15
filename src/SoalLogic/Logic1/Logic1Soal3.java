package SoalLogic.Logic1;

import SoalLogic.BasicLogic;

public class Logic1Soal3 extends BasicLogic {
    public Logic1Soal3(int n) {
        super(n);
    }

    public void isiArray3(){
        int angka = 0;
        for (int l = 0; l < this.n; l++) {
            if (l == 0) {
                this.array[0][l] = String.valueOf(angka);
            }else {
                this.array[0][l] = String.valueOf(angka);

            }
            angka+=2;
        }
    }
    public void cetakArray3(){
        this.isiArray3();
        this.printSingle();
    }
}
