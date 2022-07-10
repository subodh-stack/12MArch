package BasicJ;

public class Ladder {
	public static void main(String[] args) {
		int marks = 80;
		
	
		if(marks <=100 && marks>=0)
		{
			if(marks>= 90)//false 
			{
				System.out.println("A+ Grade");
			}
			else if(marks >=80 && marks <90)//false 
			{
				System.out.println("A Grade");
			}
			else if(marks >=70 && marks < 80)//false
			{
				System.out.println("B+Grade");
			}
			else if(marks >=60 && marks< 70)
			{
				System.out.println("B Grade");
			}
			else if(marks >= 50  && marks < 60)
			{
				System.out.println("C+ Grade");
			}
			else if(marks >= 40 && marks<50)
			{
				System.out.println("C Grade");
			}
			else 
			{
				System.out.println("fail");
			}
		}
		else {
			System.out.println("invalid input");
		}
	}
}//if you have three number then find the largest number
