package Chapter2;

import java.util.Scanner;

public class HealthApplicationComputingBMI2_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite tezinu u funtama: ");
        double tezinaFUNTA = input.nextDouble();
        System.out.println("Unesite visinu u incima: ");
        double visinaINCI = input.nextDouble();

        double tezinaKILOGRAM = tezinaFUNTA* 0.45359237;
        double visinaMETAR = visinaINCI* 0.0254;

        double metarKvadrat = Math.pow(visinaMETAR,2);

        System.out.println("Vas BMI je : "+tezinaKILOGRAM/metarKvadrat);
    }
}
