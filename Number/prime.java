public class prime{
    public static void main(String args[]){
            int num =5;
            System.out.println("isPrime" + isPrime(num));
    }
    private static boolean isPrime(int num){
        for(int i = 2; i< num; i++){
             if(num % i == 0)
                return false;
        }
            return true;
    }

}