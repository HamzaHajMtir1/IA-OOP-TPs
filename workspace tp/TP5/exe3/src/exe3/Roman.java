/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe3;

/**
 *
 * @author Hamza
 */
public class Roman extends Livre {
	int prix_litt;

	public Roman(int num, String tit, String a, int n_b, int pl) {
		super(num, tit, a, n_b);
		prix_litt = pl;
	}

	public String toString() {
		return ("Roman\t" + titre + "\t" + num_enreg + "\t" + auteur + "\t" + nbr_pg + "\t" + prix_litt);
	}

}
