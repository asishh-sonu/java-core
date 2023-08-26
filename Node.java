import java.util.Scanner;
class Node {
	int data ;
	Node next;
	}
public class Single {
	public static int get() {
		Scanner ss = new Scanner(System.in);
		return ss.nextInt();
		}
	static Node starter;
	static int count() {
		if(starter == null) {
			return 0 ;
			} else {
			int count = 0 ;
			Node temp ;
			temp = starter ;
			while(temp!=null) {
				count++;
				temp = temp.next ;
				}
			return count;
			}
		}
	void create() {
		System.out.println("Enter no of nodes u want to create.");
		int nc = get() ;
		if(nc > 0) {
			Node temp = new Node() ;
			starter = temp ;
			Node temp1 = null;
			System.out.println("Enter the data");
			temp.data = get();
			for(int i = 1 ; i < nc ; i++) {
				temp.next = new Node();
				temp = temp.next ;
				System.out.println("Enter the data");
				temp.data = get() ;
				}
			temp = null ;
			System.out.println("Total nodes are : "+count());
			}
		}
	void retrive() {
		if(starter==null) {
			System.out.println("No node is available.");
			} else {
			System.out.print("Data is : ");
			Node temp ;
			temp = starter ;
			while(temp != null) {
				System.out.print(temp.data + "\t");
				temp = temp.next;
				}
			temp = null ;
			System.out.println("\nTotal nodes are : "+count())	;
			}
		}
	void insert() {
		if(starter == null) {
			System.out.println("No node is available.");
			} else {
			System.out.println("Enter the position where u insert a node.")	;
			int pos = get() ;
			Node temp ;
			temp = starter ;
			if((pos>1) &&(pos<=count()+1)) {
				for(int k = 1 ; k<(pos-1) ; k++) {
					temp = temp.next;
					}
				Node temp1 ;
				temp1 = temp.next ;
				Node new1 = new Node();
				System.out.println("Enter the data");
				new1.data = get();
				new1.next = temp1 ;
				temp.next = new1;
				}
			else if(pos == 1) {
				Node new2 = new Node() ;
				new2.next = starter ;
				starter = new2 ;
				System.out.println("Enter the data");
				new2.data = get();
				} else {
				System.out.println("!!!!Invalid Position.!!!!")		;
				}
			}	
		System.out.println("Total nodes are : "+count())	;
		}

		void delete() {
			if(starter == null) {
				System.out.println("No node is available");
			}
			else {
				System.out.println("Press 1> for deleting the first Node");
				System.out.println("Press 2> for deleting the last Node");
				System.out.println("Press 3> for deleting the any Node");
				int pos = get();
			
				if(pos == 1) {
					Node temp = starter;
					starter = temp.next;
					temp.next = null;
					temp = null;
				}
				else
				if(pos == 2) {
					Node temp1, temp2;
					temp1 = starter;
					temp2 = null;

					while(temp1.next != null) {
						temp2 = temp1;
						temp1 = temp1.next;
					}
					
					temp1 = null;
					temp2.next = null;
				}
				else
				if(pos == 3) {
					System.out.println("Enter the position you want to delete");
					int no = get();
					
					if(no > count()){
						System.out.println("No Node is available");
					}
					else {
						Node temp1, temp2;
						temp1 = starter;
						temp2 = null;
					
						for(int i = 1; i < (no - 1); i++) {
							temp1 = temp1.next;
						}
						
						temp2 = temp1.next;
						temp1.next = temp2.next;
						temp2.next = null;
						temp2 = null;
						System.out.println("Node is deleted");
					}
				}
				else {
					System.out.println("Invalid Choice");
				}
			}
			System.out.println("Total nodes are available " + count());
		}
	public static void main(String args[]) {
		Single ss = new Single() ;
		while(true) {	
			System.out.println("\t\tSingle Linked List Application.*")	;
			System.out.println("\t\tCheck The Menu.*");
			System.out.println("\t\t1>Create Nodes.");
			System.out.println("\t\t2>Traverse Nodes.");
			System.out.println("\t\t3>Insert Nodes.");
			System.out.println("\t\t4>Delete Nodes.");
			System.out.println("\t\t5>Quit");
			System.out.println("Enter your choice");
			int ch = get();
			switch(ch) {
				case 1 :
					ss.create();
					break ;
				case 2 :
					ss.retrive();
					break;
				case 3 :
					ss.insert();
					break;
				case 4:
					ss.delete();
					break;
				case 5 :
					System.out.println("Thank u for using my application.");
					System.exit(121232);
				default :
					System.out.println("!!!Invalid Choice.!!!");
					break;
				}
			}
		}
	}