package exe2;

public class Eleve extends Personne {
   public String classe;
   public Eleve(String nom,String Prenom,String addresse,String classeclasse)
    {
        super(nom,prenom,addresse);
        this.classe=classeclasse;
    }

}
