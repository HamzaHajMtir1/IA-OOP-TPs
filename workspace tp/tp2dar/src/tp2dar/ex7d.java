package tp2dar;

public class ex7d {

	public static void main(String[] args) {
		if(args.length==0)
		{
			return;
		}
		int t[];
		t= new int[args.length];
		for(int i=0 ; i<args.length; i++)
		{
			t[i]=Integer.parseInt(args[i]);
		}
		int aux=0;
		for(int j=1; j <= (args.length-1); j++)
        {  
                if(t[j-1] > t[j])
                {
                        
                        aux = t[j-1];  
                        t[j-1] = t[j];  
                        t[j] = aux;  
                }
        }
		for(int i=0 ; i<args.length ; i++)
		{
			System.out.println(t[i]);
		}

	}

}
