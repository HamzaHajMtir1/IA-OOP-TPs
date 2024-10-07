/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe3;

/**
 *
 * @author Hamza
 */
public class Dictionnaire extends Document {
	int langue;

	Dictionnaire(int num, String tit, int l) {
		super(num, tit);
		langue = l;
	}

	public String toString() {
		return ("Dictionnaire\t" + titre + "\t" + num_enreg + "\t" + langue);
	}

}
