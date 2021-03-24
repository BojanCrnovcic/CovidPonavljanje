package Chapter2;

import java.util.Scanner;

public class CostOFDriving2_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite predjenu distancu:");
        double distanca = input.nextDouble();
        System.out.println("Unesite potrosnju po kilometru:");
        double potrosnja = input.nextDouble();
        System.out.println("Unesite cijenu goriva");
        double cijena = input.nextDouble();

        double cijenaVoznje = (distanca / potrosnja) * cijena;

        System.out.println("Cijena voznje kosta : $ "+cijenaVoznje);
    }
}
