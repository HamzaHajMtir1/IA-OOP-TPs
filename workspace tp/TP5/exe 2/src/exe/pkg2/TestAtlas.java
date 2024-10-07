/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe.pkg2;

/**
 *
 * @author Hamza
 */
import java.util.Scanner;

public class TestAtlas {

	public static void main(String[] args) {
		int i;
		int r;
		System.out.print("Donner le nombre de ville : ");
		Scanner nb = new Scanner(System.in);
		int n = nb.nextInt();

		Atlas t = new Atlas(n);

		for (i = 0; i < n; i++) {
			System.out.print("Donner le nom de la ville " + (i + 1) + " : ");
			Scanner no = new Scanner(System.in);
			String nom = no.nextLine();

			System.out.print("Donner le nombre d'habitant de la ville " + (i + 1) + " : ");
			Scanner n_h = new Scanner(System.in);
			int nbr_hab = n_h.nextInt();

			do {
				System.out.println("Est-ce une capitale?");
				System.out.println("\t1-Oui\t2-Non");
				Scanner re = new Scanner(System.in);
				r = re.nextInt();
			} while (r != 1 && r != 2);

			if (r == 1) {
				System.out.print("Donner le nom du pays : ");
				Scanner pa = new Scanner(System.in);
				String pays = pa.nextLine();
				Capitale c = new Capitale(nom, nombre , pays);
				t.insere(c);
			} else {
				ville v = new ville(nom, nbr_hab);
				t.insere(v);
			}

		}

		System.out.print("Donner la ville recherche : ");
		Scanner vi1 = new Scanner(System.in);
		String v1 = vi1.nextLine();

		ville ville = t.recherche(v1);
		if (ville != null)
			System.out.println(ville.nombre + " habitent dans " + ville.nom + " .");
		else
			System.out.println("Ville non trouve!");
	}

}

    }
    
}
