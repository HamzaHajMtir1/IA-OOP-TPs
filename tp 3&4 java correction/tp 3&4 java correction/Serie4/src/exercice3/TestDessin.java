package exercice3;
import java.util.Scanner;
import exercice2.Rectangle;
import exercice1.Point;

public class TestDessin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i ;
		System.out.print("Donner la liste des rectangles : ");
		Scanner l=new Scanner (System.in);
		int n=l.nextInt();
		
		Dessin d;
		d=new Dessin(n);
		
		for(i=0;i<n;i++)
		{
			System.out.println("Donner les paramètres de R"+(i+1)+" :");
			System.out.println("\tDonner les coordonnées du point de base :");
			System.out.print("\tx"+(i+1)+" :");
			Scanner s=new Scanner (System.in);
			double x=s.nextDouble();
			System.out.print("\ty"+(i+1)+" :");
			Scanner t=new Scanner (System.in);
			double y=t.nextDouble();
			System.out.print("\tLongueur"+(i+1)+" :");
			Scanner j=new Scanner (System.in);
			double ln=j.nextDouble();
			System.out.print("\tLargeur"+(i+1)+" :");
			Scanner k=new Scanner (System.in);
			double lr=k.nextDouble();		
			Point p=new Point(x,y);
			Rectangle R=new Rectangle(p,ln,lr);
			d.ajouter(R,i);
		}
		
		System.out.println("La somme des surfaces est égale à "+d.surface());
		
		System.out.println("Donner les valeurs de translation :");
		System.out.print("\ttx = ");
		Scanner a=new Scanner (System.in);
		double tx=a.nextDouble();
		System.out.print("\tty = ");
		Scanner b=new Scanner (System.in);
		double ty=b.nextDouble();
		d.translate(tx,ty);
		//affichage les nouvelles valeurs des coordonnées de chaque rectangle
		for(i=0;i<n;i++)
			System.out.println("x"+(i+1)+" = "+d.t[i].base.x+"\ty"+(i+1)+" = "+d.t[i].base.y);

	}

}