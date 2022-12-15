package SoalLogic.LogicInterface.Logic1impl;

import SoalLogic.BasicLogic;
import SoalLogic.LogicInterface.LogicInterface;

public class Logic1Soal10impl implements LogicInterface {

    private final BasicLogic logic;

    public Logic1Soal10impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray10(){
        for (int r = 0; r < this.logic.n; r++) {
            this.logic.array1[0][r] = (int) Math.pow(r, 3);
        }
    }


    @Override
    public void cetakArray() {
        this.isiArray10();
        this.logic.printSingle1();
    }
}
