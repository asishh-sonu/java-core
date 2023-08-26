public class Factorial {
	public static void main (String args[]){
	int number = 1;
	int fact = 1;
	for(int i = 5 ; i >=number ; i--){
		fact = fact * i;	
		}
	System.out.println("Factorial is : " +fact);	
	}
}