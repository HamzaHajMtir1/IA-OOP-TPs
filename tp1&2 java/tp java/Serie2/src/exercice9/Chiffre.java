package exercice9;

public class Chiffre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length!=1)
			System.out.println("Erreur");
		else
		{
			int x=Integer.parseInt(args[0]);
			switch(x)
			{
				case 0 : System.out.println("Zero");
				break;
				case 1 : System.out.println("Un");
				break;
				case 2 : System.out.println("Deux");
				break;
				case 3 : System.out.println("Trois");
				break;
				case 4 : System.out.println("Quatre");
				break;
				case 5 : System.out.println("Cinq");
				break;
				case 6 : System.out.println("Six");
				break;
				case 7 : System.out.println("Sept");
				break;
				case 8 : System.out.println("Huit");
				break;
				case 9 : System.out.println("Neuf");
				break;
				default : System.out.println("Ce n'est pas un chiffre!");
			}
		}

	}

}
