package exercice2;
import java.util.Scanner;
import exercice1.Point;

public class TestRectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Donner les paramètres de R1 :");
		System.out.println("\tDonner les coordonnées du point de base :");
		System.out.print("\tx1=");
		Scanner s=new Scanner (System.in);
		double x1=s.nextDouble();
		System.out.print("\ty1=");
		Scanner t=new Scanner (System.in);
		double y1=t.nextDouble();
		System.out.print("\tLongueur=");
		Scanner j=new Scanner (System.in);
		double ln1=j.nextDouble();
		System.out.print("\tLargeur=");
		Scanner k=new Scanner (System.in);
		double lr1=k.nextDouble();
				
		System.out.println("Donner les paramètres de R2 :");
		System.out.println("\tDonner les coordonnées du point de base :");
		System.out.print("\tx2=");
		Scanner l=new Scanner (System.in);
		double x2=l.nextDouble();
		System.out.print("\ty2=");
		Scanner r=new Scanner (System.in);
		double y2=r.nextDouble();
		System.out.print("\tLongueur=");
		Scanner m=new Scanner (System.in);
		double ln2=m.nextDouble();
		System.out.print("\tLargeur=");
		Scanner n=new Scanner (System.in);
		double lr2=n.nextDouble();
		
		Point p1=new Point(x1,y1);
		Point p2=new Point(x2,y2);
		
		Rectangle R=new Rectangle(p1,ln1,lr1);
		Rectangle R1=new Rectangle(p2,ln2,lr2);

		System.out.println("Perimetre R1="+R.perimetre());
		System.out.println("Perimetre R2="+R1.perimetre());
		
		System.out.println("Surface R1="+R.surface());
		System.out.println("Surface R2="+R1.surface());
		
		System.out.println("\tDonner les coordonnées d'un point cherché :");
		System.out.print("\tx=");
		Scanner h=new Scanner (System.in);
		double x=h.nextDouble();
		System.out.print("\ty=");
		Scanner v=new Scanner (System.in);
		double y=v.nextDouble();
		Point f=new Point(x,y);
		
		R.contient(f);	
		
		R.egal(R1);
		
		System.out.println("Donner les valeurs de translation :");
		System.out.print("\ttx = ");
		Scanner a=new Scanner (System.in);
		double tx=a.nextDouble();
		System.out.print("\tty = ");
		Scanner b=new Scanner (System.in);
		double ty=b.nextDouble();
		R.translate(tx,ty);
		
	}

}
