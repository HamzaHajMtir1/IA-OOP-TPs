package exercice4;

public class Prefixe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a;
		int b;
		char c;
		if(args.length!=3)
			System.out.println("Erreur");
		else
		{		
			a=Integer.parseInt(args[1]);
			b=Integer.parseInt(args[2]);
			c=args[0].charAt(0);
			switch(c)
			{
				case '+' : System.out.println("a+b="+(a+b));
				break;
				case '-' : System.out.println("a-b="+(a-b));
				break;
				case '*' : System.out.println("a*b="+(a*b));
				break;
				case '/' : {
					if((a==0) && (b==0))
							System.out.println("Erreur");	
					else
					{
						if(b==0)
							System.out.println("b/a="+(b/a));
						else
							System.out.println("a/b="+(a/b));	
					}}
				break;
				default : System.out.println("Parametre Invalide!");
			}
		}
	}
}
