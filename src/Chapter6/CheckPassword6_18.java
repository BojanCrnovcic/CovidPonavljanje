package Chapter6;

public class CheckPassword6_18 {
    public static void main(String[] args) {
       valid("rth");
    }


    public static boolean valid(String password){
        final int VELICNINAKARAKTERA = 8;

        if (password.length()>VELICNINAKARAKTERA){
            System.out.println("Nedovoljno karaktera.");
            return false;
        }
        for (int i = 0; i < password.length(); i++){
            if (!Character.isLetterOrDigit(password.charAt(i))){
                System.out.println("Nevazeci karakteri.");
                return false;
            }
        }
        System.out.println("Valdina sifra. ");
       return true;
    }



    }

