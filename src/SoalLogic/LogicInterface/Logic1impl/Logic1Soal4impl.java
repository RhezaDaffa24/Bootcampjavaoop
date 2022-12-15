package SoalLogic.LogicInterface.Logic1impl;

import SoalLogic.BasicLogic;
import SoalLogic.LogicInterface.LogicInterface;

public class Logic1Soal4impl implements LogicInterface {
        private final BasicLogic logic;

        public Logic1Soal4impl(BasicLogic logic) {
                this.logic = logic;
        }

        public void isiArray4(){
                for (int m = 0; m < this.logic.n; m++) {
                        if (m == 0 || m == 1){
//                this.array[0][m] = String.valueOf(1);
                                this.logic.array1[0][m] = 1;
                        }else {
                                this.logic.array1[0][m] = this.logic.array1[0][m-1]+this.logic.array1[0][m-2];
                        }
                }
        }



        @Override
        public void cetakArray() {
                this.isiArray4();
                this.logic.printSingle1();
        }
}
