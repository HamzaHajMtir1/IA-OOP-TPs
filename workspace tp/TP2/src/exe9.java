
public class exe9 {

	public static void main(String[] args) {
		if (args.length == 0)
		{
			return;
		}
		
		int n;
		
		n = Integer.parseInt(args[0]);
		
		switch(n)
		{
			case 0:
				System.out.println("zero");
				break;
			case 1:
				System.out.println("un");
				break;
			case 2:
				System.out.println("deux");
				break;
			case 3:
				System.out.println("trois");
				break;
			case 4:
				System.out.println("quatre");
				break;
			case 5:
				System.out.println("cinq");
				break;
			case 6:
				System.out.println("six");
				break;
			case 7:
				System.out.println("sept");
				break;
			case 8:
				System.out.println("huit");
				break;
			case 9:
				System.out.println("neuf");
				break;
		}

	}

}
