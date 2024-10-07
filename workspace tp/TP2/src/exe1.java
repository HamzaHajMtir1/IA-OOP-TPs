public class exe1 {
	public static void main(String args[]){
		if(args.length==0)
		{	System.out.print("il faut donner un nbr ");
			return;
		}
		System.out.println("Enter un number- ");
		int n= Integer.parseInt(args[0]);
		int s=0;
		for(int i=0;i<n;i++)
			s+=i;
		System.out.println("SOMME="+s);
	}
}
