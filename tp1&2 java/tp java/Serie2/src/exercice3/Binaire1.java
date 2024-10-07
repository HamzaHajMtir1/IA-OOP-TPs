package exercice3;

public class Binaire1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length!=1)
			System.out.println("Erreur");
		else
		{
			int N=Integer.parseInt(args[0]);
			int t[]=new int[100];
			int i=0;
			int j;
			
			while(N/2!=0)
			{
				t[i]=N%2;
				N=N/2;
				System.out.println(N);
				i++;
			}
			t[i]=1;
			for(j=i;j>=0;j--)
				System.out.print(t[j]);
		}

	}

}
