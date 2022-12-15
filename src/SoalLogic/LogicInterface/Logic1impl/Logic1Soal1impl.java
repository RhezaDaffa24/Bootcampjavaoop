package SoalLogic.LogicInterface.Logic1impl;

import SoalLogic.BasicLogic;
import SoalLogic.LogicInterface.LogicInterface;

public class Logic1Soal1impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic1Soal1impl(BasicLogic logic){

        this.logic = logic;
    }

    public void isiArray(){
        int angka = 1;
        for (int i = 0; i < this.logic.n; i++) {
            this.logic.array[0][i]= String.valueOf(angka);
            angka++;
        }

    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.printSingle();
    }
}
