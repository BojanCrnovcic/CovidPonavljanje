package Chapter4;

import java.util.Scanner;

public class VowelOrConsonant4_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite slovo: ");

        String slovo = input.nextLine().trim();

        if (slovo.length() > 1) {
            System.out.println(slovo + " je pogresan simbol.");
        } else {
            char ch = slovo.charAt(0);
            if (Character.isLetter(ch)) {
                String slo = ch + "";
                String rezultat = "";
                if ("aeiou".contains(slo.toLowerCase())) {
                    rezultat += "samoglasnik";
                } else {
                    rezultat += "suglasnik";
                }

                System.out.println(ch + " je " + rezultat);

            } else {
                System.out.println(ch + " je pogresan simbol.");
            }
        }


    }
}
