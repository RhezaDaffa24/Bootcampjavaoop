package SoalLogic.LogicInterface.Logic1impl;

import SoalLogic.BasicLogic;
import SoalLogic.LogicInterface.LogicInterface;

public class Logic1Soal2impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic1Soal2impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray2(){
        int hasil = 0;
        int akhir = 0;
        for (int k = 0; k < this.logic.n; k++){
            this.logic.array[0][k] = String.valueOf(hasil);
            if (k % 2 == 0) {
                if (k == 0) {
                    hasil = 1;
                    this.logic.array[0][k] = String.valueOf(hasil);
                } else {
                    this.logic.array[0][k] = String.valueOf(hasil);
                }
            } else {
                akhir = hasil * 3;
                hasil = akhir - k;
                this.logic.array[0][k] = String.valueOf(akhir);
            }
        }
    }



    @Override
    public void cetakArray() {
        this.isiArray2();
        this.logic.printSingle();
    }
}
