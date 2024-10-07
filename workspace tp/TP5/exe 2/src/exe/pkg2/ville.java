/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe.pkg2;

/**
 *
 * @author Hamza
 */
public class ville {
    public String nom;
    public int nombre;

    public ville(String nom, int nombre) {
        this.nom = nom.toUpperCase();
        this.nombre = Math.abs(nombre);
    }
    
    public String obtenirInformation() {
		return "le nom du ville est : " + nom + " est son nombre d'abitants dans cette ville est : " + nombre;
	}
        
}

