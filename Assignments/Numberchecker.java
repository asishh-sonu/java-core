import java.util.Scanner;

public class Numberchecker{
	public static void main(String agrs[]){
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter a number");
	int number = scanner.nextInt();
	
	if (number>0){
	System.out.println("The number is positive.");

	} else if (number < 0) {
	System.out.println("The number is negative.");
	} else {
	System.out.println("The number is Zero");
}
}
}