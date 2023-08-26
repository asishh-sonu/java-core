import java.util.Scanner;

public class Scanner1 {
	public static void main (String args[]){
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the name :");
	String name = sc.next();
	System.out.println("Name is : "+name);
	System.out.println("Enter the age : ");
	int age = sc.nextInt();
	System.out.println("Age is : "+age);
	System.out.println("Enter the fee : ");
	double fee = sc.nextDouble();
	System.out.println("fee is : "+fee);
	}
}