package SoalLogic.Logic1;

public class Logic1Soal8 extends BasicLogic{
    public Logic1Soal8(int n) {
        super(n);
    }

    public void isiArray8(){
        char huruf = 'A';
        int angka = 2;
        for (int q = 0; q < this.n; q++) {
            if (q % 2 == 0) {
                this.array[0][q] = String.valueOf(huruf);
            } else {
                this.array[0][q] = String.valueOf(angka);
                angka += 2;
            }
            huruf++;
        }
    }

    public void cetakArray8(){
        this.isiArray8();
        this.printSingle();
    }
}
