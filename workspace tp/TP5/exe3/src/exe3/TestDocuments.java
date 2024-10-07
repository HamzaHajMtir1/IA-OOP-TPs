/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe3;

/**
 *
 * @author Hamza
 */

import java.util.Scanner;

public class TestDocuments {

	public static void main(String[] args) {
		int i;
		System.out.print("Donner le nombre de documents � entr�s : ");
		Scanner nb = new Scanner(System.in);
		int n = nb.nextInt();

		Bibliotheque b = new Bibliotheque(n);

		for (i = 0; i < n; i++) {
			System.out.println("Donner la nature du document " + (i + 1) + " :");
			System.out.println("\t 1-Livre\t 2-Revue\t 3-Dictionnaire");
			Scanner na = new Scanner(System.in);
			int nat = na.nextInt();

			System.out.print("\tDonner le numero d'enregistrement : ");
			Scanner nbre = new Scanner(System.in);
			int nbr = nbre.nextInt();

			System.out.print("\tDonner le titre : ");
			Scanner tit = new Scanner(System.in);
			String t = tit.nextLine();

			if (nat < 0 || n > n)
				System.out.println("\tNumero incorrect!");
			else {
				switch (nat) {
					case 1: {
						System.out.print("\tDonner le nom de l'auteur : ");
						Scanner au = new Scanner(System.in);
						String a = au.nextLine();

						System.out.print("\tDonner le nombre de page : ");
						Scanner np = new Scanner(System.in);
						int n_p = np.nextInt();

						System.out.println("\tDonner le type du livre :");
						System.out.println("\t\t 1-Roman \t 2-Manuel \t 3-Aucun");
						Scanner ro = new Scanner(System.in);
						int r = ro.nextInt();

						if (r == 1) {
							System.out.println("\tDonner le prix litterature : ");
							System.out.println("\t\t 1-Goncourt \t 2-Medicis \t 3-Nobel \t 4-Aucun");
							Scanner pl = new Scanner(System.in);
							int p_l = pl.nextInt();

							Roman rom = new Roman(nbr, t, a, n_p, p_l);
							b.ajouter(rom);
						}

						else if (r == 2) {
							System.out.print("\tDonner le niveau scolaire : ");
							Scanner ns = new Scanner(System.in);
							int n_s = ns.nextInt();

							Manuel man = new Manuel(nbr, t, a, n_p, n_s);
							b.ajouter(man);
						} else {
							Livre liv = new Livre(nbr, t, a, n_p);
							b.ajouter(liv);
						}
					}
						break;
					case 2: {
						int m = 1;
						int a = 1;
						System.out.print("\tDonner le mois : ");
						Scanner mois = new Scanner(System.in);
						m = mois.nextInt();

						System.out.print("\tDonner l'ann�e : ");
						Scanner an = new Scanner(System.in);
						a = an.nextInt();

						Revue rev = new Revue(nbr, t, m, a);
						b.ajouter(rev);
					}
						break;
					case 3: {
						System.out.println("\tDonner la langue : ");
						System.out.println("\t\t 1-Anglais \t 2-Fran�ais \t 3-Espagnol \t 4-Allemand \t 5-Autre");
						Scanner lan = new Scanner(System.in);
						int l = lan.nextInt();

						Dictionnaire dic = new Dictionnaire(nbr, t, l);
						b.ajouter(dic);
					}
						break;
				}
			}
		}

		System.out.println("Documents qui se trouvent dans la bibliotheque :");
		b.afficherDocuments();

		System.out.println("Les auteurs des livres qui se trouvent dans la bibliotheque :");
		b.afficherAuteurs();

		System.out.print("Donner le num�ro du document recherch� : ");
		Scanner nu = new Scanner(System.in);
		int num = nu.nextInt();

		if (b.document(num) == null)
			System.out.println("Document Introuvable!");
		else
			System.out.println("Document de titre " + b.d[num - 1].titre + " et de num�ro d'enregistremetn "
					+ b.d[num - 1].num_enreg + " .");
	}

}

