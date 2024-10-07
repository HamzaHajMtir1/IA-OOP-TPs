package exercice1;

public class Somme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length!=1)
			System.out.println("Erreur");
		else
		{
			int N=Integer.parseInt(args[0]);
			int s=0;
			int i;
			for(i=0;i<=N;i++)
			{
				s+=i;
			}
			System.out.println("somme="+s);
		}

	}

}

