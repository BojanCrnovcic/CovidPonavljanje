package Chapter2;

import java.util.Scanner;

public class SumTheDigitsInAnInteger2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj izmedju 0-1000");
        int broj = input.nextInt();

        int zadnjiBroj = broj%10;
        int srednjiBroj = broj/10;
        int drigiSrednji = srednjiBroj%10;
        int prednjiBroj = srednjiBroj/10;


        int konacno = prednjiBroj+drigiSrednji+zadnjiBroj;

        System.out.println("Zbir brojeva je: "+konacno);

    }
}
