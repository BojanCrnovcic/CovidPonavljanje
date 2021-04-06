package Chapter7;

import java.util.Arrays;

public class EliminateDuplicates7_15 {
    public static void main(String[] args) {

        int[] niz = PomocnaKlasa.unesiNiz(10);
        System.out.println("Integeri bez duplikata su: " + eliminateDuplicates(niz));
    }


    public static int[] eliminateDuplicates(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int k = 0; k < list.length; k++) {

            }
        }
        Arrays.sort(list);
        return list;
    }

}