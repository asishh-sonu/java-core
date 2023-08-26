public class NumberReversal{
	public static void main(String args[]){
	int number1 = 123;
	int number2 = 500;

	System.out.println("Before reversal;");
	System.out.println("Number 1 :" + number1);
	System.out.println("Number 2 :" + number2);

	number1 = number1 + number2;
	number2 = number1 - number2;
	number1 = number1 - number2;

	System.out.println("\nAfter reversal:");
	System.out.println("Number 1:" + number1);
	System.out.println("Number 2:" + number2);

	}
}