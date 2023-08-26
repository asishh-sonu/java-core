public class Demo7{
	public static void main(String args[]){
	c1: //scope of outer loop
	for(int i = 0 ; i<3 ; i++){
		c2: // scope of inner loop
		for(int j = 0; j<3; j++){
			if (i== j){
				break c1;
	
				}	
			System.out.println(i+"\t"+j);
				}
			}
		}
	}