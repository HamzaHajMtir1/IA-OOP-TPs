package exercice5;

public class Operation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		
		if(args.length==2){
			System.out.println("a+b="+(a+b));
		
			System.out.println("a-b="+(a-b));
		
			System.out.println("a*b="+(a*b));
		
			if(a==0)
				System.out.println("a/b="+(a/b));
			else
				if(b==0)
					System.out.println("b/a="+(b/a));
			else
				System.out.println("a/b="+(a/b));
		}
		
		else
			System.out.println("Erreur");
	}

}
