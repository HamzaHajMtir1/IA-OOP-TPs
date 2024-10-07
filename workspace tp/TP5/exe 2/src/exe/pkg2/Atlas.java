/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe.pkg2;

/**
 *
 * @author Hamza
 */
import exe.pkg2.ville;

public class Atlas {
    public ville t[];
    int nbr;

    Atlas(int n) {
		t = new ville[n];
		nbr = 0;
	}
    
    void insere(ville v){
        t[nbr] = v;
        nbr++;
    }
    
    ville recherche(String cle) {
        int i=0;
        ville v = null;
        while (i < t.length)
        {
            if(t[i].nom == cle)
                v= t[i];
            else
                i++;
        }
        return v;
    }
}
