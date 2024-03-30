
public class Study {
	
		int id; 
		String name;
		
		//creating a parameterized constructor
		Study(int i,String n){
		id = i; 
		name = n;
		}
		//method to display the values
		void display()
		{
			System.out.println(id + " " + name);
		}
		
		public static void main(String args[]){
		
		//creating objects and passing values
		Study s1 = new Study(111,"Alex");
		
		//calling method to display the values of object
		System.out.print("ID and Name : ");
		s1.display();
		}
}

