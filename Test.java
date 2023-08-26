class A {
    public void display(){
        System.out.println("Hii im asish");
        
    }
}
public class Test extends A {
    @Override
    public void display(){
            System.out.println("I'm a student");
    }
        public static void main(String args[]){
            Test tt = (Test)new A();
            tt.display();
        }
}