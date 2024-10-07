
public class exe3 {

	public static void main(String[] args) {
		int e=0;
		int k=0;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Donner le jour: ");
		int j=s.nextInt();
		System.out.println("Donner le mois: ");
		int m=s.nextInt();
		System.out.println("Donner l annee: ");
		int a=s.nextInt();
		if (m<0 || m>12 )
			{System.out.println("Date non valide");
			e=1;}
		int tab1[]= {31,29,31,30,31,30,31,31,30,31,30,31};
		int tab[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		if((a%4==0 && a%100!=0)|| a%400==0)
		{	if (j<0 || j>tab1[m-1])
			{System.out.println("Date non valide");
			e=1;}
		if(a<0)
			{System.out.println("Date non valide");
			e=1;}
		if(j==tab1[m-1] && m<12)
		{
			j=1;
			m+=1;
		}
		else if (j==tab1[m-1] && m==12)
		{
			j=1;
			m=1;
			a+=1;
		}
		else 
			j+=1;
		}
		else
		{	if (j<0 || j>tab[m-1])
				{System.out.println("Date non valide");
				e=1;}
			if(a<0)
				{System.out.println("Date non valide");
				e=1;}
			if(j==tab[m-1] && m<12)
			{
				j=1;
				m+=1;
			}
			else if (j==tab[m-1] && m==12)
			{
				j=1;
				m=1;
				a+=1;
			}
			else 
				j+=1;
		}
		 if (m==2) {
			if(((a/100!=0)&&(a/4==0))||(a/400==0)){
				if(j==30) {
					j=1;
					m+=1;
					e=0;
				}
			
			else 
				if(j==28) {
					j=1;
					m+=1;
					e=0;
				}
				
			}
		
	}
		if(e!=1)
		
		System.out.println("Date du lendemain: "+j+"/"+m+"/"+a);
		
		

	}

}
