package test;

import java.util.Scanner;

public class Lendemin {

public static boolean bissextile(int an)
{
return (an % 4 == 0 && !(an % 100 == 0)) || (an % 400 == 0);
}

public static int dernierJour(int mm, int an)
{
	int rs;
	if (mm == 2)
		{
			rs = (bissextile(an) ? 29 : 28);
		}
	else if (mm <= 7)
		{
			rs = (mm % 2 == 1 ? 31 : 30);
		}
	else
		{
			rs = (mm % 2 == 0 ? 31 : 30);
		}
	return rs;
}

public static void affi(int jj, int mm, int an){
	int der=dernierJour(mm, an);
	if (jj<der)
		jj++;
	else{ 
		if(mm<12)
			{jj=1;
			 mm++;}
		else {
			jj=1;
			mm=1;
			an++;
		}
	}
	System.out.println("Date de lendemain "+jj+"/"+mm+"/"+an);
}
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int jj,mm,an;
	
	 System.out.println("donner le jour: ");
	 jj=sc.nextInt();

 

 System.out.println("donner le mois: ");
  mm=sc.nextInt();


 System.out.println("donner l'année: ");
  an=sc.nextInt();
  if ( (jj<0 || jj>31) || (mm<0 || mm>12) ||  (an<0))
	  System.out.println("Date invalide");
  else
	  affi(jj,mm,an);
}

}
