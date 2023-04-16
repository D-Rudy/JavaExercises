import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float taux = 1.22f;
        int montant;

        System.out.println("Entrez le montant à convertir :");
        montant = input.nextInt();
        System.out.println(montant + " € équivaut à  " + montant * taux + " $.");
    }
}