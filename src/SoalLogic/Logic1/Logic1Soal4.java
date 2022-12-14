package SoalLogic.Logic1;

public class Logic1Soal4 extends BasicLogic{
    public Logic1Soal4(int n) {
        super(n);
    }

    public void isiArray4(){
        for (int m = 0; m < this.n; m++) {
            if (m == 0 || m == 1){
//                this.array[0][m] = String.valueOf(1);
                this.array1[0][m] = 1;
            }else {
                this.array1[0][m] = this.array1[0][m-1]+this.array1[0][m-2];
            }
        }
    }

    public void cetakArray4(){
        this.isiArray4();
        this.printSingle1();
    }
}
