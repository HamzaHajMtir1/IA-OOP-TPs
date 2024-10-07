/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe.pkg2;

/**
 *
 * @author Hamza
 */
public class Capitale extends ville {
    public String paye;

    public Capitale(String paye, String nom, int nombre) {
        super(nom, nombre);
        this.paye = paye;
    }
    public String obtenirInformations() {
		return (super.obtenirInformation() +"le paye est  + "+paye);
	}
}
