/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe3;

/**
 *
 * @author Hamza
 */
public class Document {
	int num_enreg;
	String titre;

	Document(int num, String tit) {
		num_enreg = num;
		titre = tit;
	}

	public String toString() {
		return ("Document\t" + titre + "\t" + num_enreg);
	}

}