import java.util.Scanner;
class Employee_Bonus
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Current Year : ");
		int current_year = input.nextInt();
		System.out.print("Enter the Year of Joining : ");
		int join_year = input.nextInt();
		int diff = current_year - join_year;
		if(diff>3)
		{			
			System.out.println("Bonus of Rs : 2500 /-");
		}
		else
		{			
			System.out.println("No Bonus");
		}		
	}
}