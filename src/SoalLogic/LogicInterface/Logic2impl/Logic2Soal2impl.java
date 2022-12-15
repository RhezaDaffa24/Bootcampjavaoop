package SoalLogic.LogicInterface.Logic2impl;

import SoalLogic.BasicLogic;
import SoalLogic.LogicInterface.LogicInterface;

public class Logic2Soal2impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic2Soal2impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray22(){
        for (int j = 0; j < this.logic.n; j++) {
            int angka = 1;
            for (int k = 0; k < this.logic.n; k++) {
                if (j == 0 || k==0 || j == this.logic.n-1 || k == this.logic.n-1 ) {
                    this.logic.array[j][k] = String.valueOf(angka);
                }
                angka += 2;
            }

        }
    }

    @Override
    public void cetakArray() {
        this.isiArray22();
        this.logic.print();
    }
}
