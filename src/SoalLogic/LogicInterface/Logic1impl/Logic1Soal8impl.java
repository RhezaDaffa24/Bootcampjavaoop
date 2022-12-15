package SoalLogic.LogicInterface.Logic1impl;

import SoalLogic.BasicLogic;
import SoalLogic.LogicInterface.LogicInterface;

public class Logic1Soal8impl implements LogicInterface {

    private final BasicLogic logic;

    public Logic1Soal8impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray8(){
        char huruf = 'A';
        int angka = 2;
        for (int q = 0; q < this.logic.n; q++) {
            if (q % 2 == 0) {
                this.logic.array[0][q] = String.valueOf(huruf);
            } else {
                this.logic.array[0][q] = String.valueOf(angka);
                angka += 2;
            }
            huruf++;
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray8();
        this.logic.printSingle();
    }
}
