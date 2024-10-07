/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe3;

/**
 *
 * @author Hamza
 */
public class Bibliotheque {
	Document d[];
	static int nb;
	int i;

	Bibliotheque(int cap) {
		d = new Document[cap];
		nb = 0;
	}

	void afficherDocuments() {
		for (i = 0; i < nb; i++) {
			System.out.println("\t" + d[i].toString());
		}
	}

	void afficherAuteurs() {
		for (i = 0; i < nb; i++) {
			if (d[i] instanceof Livre) {
				Livre liv = (Livre) d[i];
				System.out.println("\t" + liv.auteur);
			}
		}
	}

	boolean ajouter(Document doc) {
		d[nb] = doc;
		nb += 1;
		if (d[nb - 1] == doc)
			return (true);
		else
			return (false);
	}

	Document document(int j) {
		if (j > 0 && j <= nb)
			return (d[j - 1]);
		else
			return (null);
	}

	boolean supprimer(Document doc) {
		int k;
		int h = 0;
		Document aux;
		boolean b = false;
		if (nb == 0)
			System.out.println("Tableau vide!");
		else {
			for (k = 0; k < nb; k++) {
				if (d[k] == doc) {
					h = k;
					while (h >= k && h < nb) {
						aux = d[h];
						d[h] = d[h + 1];
						d[h + 1] = aux;
						nb -= 1;
						h += 1;
					}
					b = true;
				} else
					b = false;
			}
		}
		return (b);
	}

}

}
