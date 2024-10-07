package exercice3;

public class Triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length!=1)
			System.out.println("Erreur");
		else
		{
			int x=Integer.parseInt(args[0]);
			int i , j;
			
			for(i=1;i<=x;i++)
			{
				for(j=x;j>x-i;j--)
					System.out.print("*");
				
				System.out.println();
			}
				
				
		}

	}

}
