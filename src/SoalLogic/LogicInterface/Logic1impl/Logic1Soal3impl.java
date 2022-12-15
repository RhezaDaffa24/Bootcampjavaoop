package SoalLogic.LogicInterface.Logic1impl;

import SoalLogic.BasicLogic;
import SoalLogic.LogicInterface.LogicInterface;

public class Logic1Soal3impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic1Soal3impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray3(){
        int angka = 0;
        for (int l = 0; l < this.logic.n; l++) {
            if (l == 0) {
                this.logic.array[0][l] = String.valueOf(angka);
            }else {
                this.logic.array[0][l] = String.valueOf(angka);

            }
            angka+=2;
        }
    }


    @Override
    public void cetakArray() {
        this.isiArray3();
        this.logic.printSingle();
    }
}
