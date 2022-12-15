package SoalLogic.LogicInterface.Logic1impl;

import SoalLogic.BasicLogic;
import SoalLogic.LogicInterface.LogicInterface;

public class Logic1Soal7impl implements LogicInterface {

    private final BasicLogic logic;

    public Logic1Soal7impl(BasicLogic logic) {
        this.logic = logic;
    }

    private void isiArray7(){
        char huruf = 'A';
        for (int p = 0; p < this.logic.n; p++) {
            this.logic.array[0][p] = String.valueOf(huruf);
            huruf++;
        }
    }
    @Override
    public void cetakArray() {
        this.isiArray7();
        this.logic.printSingle();
    }
}
