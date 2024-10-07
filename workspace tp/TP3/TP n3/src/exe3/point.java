package exe3;

public class point {
	
	public double x;
	public double y;

	public point(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	public void position()
	{
		System.out.println("le x = "+x+" et le y= "+y);
	}
	public double distance(point b)
	{
		return(Math.sqrt(x-b.x)*(x-b.x)+(y-b.x)*(y-b.y));
	}
	public static void main(String[] args) {
		point p1=new point(3.4,5.6);
		point p2=new point(2.5,3.6);
		p1.position();
		p2.position();
		System.out.println(p1.distance(p2));
	}
	
}
