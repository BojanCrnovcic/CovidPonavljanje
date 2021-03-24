package Chapter2;

import java.util.Scanner;

public class FindTheNumberOfYears2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int minutaUSatu = 60;
        final int satiUDanu = 24;
        final int danaUGodini = 365;

        System.out.println("Unesite broj minuta: ");
        int brojMinuta = input.nextInt();

        int godinaMinuta = brojMinuta / minutaUSatu / satiUDanu / danaUGodini;
        int danMinuta = brojMinuta / minutaUSatu / satiUDanu % danaUGodini;

        System.out.println(brojMinuta + " minuta je priblizno jednako " + godinaMinuta + " godina i " + danMinuta + " dana.");
    }
}
