package Exceptions.Seriesexercices;

import java.util.Scanner;

class SoldeInsuffisantException extends Exception {
    public SoldeInsuffisantException(String message) {

        super(message);
    }
}


class CompteBancaire {
    private double solde;

    public CompteBancaire(double soldeInitial) {

        this.solde = soldeInitial;
    }

    public double getSolde() {
        return solde;
    }

    public void retirer(double montant) throws SoldeInsuffisantException {
        if (montant > solde) {
            throw new SoldeInsuffisantException("Solde insuffisant pour effectuer le retrait.");
        }
        solde -= montant;
    }
}

public class Exercice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CompteBancaire compte = new CompteBancaire(500.0);

        System.out.println("Solde initial : " + compte.getSolde() + " TND");

        System.out.print("Entrez le montant à retirer : ");
        double montant = scanner.nextDouble();

        try {
            compte.retirer(montant);
            System.out.println("Retrait effectué avec succès !");
            System.out.println("Nouveau solde : " + compte.getSolde() + " TND");
        } catch (SoldeInsuffisantException e) {
            System.out.println("Erreur : " + e.getMessage());
            System.out.println("Solde actuel : " + compte.getSolde() + " TND");
        }
    }
}

