package exe4;
import exe3.point;
public class rectangle {
	point p;
	int i;
	double longeur,largeur;
	public rectangle(point a ,point b)
	{   p=a;
		longeur=Math.abs(a.x-b.x);
		largeur=Math.abs(a.y-b.y);	
		i=i+1;
	}
	public rectangle(point p ,double longeur,double largeur) 
	{
		this.p=p;
		this.longeur=longeur;
		this.largeur=largeur;		
	}
	public double perimetre()
	{
		return (  2 * (largeur + longeur ));
	}
	public double surface()
	{
		return ( longeur * largeur);
	}
	
	public void translate(float dx , float dy)
	{
		p.x=dx;
		p.y=dy;
	}
	public boolean contient(point a)
	{
		return(a.x >= this.p.x && a.x <= this.p.x+longeur  && a.y >= this.p.y && a.y <= this.p.y +largeur);
	}
	public boolean egal(rectangle r)
	{
		return (r.longeur==this.longeur && r.largeur==this.largeur && r.longeur==longeur && r.largeur==largeur );
	}
	
	
}
