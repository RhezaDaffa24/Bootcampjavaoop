package SoalLogic.LogicInterface.Logic2impl;

import SoalLogic.BasicLogic;
import SoalLogic.LogicInterface.LogicInterface;

public class Logic2Soal4impl implements LogicInterface {

    private final BasicLogic logic;

    public Logic2Soal4impl(BasicLogic logic) {
        this.logic = logic;
    }
     public void isiArray24() {
         for (int j = 0; j < this.logic.n; j++) {
             int angka = 1;
             int angka1 = 1;
             //kolom
             for (int k = 0; k < this.logic.n; k++) {
                 if (k == 0 || j == 0 || j == this.logic.n - 1 || k == this.logic.n - 1 || j == this.logic.n / 2 ||
                         k == this.logic.n / 2) {
                     this.logic.array[j][k] = String.valueOf(angka);
                 }
                 int sum = angka + angka1;
                 angka = angka1;
                 angka1 = sum;
             }
         }
     }
    @Override
    public void cetakArray() {
        this.isiArray24();
        this.logic.print();
    }
}
