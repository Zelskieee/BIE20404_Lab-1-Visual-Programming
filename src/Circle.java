

public class Circle {
	
	private double radius;

	// This is a public method named getArea that calculates and returns the area of the circle
	public double getArea()
	{
		return 3.14 * radius * radius;
	}

	// This is a public method named setRadius that sets the value of the radius field
	public void setRadius(double r) {
		this.radius = r;
	}

	// Show the radius and area of the circle
	public static void main(String args[]){ 

		Circle bulat = new Circle();//Creating an object or instance
		
		bulat.setRadius(25);
		
		System.out.println("Radius length of the circle : " + bulat.radius + " cm ");
		System.out.println("Area of the circle : " + bulat.getArea() + " cm^2");
	}
}
