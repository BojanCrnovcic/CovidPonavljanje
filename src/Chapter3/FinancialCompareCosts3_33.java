package Chapter3;

import java.util.Scanner;

public class FinancialCompareCosts3_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite tezinu prvog pakovanja: ");
        double prvoPakovanjeTezina = input.nextDouble();
        System.out.println("Unesite cijenu prvog pakovanja: ");
        double cjenaPvogPakovanja = input.nextDouble();

        System.out.println("Unesite tezinu drugog pakovanja: ");
        double drugoPakovanjeTezina = input.nextDouble();
        System.out.println("Unesite cijenu drugug pakovanja");
        double cjenaDrugogPakovanja = input.nextDouble();

        double prviPaket = cjenaPvogPakovanja/prvoPakovanjeTezina;
        System.out.println("Cijena prvog paketa  je "+prviPaket);

        double drugiPaktet = cjenaDrugogPakovanja/drugoPakovanjeTezina;
        System.out.println("Cijena drugog paketa je "+drugiPaktet);

        if (prviPaket > drugiPaktet || drugiPaktet < prviPaket){
            System.out.println("Prvi paket je povoljniji. ");
        }else System.out.println("Drugi paket je povoljniji. ");




    }
}
