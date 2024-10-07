public class ex4 {

	public static void main(String[] args) {
		
	
	Scanner scanner=new Scanner(System.in);
	        int j=scanner.nextInt();
	        int m=scanner.nextInt();
	        int a=scanner.nextInt();
	        boolean test = true;
	        if (m >=1 && m <=12)
	            break;
	        else 
	            
	            test = false;
	        if (j >= 32)
	            test = false;
	        
	        if (m in {1,3,5,7,8,10,12})
	            if (!j <= 31)
	                test = false;
	        else if (m = 2)
	               if (!j <= 28)
	                  test = false;
	        else if (m in {4,6,9,11})
	                   if (!j <= 30)
	                      test = false;
	        if (j >= 32)
	                test = false;
	        if (test == false)
	            System.out.println("invalid date");
	        else {
	            if (m in {1,3,5,7,8,10,} && j==31)
	            { j=1;
	                m=m+1;}
	                else if (m == 12 && j == 31)
	                        {
	                    m=1;
	                    j=1;
	                    a=a+1;
	                        }
	                else if (m in {4,6,9,11} && j=30)
	                { j=1;
	                  m=m+1;
	            }
	                else if (m == 2 && j == 28)
	                { m=m+1;
	                j=1;
	                }
	            
	            
	            System.out.println("today's date is: "+ j + "/" + m + "/" + a);
	        }
	    }
 }