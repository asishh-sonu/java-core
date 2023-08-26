public class Demo {
    int data;
    public Demo() {
        System.out.println("Object is constructed"); 
    }
    public void setData(int x){
        data = x ;
    }
    public int getData(){
        return data;
    }
    public static void main(String args[]){
        Demo dd = new Demo();
        dd.setData(12);
        System.out.println("data value is : " +dd.data);
    }

    }
