/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe3;

/**
 *
 * @author Hamza
 */
public class Livre extends Document {
    String auteur;
    int nbr_pg;

    public Livre(int num, String tit, String a, int n_b) {
        super(num, tit);
        auteur = a;
        nbr_pg = n_b;
    }

    public String toString() {
        return ("Livre\t" + titre + "\t" + num_enreg + "\t" + auteur + "\t" + nbr_pg);
    }

}
