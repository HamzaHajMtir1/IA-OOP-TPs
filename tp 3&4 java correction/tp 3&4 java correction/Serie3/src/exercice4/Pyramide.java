package exercice4;

public class Pyramide {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length!=1)
			System.out.println("Erreur");
		else
		{
			int x=Integer.parseInt(args[0]);
			int i , j , k;
			
			for(i=1;i<=x;i++)
			{	
				for(j=i+1;j<=x;j++)
					System.out.print(" "); 
				for(k=1;k<=2*i-1;k++)
					System.out.print("*");  
				System.out.println();
			}
		}

	}

}
