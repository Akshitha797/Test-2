import java.util.Scanner;

public class NetPayableSalary {
	
	static public void netPayableSalary(double basic) {
		
		double hra=basic*0.5;
		double specialAll=basic*0.75;
		double pf=basic*0.12;
		
		double netSalary=hra+specialAll-pf;
		System.out.println(netSalary);
		//return netSalary;
	}

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter Basic Salary :");
		double basic =s.nextDouble();
		//System.out.println(netPayableSalary(basic));
	}

}
