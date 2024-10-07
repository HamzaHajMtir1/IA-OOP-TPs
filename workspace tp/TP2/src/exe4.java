
public class exe4 {

	public static void main(String[] args) {

		if (args.length != 3)
		{
			return;
		}
		
		int a;
		int b;
		
		float s=0;
		
		a=Integer.parseInt(args[1]);
		b=Integer.parseInt(args[2]);
		
		switch(args[0])
		{
			
			case "+":
				s=a+b;
				break;
			case "-":
				s=a-b;
				break;
			case "x":
				s=a*b;
				break;
			case "/":
				if(b==0)
				{
			      System.out.println("erreur !!!");
				}
				else
				{
					s=a/b;
				break;
				}
		}
		
		System.out.println("resultat = " + s);


	}

}
