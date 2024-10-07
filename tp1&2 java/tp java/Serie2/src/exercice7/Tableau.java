package exercice7;

public class Tableau {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x=(args.length);
		int i , aux;
		int t[];
		t=new int[x];
		if(x==0)
			System.out.println("Erreur");
		else
		{
			for(i=0;i<x;i++)
				t[i]=Integer.parseInt(args[i]);
			
			int j=0;
			
			while(j<x)
			{
				for(i=0;i<x-1;i++)
					if (t[i]>t[i+1])
					{
						aux=t[i];
						t[i]=t[i+1];
						t[i+1]=aux;
					}
				j++;
			}
			
			for(i=0;i<x;i++)
				System.out.print(t[i]+" ");
		}

	}

}
