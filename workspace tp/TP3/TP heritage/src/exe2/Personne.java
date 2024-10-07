package exe2;

public class Personne {
	public String nom;
	public String prenom;
	public String addresse;
    
	public Personne(String nom,String prenom,String addresse)
	{
		this.nom=nom;
		this.prenom=prenom;
		this.addresse=addresse;
	}
	public String ToString(){
		return ("son nom "+nom+" son prenom "+prenom+" son addresse "+addresse );
	}
	public String getnom()
	{
		return nom;
	}
	public void setnom(nom)
	{
		this.nom=nom;
	}
	public String getprenom1()
	{
		return prenom;
	}
	public void getprenom(prenom)
	{
		this.prenom=prenom;
	}
	public String getaddresse()
	{
		return addresse;
	}
	public void setaddresse(addresse)
	{
		this.addresse=addresse;
	}
	
}
