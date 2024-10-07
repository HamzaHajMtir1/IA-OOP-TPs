package exercice1;

public class Point {

	public double x , y;

	public Point(double c1 , double c2)
	{
		x=c1;
		y=c2;
	}


	void position()
	{
		System.out.println("("+x+","+y+")");
	}

	double distance(Point n)
	{
		double d = Math.sqrt((this.x-n.x)*(this.x-n.x)+Math.pow(this.y-n.y , 2));
		return(d);
	}

}
