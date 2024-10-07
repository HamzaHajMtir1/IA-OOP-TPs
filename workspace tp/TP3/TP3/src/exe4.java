public class ex4{
	
	public static void main(String[] args) 
	{
		if (args.length != 1)
		{
			return;
		}
		
		int n = Integer.parseInt(args[0]);
		
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = 0 ; j<=i ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}
}