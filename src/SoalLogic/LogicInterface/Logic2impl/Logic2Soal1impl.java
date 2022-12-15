package SoalLogic.LogicInterface.Logic2impl;

import SoalLogic.BasicLogic;
import SoalLogic.LogicInterface.LogicInterface;

public class Logic2Soal1impl implements LogicInterface {

    private final BasicLogic logic;

    public Logic2Soal1impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray21(){
        for (int j = 0; j < this.logic.n; j++) {
            int angka = 1;
            //kolom
            for (int k = 0; k < this.logic.n; k++) {
                if (j == k) {
                    this.logic.array[j][k] = String.valueOf(angka);
                } else if (j + k == this.logic.n - 1) {
                    this.logic.array[j][k] = String.valueOf(angka);
                }
                angka++;
            }

        }
    }

    @Override
    public void cetakArray() {
        this.isiArray21();
        this.logic.print();
    }
}
