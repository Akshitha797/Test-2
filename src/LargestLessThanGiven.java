import java.util.Scanner;

public class LargestLessThanGiven {

	static public void largestLessThanGiven(int n,int d) {
		
		int temp=n,rem=0;
		
		while(temp!=0) {
			rem=temp%10;
			if(rem==d)
			{
				n--;
				temp=n;
				continue;
			}
			temp=temp/10;
		}
		System.out.println(n);
		}

	
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=s.nextInt();
		System.out.println("Enter the digit :");
		int d=s.nextInt();
		
		largestLessThanGiven(n,d);
	}

}
