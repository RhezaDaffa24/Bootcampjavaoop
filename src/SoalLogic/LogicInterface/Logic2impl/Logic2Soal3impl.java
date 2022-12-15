package SoalLogic.LogicInterface.Logic2impl;

import SoalLogic.BasicLogic;
import SoalLogic.LogicInterface.LogicInterface;

public class Logic2Soal3impl implements LogicInterface {

    private final BasicLogic logic;

    public Logic2Soal3impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray23() {
        for (int j = 0; j < this.logic.n; j++) {
            int angka = 0;
            //kolom
            for (int k = 0; k < this.logic.n; k++) {
                if (j == 0 || k == 0 || j == this.logic.n - 1 || k == this.logic.n - 1 || j == k || j + k == this.logic.n - 1) {
                    this.logic.array[j][k] = String.valueOf(angka);
                }
                angka += 2;
            }
        }
    }
    @Override
    public void cetakArray() {
        this.isiArray23();
        this.logic.print();
    }
}
