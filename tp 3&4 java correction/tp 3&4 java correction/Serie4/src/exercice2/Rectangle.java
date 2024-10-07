package exercice2;
import exercice1.Point;

public class Rectangle {
	public Point base;
	double lon , lar;
	
	public Rectangle(Point p , Point p1)
	{
		base=p;
		lar=p1.y-p.y;
		lon=p1.x-p.x;
	}
	
	public Rectangle(Point p , double ln , double lr)
	{
		base=p;
		lar=lr;
		lon=ln;
	}
	
	double perimetre()
	{	
		return((lon+lar)*2);
	}
	
	public double surface()
	{
		return(lon*lar);
	}
	
	public void translate(double dx , double dy)
	{
		base.x+=dx;
		base.y+=dy;
	}
	
	void contient(Point m)
	{
		if(m.x>=base.x && m.x<=base.x+lon && m.y>=base.y && m.y<=base.y+lar)
			System.out.println("Le point est à l'interieur du rectangle");
		else
			System.out.println("Le point n'est pas à l'interieur du rectangle");
	}
	
	void contient1(Rectangle R1)
	{
		if(R1.base.x>=this.base.x && R1.base.x+R1.lon>=this.base.x+this.lon && R1.base.y>=this.base.y && R1.base.y+R1.lar>=this.base.x+this.lar)
			System.out.println("R1 est dans R");
		else
			System.out.println("R1 n'est pas dans R");
	}
	
	void egal(Rectangle R1)
	{
		if(R1.base.x==this.base.x && R1.base.y==this.base.y && this.lon==R1.lon && this.lar==R1.lar)
			System.out.println("R et R1 sont égaux");
		else
			System.out.println("R et R1 ne sont pas égaux");
	}
		
}
