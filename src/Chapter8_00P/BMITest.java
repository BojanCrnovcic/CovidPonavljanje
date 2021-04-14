package Chapter8_00P;

public class BMITest {
    public static void main(String[] args) {


        BMI bmi = new BMI("PERO",34,65,170.0);

        System.out.println("Ime: "+bmi.getIme()+" ; godine: "+bmi.getGodine()+" ; BMI status: "+bmi.getBMIStatus());
        System.out.println(bmi.getBMI());

    }
}
