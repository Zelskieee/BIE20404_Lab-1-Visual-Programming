package InheritingParameterized;

public class Derived extends Base{
	
	private int y;
	
	Derived(int x, int y) 
	{
		super(x);
		this.y = y;
	}
	
	void Display() 
	{
		System.out.println("x = "+x+", y = "+y);
	}
}
