
public class exe10 {

	public static void main(String[] args) {
		if (args.length == 0)
		{
			return;
		}
		
		int n;
		
		n = Integer.parseInt(args[0]);
		
		switch(n)
		{
			case 1:
				System.out.println("janvier");
				break;
			case 2:
				System.out.println("fevrier");
				break;
			case 3:
				System.out.println("mars");
				break;
			case 4:
				System.out.println("avril");
				break;
			case 5:
				System.out.println("may");
				break;
			case 6:
				System.out.println("juin");
				break;
			case 7:
				System.out.println("juillet");
				break;
			case 8:
				System.out.println("aout");
				break;
			case 9:
				System.out.println("septembre");
				break;
			case 10:
				System.out.println("octobre");
				break;
			case 11:
				System.out.println("novembre");
				break;
			case 12:
				System.out.println("decembre");
				break;
		}
	}

}
