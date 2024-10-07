/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe3;

/**
 *
 * @author Hamza
 */

public class Livrotheque {
	Livre l[];
	static int nb;
	int i;

	Livrotheque(int cap) {
		l = new Livre[cap];
		nb = 0;
	}

	void afficherLivres() {
		for (i = 0; i < nb; i++) {
			System.out.println(l[i].toString());
		}
	}

	void afficherAuteurs() {
		for (i = 0; i < nb; i++) {
			System.out.println(l[i].auteur);
		}
	}

	boolean ajouter(Livre liv) {
		l[nb] = liv;
		if (l[nb] == liv)
			return (true);
		else
			return (false);
	}

	Livre livre(int j) {
		if (j > 0 && j <= nb)
			return (l[j]);
		else
			return (null);
	}

	boolean supprimer(Livre liv) {
		int k;
		int h = 0;
		Livre aux;
		boolean b = false;
		for (k = 0; k < nb; k++) {
			if (l[k] == liv) {
				h = k;
				while (h >= k && h < nb) {
					aux = l[h];
					l[h] = l[h + 1];
					l[h + 1] = aux;
					h += 1;
				}
				b = true;
			} else
				b = false;
		}
		return (b);
	}

}

