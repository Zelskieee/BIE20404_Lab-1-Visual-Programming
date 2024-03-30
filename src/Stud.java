
public class Stud{
		
		//Variable declaration
		int id;
		String name;
		int age;

		// Constructor with two parameters (id and name)
		Stud(int i, String n) {
		    id = i;
		    name = n;
		}

		// Constructor with three parameters (id, name, and age)
		Stud(int i, String n, int a) {
		    id = i;
		    name = n;
		    age = a;
		}

		// Method to display the values of id, name, and age
		void display() {
		    System.out.println(id + " " + name + " " + age);
		}

		// Main method to create objects of the "Stud" class and call the "display" method on them
		public static void main(String args[]) {
		    Stud s1 = new Stud(111, "Karan");
		    Stud s2 = new Stud(222, "Aryan", 25);
		    s1.display();
		    s2.display();
		}
}



