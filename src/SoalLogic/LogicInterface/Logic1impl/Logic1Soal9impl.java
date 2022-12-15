package SoalLogic.LogicInterface.Logic1impl;

import SoalLogic.BasicLogic;
import SoalLogic.LogicInterface.LogicInterface;

public class Logic1Soal9impl implements LogicInterface {

    private final BasicLogic logic;

    public Logic1Soal9impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray9(){
        for (int r = 0; r < this.logic.n; r++) {
            this.logic.array1[0][r] = (int) Math.pow(3, r);
        }
    }


    @Override
    public void cetakArray() {
        this.isiArray9();
        this.logic.printSingle1();
    }
}
