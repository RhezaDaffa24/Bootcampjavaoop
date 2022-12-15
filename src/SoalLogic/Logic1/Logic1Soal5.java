package SoalLogic.Logic1;

import SoalLogic.BasicLogic;

public class Logic1Soal5 extends BasicLogic {
    public Logic1Soal5(int n) {
        super(n);
    }

    public void isiArray5(){
        for (int m = 0; m < this.n; m++) {
            if (m == 0 || m == 1 || m ==2){
//                this.array[0][m] = String.valueOf(1);
                this.array1[0][m] = 1;
            }else {
                this.array1[0][m] = this.array1[0][m-1]+this.array1[0][m-2]+this.array1[0][m-3];
            }
        }
    }
    public void cetakArray5(){
        this.isiArray5();
        this.printSingle1();
    }
}
