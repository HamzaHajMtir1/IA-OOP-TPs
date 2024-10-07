package exe2;

public class Vecteur
{
    private int n;
    private double scal[];
    vect(int n)
    {
        scal= new double[n];
    }
    vect(int n,double x)
    {
        this(n);
        for(double i:scal)
        {
            i=x;
        }
    }
    vect(double[] v)
    {
        this(v.length,0);
        for(int i=0;i<v.length;i++)
        {
            scal[i]=v[i];
        }
    }
    public double prod(vect b)
    {
        vect a=this;
        int lim;
        double sum=0;
        if (a.scal.length!=b.scal.length)
        {
            return(0);
        }
        else
        {
            for(int i=0;i<a.scal.length;i++)
            {
                sum+=a.scal[i]*b.scal[i];
            }
        }
        return(sum);
    }
    public static double somme(vect a,vect b)
    {
        double s=0;
        if(a.scal.length!=b.scal.length)
        {
            return(0);
        }
        else
        {
            for(int i=0;i<a.scal.length;i++)
            {
                s=a.scal[i]+b.scal[i];
            }
        }
        return(s);
    }
}
