package exe1;

public class Compte
{
    static int n=0;
    static double init=20;
    private int numero;
    private double solde;
    String nom;

    double max;
    public Compte(double s,String no,double m)
    {
        numero=++n;
        solde=s;
        nom=no;
        max=m;
    }
    public void crediter(double t)
    {
        if(t>0)
        {
            solde+=t;
        }
        else
        {
            System.out.println("t negative ");
        }
    }
    public void debiter(double t)
    {
        if(t<0)
        {
            System.out.println("t negative");
        } else if (t>max)
        {
            System.out.println("t max");
        }
        else
        {
            solde-=t;
        }
    }
    public static void virer(Compte a,Compte b,double m)
    {
        a.solde+=m;
        b.solde-=m;
    }
    public void cara()
    {
        System.out.println("Nom: "+nom+" solde: "+solde+" max: "+max+" numero: "+numero);
    }
}

}
