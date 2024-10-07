/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer1;

/**
 *
 * @author Hamza
 */
public class CrayonCouleur extends Crayon {
    private String couleur;

    public CrayonCouleur(String couleur, int epaisseur, int longeure) {
        super(epaisseur, longeure);
        this.couleur = couleur;
    }
    
    public void change_couleure(String couleur)
    {
        this.couleur=couleur;
    }
    public void changeCaracteristique(int longeure,int epaisseur, String couleur)
    {
        changer_longeure(longeure);
        changeEpaisseur(epaisseur);
        change_couleure(couleur);
    }
    @Override
    public String description()
    {
        return super.description()+" et le couleur c'est "+couleur;
    }
    
}
