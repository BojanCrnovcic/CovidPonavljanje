package Chapter4;

import java.util.Scanner;

public class GeometryAreaOfAHexagon4_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite duzinu strane : ");
        double s = input.nextDouble();

        double povrsina = (6 * Math.pow(s,2))/(4*Math.tan(Math.PI/6));

        System.out.println("Povrsina sestougla je :"+povrsina);

    }
}
