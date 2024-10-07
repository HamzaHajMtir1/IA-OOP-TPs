package exercice1;

public class Hjms {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length!=1)
			System.out.println("Erreur");
		else
		{
			int x=Integer.parseInt(args[0]);
			int j=0;
			int h=0;
			int m=0;
			int s=0;
			
			j=x/86400;
			System.out.print(x+" secondes = "+j+" jours");
			
			h=(x-(j*86400))/3600;
			System.out.print(" . "+h+" heures");
			
			m=(x-(j*86400+h*3600))/60;
			System.out.print(" . "+m+" minutes");
			
			s=x-(j*86400+h*3600+m*60);
			System.out.print(" . "+s+" secondes");
			
		}

	}

}
