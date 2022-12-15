package SoalLogic.LogicInterface.Logic2impl;

import SoalLogic.BasicLogic;
import SoalLogic.LogicInterface.LogicInterface;

public class Logic2Soal5impl implements LogicInterface {

    private final BasicLogic logic;

    public Logic2Soal5impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray25(){
        for (int j = 0; j < this.logic.n; j++) {
            int angka = 1;
            int angka1 = 1;
            for (int k = 0; k < this.logic.n; k++) {
                if(j+k>= this.logic.n-1 &&  j-k<=0 ||
                        j-k>=0 && j+k<= this.logic.n-1){
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
        this.isiArray25();
        this.logic.print();
    }
}
