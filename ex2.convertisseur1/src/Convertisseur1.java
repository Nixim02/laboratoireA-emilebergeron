import java.util.Scanner;

public class Convertisseur1 {
    public static void main(String[] args) {

        //Declaration des variables
        double nbRAD;
        int nbDEG;
        Scanner sc = new Scanner(System.in);

        //Question à l'utilisateur
        System.out.print (" Quel est l'angle en radian ? ");
        nbRAD = sc.nextFloat();
        sc.close();

        // Operation
        nbDEG = (int) (nbRAD * 180 / Math.PI);

        //Resultat
        System.out.print("Valeur en degre : " + nbDEG);
    }
}

