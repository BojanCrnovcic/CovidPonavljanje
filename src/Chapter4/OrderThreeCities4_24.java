package Chapter4;

import java.util.Scanner;

public class OrderThreeCities4_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String zamjena = "";

        System.out.println("Unesite prvi grad: ");
        String prviGrad = input.nextLine();

        System.out.println("Unesite drugi grad: ");
        String drugiGrad = input.nextLine();

        System.out.println("Unesite treci grad: ");
        String treciGrad = input.nextLine();

        String grad = "";
            if (grad.length()==prviGrad.length() && grad.length()==drugiGrad.length() && grad.length()==treciGrad.length()){
                Character.isAlphabetic(grad.length());
            }
            System.out.println("Imena gradova alfabetskim redom su "+prviGrad+" "+drugiGrad+" "+treciGrad);

        }

    }


