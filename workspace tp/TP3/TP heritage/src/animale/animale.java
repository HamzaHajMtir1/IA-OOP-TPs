package animale;

public class animale {
	public String race;
	public String nom;
	public String bruit;
	
	public animale(String race, String nom, String bruit) {
        this.race = race;
        this.nom = nom;
        this.bruit = bruit;
    }


	public String toString()
	{
		return("son nom "+nom+" sa race "+race+" le bruit qui fait est "+bruit);
	}

}