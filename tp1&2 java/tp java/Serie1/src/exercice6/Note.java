package exercice6;

public class Note {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length==0)
		{
			System.out.println("Erreur");
			System.exit(1);
		}
		
		int a=Integer.parseInt(args[0]);
		
		if((a>0)&&(a<20))
		{
			if((a>0)&&(a<10))
				System.out.println("Redoublant");
			else
				System.out.println("Admis");			
		}
					
		else
			System.out.println("Note invalide");

	}

}
