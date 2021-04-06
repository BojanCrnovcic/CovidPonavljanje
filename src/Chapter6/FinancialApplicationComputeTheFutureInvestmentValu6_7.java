package Chapter6;

import java.util.Scanner;

public class FinancialApplicationComputeTheFutureInvestmentValu6_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int pocetnaGodina = 1;
        final int poslednjaGodina = 30;

        System.out.println("Unesite ulozeni iznos:");
        double ulog = input.nextDouble();

        System.out.println("Unesite godisnju kamatu:");
        double godisnjaKamata = input.nextDouble();
        godisnjaKamata /= 100;

        double mjesecnaKamata = godisnjaKamata / 12;

        System.out.println("Godina ---------- Buduca Vrijednost");
        for (int i = pocetnaGodina; i <= poslednjaGodina; i++) {
            System.out.println(i + "      ---------- " );


        }
    }



    public static double futureInvestmentValue(
            double investmentAmount, double monthlyInterestRate, int years){
        return investmentAmount * Math.pow(1 + monthlyInterestRate,years * 12 );
    }

    }
