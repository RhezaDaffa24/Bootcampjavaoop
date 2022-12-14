package SoalLogic.Logic1;

public class BasicLogic {
    public int n;
    public String[][] array;

    public int[][] array1;


    public BasicLogic(int n) {
        this.n = n;
        this.array = new String[n][n];
        this.array1 = new int[n][n];
    }

    public void print() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (this.array[i][j] != null) {
                    System.out.print(this.array[i][j] + "\t\t");
                } else {
                    System.out.print("\t\t");
                }
            }
            System.out.println("\n");
        }
    }
    public void printSingle(){
        for (int i = 0; i < n; i++) {
            System.out.print(array[0][i]+"\t\t");
        }
    }
    public void printSingle1(){
        for (int j = 0; j < n; j++) {
            System.out.print(array1[0][j]+"\t\t");
        }
    }

}
