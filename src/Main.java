import models.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*


        Mobile mob1 = new Mobile();
        mob1.brand= "Apple";
        mob1.price = 1500;
        //mob1.name= "Phone";



        Mobile mob2 = new Mobile();
        mob2.brand= "Samsung";
        mob2.price = 2100;
        //mob2.name = "tlp";

        Mobile mob3 = new Mobile("HP",5000);

        mob1.affiche();
        mob2.affiche();
        mob3.affiche();

        //Mobile.affiche2(mob1);

        Human h1 = new Human();

        h1.setName("Ali");
        h1.setAge(25);

        System.out.println(h1.getName()+" : "+h1.getAge());
*/
/*

        //Exercice 1:

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le titre du livre : ");
        String titre = sc.next();
        System.out.print("Entrez l'auteur du livre : ");
        String auteur = sc.next();
        System.out.print("Entrez la disponibilite du livre : ");
        boolean dispo = sc.nextBoolean();

        Livre livre = new Livre(titre,auteur,dispo);
        livre.showDetails();

        System.out.println();
        System.out.println("Premier empreint :");
        livre.emprunter();
        livre.showDetails();
        System.out.println();
        System.out.println("Deuxieme empreint :");
        livre.emprunter();
        livre.showDetails();
        System.out.println();
        System.out.println("Premier retour :");
        livre.retourner();
        livre.showDetails();
        System.out.println();
        System.out.println("Deuxieme retour :");
        livre.retourner();
        livre.showDetails();*/

        //exercice 2

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le numero du compte : ");
        String numero = sc.next();
        System.out.print("Entrez le solde initial du compte : ");
        double solde = sc.nextDouble();

        CompteBancaire cb = new CompteBancaire(numero,solde);

        System.out.println();
        System.out.println("1er depot");
        cb.deposer(1000);
        System.out.println();
        System.out.println("1er retrait");
        cb.retirer(1000);
        System.out.println();
        System.out.println("2eme retrait");
        cb.retirer(1000);
        System.out.println();
        System.out.println("3eme retrait");
        cb.retirer(100);
    }
}