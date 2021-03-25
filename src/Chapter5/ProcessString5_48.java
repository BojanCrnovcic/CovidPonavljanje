package Chapter5;

import java.util.Scanner;

public class ProcessString5_48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String rezultat = "";

        System.out.println("Unesite niz:");
        String string = input.nextLine();

        String unosString = " "+string;

        for (int i = 0; i<unosString.length();i++){
            if (Character.isLetter(unosString.charAt(i))){
                switch (i%2){
                    case 0:{

                    }break;
                    default: rezultat+=unosString.charAt(i);
                    break;

                    }
                }
            }
        System.out.println(rezultat);

        }
    }

