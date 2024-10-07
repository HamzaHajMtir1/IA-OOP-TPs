/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author Hamza
 */
import java.util.Scanner;
public class Etudiant {
    String prenom;
    String nom;
    double d1;
    double d2;
    Scanner scanner = new Scanner(System.in);
    Etudiant CreeObjectEtudiant(){
        Etudiant s ;
        s.prenom = scanner.nextLine();
        s.nom = scanner.nextLine();
        s.d1 = scanner.nextDouble();
        s.d2 = scanner.nextDouble();
        return s;
    }
    double Moyenne(){
        return (this.d1+this.d2)/2;
    }
    void showEtudiant(Etudiant s){
        System.out.println("le prenom est "+s.prenom +"le nom "+s.nom+" le moyenn "+Moyenne());
    }
}
