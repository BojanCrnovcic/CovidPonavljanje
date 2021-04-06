package Chapter7;

import java.util.Scanner;

public class MathCombinations7_28 {
    public static void main(String[] args) {

       int [] niz = PomocnaKlasa.unesiNiz(10);

       mathCombinations(niz);

    }


    public static void mathCombinations(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j)
                    System.out.println(numbers[i] + " " + numbers[j]);
            }
        }
    }
}