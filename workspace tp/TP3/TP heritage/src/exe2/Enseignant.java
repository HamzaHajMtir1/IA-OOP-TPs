package exe2;

public class Enseignant extends Personne{
    public int echelon;
    public double nbheure;
    public static double tauxsalaire[] =new double[]{40,42,43,44,46,50,52};
    public Enseignant(String nom,String prenom,String addresse,int echelon,double nbheure)
    {
        super(nom,prenom,addresse);
    
    this.echelon=echelon;
    this.nbheure=nbheure;
    }
    public void name() {
        
    }
}
