import java.util.Arrays;

public class exe7 {

	public static void main(String[] args) {
		if (args.length ==0)
		{
			return;
		}
		int t[];
		t= new int[args.length];
		int n=0;
		for(int i=0 ; i< args.length; i++)
		{
			t[i]=Integer.parseInt(args[i]);
			n++;
			
		}
		
		int j;
		int v;
		
		for(int i=1;i<t.length;i++)
		{
			j=i;
			v=t[i];
			while( j>0 && v < t[j-1] )
			{
				t[j]=t[j-1];
				j--;
			}
			t[j]=v;
		}
		for(int i=0;i<t.length;i++)
		{
			System.out.print(t[i] + " ");
		}
		
	}

}
