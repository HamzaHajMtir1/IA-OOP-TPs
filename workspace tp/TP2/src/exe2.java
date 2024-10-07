
public class exe2 {

	public static void main(String[] args) {
		int n;
		do {
			System.out.print("donner un nbr positive : ");
			n= Integer.parseInt(args[0]);
		}
		  while(n <= 0);
		  int s=0;
		  while (n > 0) {
	            s = s + n % 10;
	            n = n / 10;
		}
		System.out.print("la somme des ces composent est = "+s);
    }
}
