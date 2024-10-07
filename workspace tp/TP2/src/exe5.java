
public class exe5 {

	public static void main(String[] args) {
		int s=0;
		int i=0;
		
		/*version for*/
		
		for(i=0;i<=100;i+=5)
		{
			s+=i;
		}
		
		i=0;
		s=0;
		
		/*version while*/
		
		while(i < 100)
		{
			s+=i;
			i+=5;
		}
		
		System.out.println("resultat = " + s);
		

	}

}
