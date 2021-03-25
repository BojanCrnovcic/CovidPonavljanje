package Chapter5;

import java.util.Scanner;

public class GameLottery5_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite vas broj (dve cifre) ");
        int pogoditi = input.nextInt();

        int pogoditiCifra1 = pogoditi / 10;
        int pogoditiCifra2 = pogoditi % 10;

        int lutrija = 0;
        int lutrijaCifra1 = 0;
        int lutrijaCifra2 = 0;

        do {
            lutrija =(int)(Math.random()*10)+90;
            lutrijaCifra1=lutrija/10;
            lutrijaCifra2=lutrija%10;
        }while (lutrijaCifra1==lutrijaCifra2);
        System.out.println("Lutrijski broj je "+lutrija);

        if (pogoditi==lutrija){
            System.out.println("Tacno poklapanje: Osvojili ste $10 000!");
        }else if (pogoditiCifra2==lutrijaCifra1 && pogoditiCifra1 == lutrijaCifra2){
            System.out.println("Poklapanje svih brojeva: Osvojili ste $3 000!");
        }else if (pogoditiCifra1==lutrijaCifra1||pogoditiCifra1==lutrijaCifra2||pogoditiCifra2==lutrijaCifra1||pogoditiCifra2==lutrijaCifra2){
            System.out.println("Poklapanje jednog broja: Osvojili ste $1 000");
        }else System.out.println("Zao mi je nema poklapanja. ");



    }
}
