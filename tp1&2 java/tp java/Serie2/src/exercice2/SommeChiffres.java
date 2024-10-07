package exercice2;

public class SommeChiffres {

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
			while(N/10!=0)
			{
				s+=N%10;
				System.out.println("s"+s);
				N=N/10;
				System.out.println("N"+N);
			}
			s+=N;
			System.out.println("somme="+s);
		}
	}

}
