/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe3;

/**
 *
 * @author Hamza
 */

public class Revue extends Document {
	int mois;
	int an;

	public Revue(int num, String tit, int m, int a) {
		super(num, tit);
		mois = m;
		an = a;
	}

	public String toString() {
		return ("Revue\t" + titre + "\t" + num_enreg + "\t" + mois + "\t" + an);
	}

}

