/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tejrab;

/**
 *
 * @author Hamza
 */
public class Enseignant extends Personne{
    
    public static double [] tauxsalaire = new double[]{40,42,43,44,46,50,52};
    public  Enseignant(String nom , String prenom ,String adresse){
        super(nom,prenom,adresse);
    }

    public static double[] getTauxsalaire() {
        return tauxsalaire;
    }

    public static void setTauxsalaire(double[] tauxsalaire) {
        Enseignant.tauxsalaire = tauxsalaire;
    }
    
    
}
