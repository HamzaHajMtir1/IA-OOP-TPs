package tp4part1;

import java.util.Scanner;

public class Etudiant {
	String prenom;
	String nom;
	static double note1;
	static double note2;
	Scanner src=new Scanner(System.in);
	public Etudiant CreeObjetEtudiant() {
		Etudiant s = new Etudiant();
		System.out.println("donner le prenom d'etudiant : ");
		s.prenom=src.nextLine();
		System.out.println("donner le nom d'etudiant : ");
		s.nom=src.nextLine();
		System.out.println("donner le note1 d'etudiant : ");
		s.note1=src.nextDouble();
		System.out.println("donner le note2 d'etudiant : ");
		s.note2=src.nextDouble();
		return s;
	}
	public static double Moyenne() {
		return((note1+note2)/2);
	}
	public static void showEtudiant(Etudiant s) {
		System.out.println("le prenom de l'etudiant est "+s.prenom+" ,le nom de l'etudiant est "+s.nom+" ,la moyenne est egale "+Moyenne());
	}
	public boolean compareName(Etudiant S1,Etudiant S2) {
		if((S1.prenom==S2.prenom) && (S1.nom==S2.nom))
			return true;
		return false;	
	}
}
