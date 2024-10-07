package exercice4;

public class Affiche {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		if(a<b)
			System.out.println(a+"<"+b);
		else
			if(a>b)
				System.out.println(a+">"+b);
			else
				System.out.println(a+"="+b);

	}

}
