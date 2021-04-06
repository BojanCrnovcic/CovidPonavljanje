package Chapter7;

import java.util.Arrays;

public class IdenticalArrays7_27 {
    public static void main(String[] args) {
        int [] listaJedan = PomocnaKlasa.unesiNiz(6);
        int [] listaDva = PomocnaKlasa.unesiNiz(6);

        if (equals(listaJedan,listaDva)){
            System.out.println("Liste su jednake.");
        }else System.out.println("Liste nisu jednake.");
    }


    public static boolean equals(int[] list1, int[] list2){
        Arrays.sort(list1);
        Arrays.sort(list2);
        for (int i = 0; i < list1.length; i++){
            if (list1[i] != list2[i]){
                return false;
            }
        }
return true;
    }
}
