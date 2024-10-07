package tp4part1;
import java.util.Scanner;

import tp4part1.Etudiant;
public class Test {
	public static void main(String[] args) {
	Scanner src=new Scanner(System.in);
	boolean test=false;
	Etudiant S1=new Etudiant();
	S1=S1.CreeObjetEtudiant();
	S1.showEtudiant(S1);
	Etudiant S2=new Etudiant();
	System.out.println("donner le prenom d'etudiant : ");
	S2.prenom=src.nextLine();
	System.out.println("donner le nom d'etudiant : ");
	S2.nom=src.nextLine();
	System.out.println("donner le note1 d'etudiant : ");
	S2.note1=src.nextDouble();
	System.out.println("donner le note2 d'etudiant : ");
	S2.note2=src.nextDouble();
	if(S1.nom==S2.nom)
		test=true;
	else
	{
		if(S1.Moyenne()>S2.Moyenne())
			S1.showEtudiant(S1);
		else if(S1.Moyenne()<S2.Moyenne())
			S2.showEtudiant(S2);
		else
		{
			S1.showEtudiant(S1);
			S2.showEtudiant(S2);
		}
	}
	System.out.println("donner le nombre totale des etudiants : ");
	int n=src.nextInt(); 
	Etudiant ListeEtudiant[];
	ListeEtudiant =new Etudiant[n];
	for(int i=0;i<n;i++)
	{
		ListeEtudiant[i]=ListeEtudiant[i].CreeObjetEtudiant();
	}
	for(int i=0;i>n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(ListeEtudiant[i].Moyenne() < ListeEtudiant[j].Moyenne())
			{
				Etudiant aux = ListeEtudiant[i];
				ListeEtudiant[i]=ListeEtudiant[j];
				ListeEtudiant[j]=aux;
			}
		}
	}
	for(int i=0;i<n;i++)
	{
		Etudiant.showEtudiant(ListeEtudiant[i]);
	}
}
}
