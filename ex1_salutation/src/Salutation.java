import java.util.Scanner;

    public class Salutation {

        public static void main(String[] args) {

            //Declaration des variables
            String nom;
            Scanner sc = new Scanner(System.in);
            //Question à l'utilisateur

            System.out.print (" Quel est ton nom ? ");
            nom = sc.next();

            //Resultat
            System.out.print("Bonjour " + nom);
            sc.close();
        }
    }
