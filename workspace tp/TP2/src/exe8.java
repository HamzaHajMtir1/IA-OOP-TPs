
public class exe8 {

	public static void main(String[] args) {
int t[] = new int[args.length];
		
		for(int i=0;i<args.length;i++)
		{
			t[i] = Integer.parseInt(args[i]);
		}
		
		int max=t[0];
		int min=t[0];
		int somme=0;
		
		for(int i=0;i<t.length;i++)
		{
			if (max < t[i])
			{
				max=t[i];
			}
			
			if (min > t[i])
			{
				min = t[i];
			}
			
			somme+=t[i];
		}
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		System.out.println("somme = " + somme);

	}

}
