import java.util.Scanner;
 class UserDefinedException extends Exception {
	
	public UserDefinedException()
	{
		System.out.println("Not eligible");
	}
}


public class CapGeminiEmployee {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the details : ");
		System.out.println("Enter name :");
		String name=s.nextLine();
		System.out.println("Enter contact details :");
		double phNo =s.nextDouble();
		System.out.println("Enter age :");
		int age=s.nextInt();
		
		try {
			
			if(age<20 || age>55)
				throw new UserDefinedException();
			else
				System.out.println("Entered Successfully");
			
		}catch(UserDefinedException e) {
			
		}
	}

}
