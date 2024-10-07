package exercice6;

public class Tableau {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int t1[]={2,7,5,21,-7};
		int t2[];
		t2=new int[5];
		int i=0 ;
		boolean x=true;
		for(i=0;i<5;i++)
			t2[i]=t1[i];
		
		for(i=0;i<5;i++)
			if(t1[i]!=t2[i])
				x=false;

		if(x==true)
			System.out.println("Copie identique");
		else
			System.out.println("Erreur dans la copie");

	}

}
