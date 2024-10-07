/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tejrab;

/**
 *
 * @author Hamza
 */
public class Personne {
	private String nom, prenom, adresse;
	public String getnom(){ return nom;}
	
	public String getprenom(){ 
		return prenom;}
	public String getadresse(){ 
		return adresse;}
	public void setnom(String name){ 
		this.nom=name;}
	public void setprenom(String pre){ 
		this.prenom=pre;}
	public void setadresse(String adr){ 
		this.adresse=adr;}
	public Personne(String a, String b, String c){
		this.nom=a;
		this.prenom=b;
		this.adresse=c;
	}
	public String ToString(){
		String s= nom+""+prenom+""+adresse;
		return s;
	}
	
