package Chapter5;

public class SimulationHeadsOrTails5_40 {
    public static void main(String[] args) {

        System.out.println("Koliko ce puta novcic pasti na glavu ili pismo u milion pokusaja.");

        int pismo = 0;

        for (int i = 0; i < 1000000; i++) {
            int kovanica = (int) (Math.random() * 2);
            if (kovanica == 0) {
                pismo++;
            }

        }
        System.out.println("Novcic ce pasti " + pismo + " na pismo.");
        System.out.println("Novcic ce pasti " + (1000000 - pismo) + " na glavu.");
    }
}
