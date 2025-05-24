package CorrectionExamens.ExamenJavaTic12024;

class CompteBancaire {
    private String numeroCompte;
    private double solde;

    public CompteBancaire(String numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }
    public void setSolde(double montant) {
        solde = montant;
    }
    public double getSolde() {
        return solde;
    }
    public void retrait(double montant) {
        if (montant > solde) {
            throw new SoldeInsuffisantException("Fonds Insuffisants");
        }
        else {
            solde -= montant;
            System.out.println(montant + " retiré avec succès.");
        }
    }
    public void depot(double montant) {
        solde += montant;
        System.out.println(montant + " déposé avec succès.");
    }
}
public class Exercice1 {
    public static void main(String[] args){
        CompteBancaire cb1 = new CompteBancaire("126699", 100);
//        try{
//            cb1.retrait(180);
//        }catch(SoldeInsuffisantException e){
//            System.out.println(e.getMessage());
//        }
        cb1.retrait(180);
        System.out.println("Goodbye");
    }
}
