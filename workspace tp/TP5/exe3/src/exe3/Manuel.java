/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe3;

/**
 *
 * @author Hamza
 */
public class Manuel extends Livre {
    int niv_scol; // niveau scolaire

    Manuel(int num, String tit, String a, int n_b, int ns) {
        super(num, tit, a, n_b);
        niv_scol = ns; // initialisation du niveau scolaire
    }

    public String toString() {
        return ("Manuel\t" + titre + "\t" + num_enreg + "\t" + auteur + "\t" + nbr_pg + "\t" + niv_scol);
    }

}

