package models;

public class CompteBancaire {

    private String numeroCompte;
    private double solde;

    public CompteBancaire(String numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void deposer(double montant){
        solde += montant;
        System.out.println("Votre transaction de depot est effectuee avec succes ! \n Votre nouveau solde est : "+ solde);
    }

    public void retirer(double montant){
        if (solde>=montant){
            solde -= montant;
            System.out.println("Votre transaction de retrait est effectuee avec succes ! \n Votre nouveau solde est : "+ solde);
        }else{
            System.out.println("Solde Insuffisant");
        }
    }
}
