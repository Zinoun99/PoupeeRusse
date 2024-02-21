import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // insert the size the doll
        PoupeeRusse p1 = new PoupeeRusse("Poupe 1", "white", 40);
        PoupeeRusse p2 = new PoupeeRusse("Poupe 2", "black", 30);
        PoupeeRusse p3 = new PoupeeRusse("Poupe 3", "blue", 20);

        int choice, numPoupee;
        do {
            System.out.println("\t\t\t||======================================================================||");
            System.out.println("\t\t\t||------------|              Gestion Poupée Russe           |-----------||");
            System.out.println("\t\t\t||======================================================================||");
            System.out.println("\t\t\t||------------|   1: Ouvre la poupée                        |-----------||");
            System.out.println("\t\t\t||------------|   2: Ferme la poupée                        |-----------||");
            System.out.println("\t\t\t||------------|   3: Place la poupée dans une autre poupée  |-----------||");
            System.out.println("\t\t\t||------------|   4: Sort la poupée d'une autre poupée      |-----------||");
            System.out.println("\t\t\t||------------|   5: Quitter application                    |-----------||");
            System.out.println("\t\t\t||======================================================================||");
            System.out.println("\t\t\t||\t\tName : " + p1.getName() + "\t\tColor : " + p1.getColor() + "\t\tSize : " + p1.getTaille() + "\t\t\t\t||");
            System.out.println("\t\t\t||----------------------------------------------------------------------||");
            System.out.println("\t\t\t||\t\tName : " + p2.getName() + "\t\tColor : " + p2.getColor() + "\t\tSize : " + p2.getTaille() + "\t\t\t\t||");
            System.out.println("\t\t\t||----------------------------------------------------------------------||");
            System.out.println("\t\t\t||\t\tName : " + p3.getName() + "\t\tColor : " + p3.getColor() + "\t\tSize : " + p3.getTaille() + "\t\t\t\t||");
            System.out.println("\t\t\t||======================================================================||");

            System.out.println("Enter votre choix: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Numéro de la poupée à ouvrir (1 : Poupe 1, 2 : Poupe 2, 3: Poupe 3) : ");
                    numPoupee = sc.nextInt();
                    dollToOpen(numPoupee, p1, p2, p3);
                    break;
                case 2:
                    System.out.print("Numéro de la poupée à ferme (1 : Poupe 1, 2 : Poupe 2, 3: Poupe 3) : ");
                    numPoupee = sc.nextInt();
                    dollToClose(numPoupee, p1, p2, p3);
                    break;
                case 3:
                    System.out.print("Numéro de la poupée à placer (1 : Poupe 1, 2 : Poupe 2, 3: Poupe 3) : ");
                    int numDollPlace = sc.nextInt();
                    System.out.print("Numéro de la poupée dans laquelle vous voulez placer (1 : Poupe 1, 2 : Poupe 2, 3: Poupe 3) : ");
                    int numDollDestination = sc.nextInt();
                    placeInDoll(numDollPlace, numDollDestination, p1, p2, p3);
                    break;
                case 4:
                    System.out.print("Numéro de la poupée à Sortir (1 : Poupe 1, 2 : Poupe 2, 3: Poupe 3) : ");
                    int numDollOut = sc.nextInt();
                    System.out.print("Le numéro de la poupée que vous souhaitez extraire (1 : Poupe 1, 2 : Poupe 2, 3: Poupe 3) : ");
                    int numDestination = sc.nextInt();
                    OutInDoll(numDollOut, numDestination, p1, p2, p3);
                    break;
            }
        }while (choice != 5);
    }

    private static void placeInDoll(int numPoupee, int sizeDestination, PoupeeRusse p1, PoupeeRusse p2, PoupeeRusse p3) {
        if (numPoupee == 1 && sizeDestination == 2){
            p1.placerDans(p2);
        }
        else if (numPoupee == 1 && sizeDestination == 3){
            p1.placerDans(p3);
        }
        else if (numPoupee == 2 && sizeDestination == 1){
            p2.placerDans(p1);
        }
        else if (numPoupee == 2 && sizeDestination == 3){
            p2.placerDans(p3);
        }
        else if (numPoupee == 3 && sizeDestination == 1){
            p3.placerDans(p1);
        }
        else if (numPoupee == 3 && sizeDestination == 2){
            p3.placerDans(p2);
        }
        else {
            System.out.println("impossible");
        }
    }

    private static void OutInDoll(int indexP, int DestinationP, PoupeeRusse p1, PoupeeRusse p2, PoupeeRusse p3) {
        if (indexP == 1 && DestinationP == 2){
            p1.sortirDans(p2);
        }
        else if (indexP == 1 && DestinationP == 3){
            p1.sortirDans(p3);
        }
        else if (indexP == 2 && DestinationP == 1){
            p2.sortirDans(p1);
        }
        else if (indexP == 2 && DestinationP == 3){
            p2.sortirDans(p3);
        }
        else if (indexP == 3 && DestinationP== 1){
            p3.sortirDans(p1);
        }
        else if (indexP == 3 && DestinationP == 2){
            p3.sortirDans(p2);
        }
        else {
            System.out.println("impossible");
        }
    }

    public static void dollToOpen(int numPoupee, PoupeeRusse p1, PoupeeRusse p2, PoupeeRusse p3){
        if (numPoupee == 1){
            p1.ouvrir();
        }
        else if (numPoupee == 2){
            p2.ouvrir();
        }
        else {
            p3.ouvrir();
        }
    }

    public static void dollToClose(int numDoll, PoupeeRusse p1, PoupeeRusse p2, PoupeeRusse p3){
        if (numDoll == 1){
            p1.fermer();
        }
        else if (numDoll == 2){
            p2.fermer();
        }
        else {
            p3.fermer();
        }
    }
}