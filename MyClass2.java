class X {
    
    public void method1() {
        System.out.println("Inside method1");
        new Y().method3(); 
    }
    
    public void method2() {
        System.out.println("Inside method2");
    }
    
    public static void main(String[] args) {
        Myclass obj = new Myclass();
        obj.method1();  
    }
}

 class Y{
 	public void method3(){
	System.out.println("Inside method3");
	
}
}
