
public class exe2 {

	public static void main(String[] args) {
		if(args.length==0)
			return;
		int s=Integer.parseInt(args[0]);
	    int j=(s/86400);
	    int h=(s-(j*86400))/3600;
	    int m=(s-((j*86400)+(h*3600)))/60;
	    int s1=(s-((j*86400)+(h*3600)+(m*60)));
	    System.out.print("le nbr de second donner "+s+"\n"+"l'equivalent en jours est "+j+" l'eqivalent en heure est "+h+"\n"+" l'equivalent en minute est "+m+"\n"+" l'equivalent en seconde est "+s1);
	}

}
