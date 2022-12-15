package SoalLogic.Logic1;

import SoalLogic.BasicLogic;

public class Logic1Soal2 extends BasicLogic {
    public Logic1Soal2(int n) {
        super(n);
    }

    public void isiArray2(){
        int hasil = 0;
        int akhir = 0;
        for (int k = 0; k < this.n; k++){
            this.array[0][k] = String.valueOf(hasil);
            if (k % 2 == 0) {
                if (k == 0) {
                    hasil = 1;
                    this.array[0][k] = String.valueOf(hasil);
                } else {
                    this.array[0][k] = String.valueOf(hasil);
                }
            } else {
                akhir = hasil * 3;
                hasil = akhir - k;
                this.array[0][k] = String.valueOf(akhir);
            }
        }

    }
    public void cetakArray2(){
        this.isiArray2();
        this.printSingle();
    }
}
