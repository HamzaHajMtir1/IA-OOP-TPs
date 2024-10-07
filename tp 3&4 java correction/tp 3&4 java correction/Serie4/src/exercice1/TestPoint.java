package exercice1;
import java.util.Scanner;

public class TestPoint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Donner les param�tres de m :");
		System.out.print("x1=");
		Scanner s=new Scanner (System.in);
		double x1=s.nextDouble();
		System.out.print("y1=");
		Scanner t=new Scanner (System.in);
		double y1=t.nextDouble();
		
		System.out.println("Donner les param�tres de n :");
		System.out.print("x2=");
		Scanner p=new Scanner (System.in);
		double x2=p.nextDouble();
		System.out.print("y2=");
		Scanner q=new Scanner (System.in);
		double y2=q.nextDouble();
		
		Point m=new Point(x1,y1);
		Point n=new Point(x2,y2);
		
		System.out.print("m");
		m.position();
		System.out.print("n");
		n.position();
		
		System.out.println("Distance="+m.distance(n));
		
	}
}
