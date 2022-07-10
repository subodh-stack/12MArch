package BasicJ;

public class Nested {
	public static void main(String[] args) {
		int marks = 99; //marks should be smaller or equal to 100, then check if marks is greater than 40
		
		if (marks <=100)// outer if
		{ 
			if(marks>40) //inner if
			{
				System.out.println("you are passed");
			}
			else
			{
				System.out.println("You are failed");
			}
		}
		else
		{
			System.out.println("Invalid marks");
		}
	}
}
