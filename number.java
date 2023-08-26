public class number {
	public static void main(String args[]){

	int number=15967;
	int sum = 0;
	while(number ! = 0){
	int digit = number % 10;
	sum = sum+digit;
	//System.out.println(digit);
	number /= 10;
		}
	}
}