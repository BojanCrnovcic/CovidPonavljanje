package Chapter4;

import java.util.Scanner;

public class StudentMajorAndStatus4_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String unos = input.next();

        char major = unos.charAt(0),  status = unos.charAt(1);

        String predmeti = "" , ocjene = "";


        switch (major) {
            case 'M': {
                predmeti += "Mathematics";
            }
            break;
            case 'C': {
                predmeti += "Computer Science";
            }
            break;
            case 'I': {
                predmeti += "Information Technology";
            }
            break;
        }

        switch (status){
            case '1': {
                ocjene+="Freshman";
            }break;
            case '2': {
                ocjene+="Sophomore";
            }break;
            case '3': {
                ocjene+="Junior";
            }break;
            case '4': {
                ocjene+="Senior";
            }break;




        }

        System.out.println(predmeti+" "+ocjene);

    }
}
