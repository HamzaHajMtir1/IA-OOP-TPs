package compteBank;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//first account ****************************
		Scanner sc=new Scanner(System.in);
        
        System.out.println("nom :");
        String nom = sc.nextLine();
       
        System.out.println("solde init:");
        double solde = sc.nextDouble();
        while(solde<20){
        System.out.println("solde init doit etre > 20:");
        solde = sc.nextDouble();
        }
        
        System.out.println("montant max:");
        double mtMax = sc.nextDouble();
        
        Compte c1=new Compte(nom,mtMax,solde);
        System.out.println("----------------------------");
        //second account ****************************
        Scanner s=new Scanner(System.in);
        
        System.out.println("nom :");
        String nom1 = s.nextLine();
        
        System.out.println("solde init:");
        double solde1 = s.nextDouble();
        while(solde<20){
        System.out.println("solde init doit etre > 20:");
        solde = sc.nextDouble();
        }
        
        System.out.println("montant max:");
        double mtMax1 = s.nextDouble();
    
        Compte c2=new Compte(nom1,mtMax1,solde1);
        
        //Withdraw money from C1 ***************************
        System.out.println("----------------------------");
        System.out.println("Retrait de :");
        double mtRt = sc.nextDouble();
        c1.debiter(mtRt);
        
        //Withdraw money from C2 ***************************
        System.out.println("----------------------------");
        System.out.println("Retrait de :");
        double mtRt1 = sc.nextDouble();
        c2.debiter(mtRt1);
        
        //Deposit money in C1 **************************
        System.out.println("----------------------------");
        System.out.println("Dépot de :");
        double mtdp = sc.nextDouble();
        c1.crediter(mtdp);
        
        //show accounts details ******************
        System.out.println("----------------------------");
        c1.details();
        c2.details();
       
        // transfer from c1 to c2 *****************
        System.out.println("----------------------------");
        System.out.println("transfert de :");
        double trf = sc.nextDouble();
        c1.virerVers(c2, trf);
        
        //show accounts details ******************
        System.out.println("----------------------------");
        c1.details();
        c2.details();
        
		

	}

}
