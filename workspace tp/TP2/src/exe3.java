
public class exe3 {

	public static void main(String[] args) {
		if ( args.length == 0)
		{
			return;
		}
		
		int n;
		
		n=Integer.parseInt(args[0]);
		
		String ch="";
		
		while( n > 0)
		{
			if (n % 2 == 0)
			{
				ch+="0";
			}
			else
			{
				ch+="1";
			}
			n/=2;
		}

		for(int i=ch.length()-1 ; i>=0 ;i--)
		{
			System.out.print(ch.charAt(i));
		}
	}

}
