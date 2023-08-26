public class type2{
	Object ob;
	type2(Object obj){
		ob = obj;

	}
	public Object getObject(){
		return ob;
	}	
	public static void main(String args[]){
		type2 tt = new type2("javaTechnocart");
		String name = (String)tt.getObject();
		System.out.println(name);
	}
}