package exercice8;

public class Tableau {

	public static void main(String[] args) {
		int x=(args.length);
		int i , min , max , s;
		int t[];
		t=new int[x];
		if(x==0)
			System.out.println("Erreur");
		else
		{
			for(i=0;i<x;i++)
				t[i]=Integer.parseInt(args[i]);
			
			min=t[0];
			max=t[0];
			s=0;
			for(i=0;i<x;i++)
			{
				if(t[i]<min)
					min=t[i];
				if(t[i]>max)
					max=t[i];
				s+=t[i];
			}	
			System.out.println("somme="+s);
			System.out.println("minimum="+min);
			System.out.println("maximum="+max);
			
			
		}

	}

}
