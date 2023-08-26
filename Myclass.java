public class Myclass {
    
    public void method1() {
        System.out.println("Inside method1");
        method2(); 
    }
    
    public void method2() {
        System.out.println("Inside method2");
    }
    
    public static void main(String[] args) {
        Myclass obj = new Myclass();
        obj.method1(); 
    }
}
