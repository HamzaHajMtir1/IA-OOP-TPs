package tp2dar;

public class ex8d {

	public static void main(String[] args) {
		if(args.length==0)
		{
			return;
		}
		int t[];
		t= new int[args.length];
		for(int i=0 ; i< args.length ; i++)
		{
			t[i]=Integer.parseInt(args[i]);
		}
		int min=0;
		int max=0;
		for(int i=0;i< (args.length )-1 ; i++)
		{
			if (t[i]<t[i+1])
			{
				min=t[i];
				max=t[i+1];
			}
				
			else
			{
				min=t[i+1];
				max=t[i];
			}
		}
		int s=0;
		for(int i=0;i<args.length;i++)
		{
			s+=t[i];
		}
		System.out.print("le min est : "+min+" , le max est : "+max+" et la somme est : "+s);
	}

}
