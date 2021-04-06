package Chapter6;

import java.util.Scanner;

public class FormatAnInteger6_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = input.nextInt();

        System.out.println("Enter width: ");
        int width = input.nextInt();

        System.out.println("The formated number is : "+format(number,width));
    }


    public static String format(int number, int width) {

        String str = (number + "");

        if (str.length() < width) {
            for (int i = width - str.length(); i > 0; i--) {
                str = 0 + str;
            }
        }

        return str;
    }

}
