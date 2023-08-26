public class Rev {
	public static void main(String args[]){
		Rev rr = new Rev();
		rr.reverse();
	}
	public void reverse() {
	int a = 5 , b = 4 ,c = 0;
	System.out.println("a : " + a + " b : " +b);
	c = a;//5
	a = b;//4
	b = c;//5
	System.out.println("a : " + a + " b : " +b);
}
}