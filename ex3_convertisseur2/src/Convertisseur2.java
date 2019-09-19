import java.util.Scanner;
import java.text.DecimalFormat;

public class Convertisseur2 {
    public static void main(String[] args) {

        //Declaration des variables
        double nbRAD;
        int nbDEG;
        Scanner sc = new Scanner(System.in);

        //Question à l'utilisateur
        System.out.print (" Quel est l'angle en degre ? ");
        nbDEG = sc.nextInt();
        sc.close();

        // Operation
        nbRAD = (float) (nbDEG *Math.PI/180);

        //Deux decimales
        DecimalFormat df = new DecimalFormat("#.##");

        //Resultat
        System.out.print("Valeur en radian : " + df.format(nbRAD));
    }
}


