package exercice5;

public class Somme2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i=0;
		int s=0;
		while(i>=0 && i<=100)
		{	
			s+=i;
			i+=5;
		}
		System.out.println(s);

	}

}
