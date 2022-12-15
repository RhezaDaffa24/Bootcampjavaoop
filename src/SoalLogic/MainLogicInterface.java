package SoalLogic;

import SoalLogic.LogicInterface.Logic1impl.*;
import SoalLogic.LogicInterface.Logic2impl.*;
import SoalLogic.LogicInterface.LogicInterface;

public class MainLogicInterface {
    public static void main(String[] args) {
        System.out.println("Logic 1 Soal 1: "+"\n");
        LogicInterface logic1Soal1 = new Logic1Soal1impl(new BasicLogic(9));
        logic1Soal1.cetakArray();
        System.out.println("\n");

        System.out.println("Logic 1 Soal 2: "+"\n");
        LogicInterface logic1Soal2 = new Logic1Soal2impl(new BasicLogic(9));
        logic1Soal2.cetakArray();
        System.out.println("\n");

        System.out.println("Logic 1 Soal 3: "+"\n");
        LogicInterface logic1Soal3 = new Logic1Soal3impl(new BasicLogic(9));
        logic1Soal3.cetakArray();
        System.out.println("\n");

        System.out.println("Logic 1 Soal 4: "+"\n");
        LogicInterface logic1Soal4 = new Logic1Soal4impl(new BasicLogic(9));
        logic1Soal4.cetakArray();
        System.out.println("\n");

        System.out.println("Logic 1 Soal 5: "+"\n");
        LogicInterface logic1Soal5 = new Logic1Soal5impl(new BasicLogic(9));
        logic1Soal5.cetakArray();
        System.out.println("\n");

        System.out.println("Logic 1 Soal 6: "+"\n");
        LogicInterface logic1Soal6 = new Logic1Soal6impl(new BasicLogic(9));
        logic1Soal6.cetakArray();
        System.out.println("\n");

        System.out.println("Logic 1 Soal 7: "+"\n");
        LogicInterface logic1Soal7 = new Logic1Soal7impl(new BasicLogic(9));
        logic1Soal7.cetakArray();
        System.out.println("\n");

        System.out.println("Logic 1 Soal 8: "+"\n");
        LogicInterface logic1Soal8 = new Logic1Soal8impl(new BasicLogic(9));
        logic1Soal8.cetakArray();
        System.out.println("\n");

        System.out.println("Logic 1 Soal 9: "+"\n");
        LogicInterface logic1Soal9 = new Logic1Soal9impl(new BasicLogic(9));
        logic1Soal9.cetakArray();
        System.out.println("\n");

        System.out.println("Logic 1 Soal 10: "+"\n");
        LogicInterface logic1Soal10 = new Logic1Soal10impl(new BasicLogic(9));
        logic1Soal10.cetakArray();
        System.out.println("\n");

        System.out.println("Logic 2 Soal 1: "+"\n");
        LogicInterface logic2Soal1 = new Logic2Soal1impl(new BasicLogic(9));
        logic2Soal1.cetakArray();
        System.out.println("\n");

        System.out.println("Logic 2 Soal 2: "+"\n");
        LogicInterface logic2Soal2 = new Logic2Soal2impl(new BasicLogic(9));
        logic2Soal2.cetakArray();
        System.out.println("\n");

        System.out.println("Logic 2 Soal 3: "+"\n");
        LogicInterface logic2Soal3 = new Logic2Soal3impl(new BasicLogic(9));
        logic2Soal3.cetakArray();
        System.out.println("\n");

        System.out.println("Logic 2 Soal 4: "+"\n");
        LogicInterface logic2Soal4 = new Logic2Soal4impl(new BasicLogic(9));
        logic2Soal4.cetakArray();
        System.out.println("\n");

        System.out.println("Logic 2 Soal 5: "+"\n");
        LogicInterface logic2Soal5 = new Logic2Soal5impl(new BasicLogic(9));
        logic2Soal5.cetakArray();
        System.out.println("\n");

        System.out.println("Logic 2 Soal 6: "+"\n");
        LogicInterface logic2Soal6 = new Logic2Soal6impl(new BasicLogic(9));
        logic2Soal6.cetakArray();
        System.out.println("\n");
    }
}
