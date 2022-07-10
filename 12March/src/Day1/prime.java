package Day1;

public class prime {
	 public static void main(String[] args) 
	 {
	        int a = 0;
	        	for (int i = 2; i <= 100; i++) //2,3,4,5,6,7,8,9
	        	{
		             
		            for (int j = 2; j < i ; j++) //2,3,4,5
		            {
		                if (i % j == 0) 
		                {
		                   a++;  
		                }
		            }
			        if (a == 0)
			        {
		            System.out.println(i);//2,3,5,
			        }
			        a=0;
	   }

	        	
	 }
}
