package Polymorphism;

public class MyMainClass {
	
	public static void main(String[] args) 
	{
		Animal myAnimal = new Animal();
		Animal myCat = new Cat();
		Animal myDuck = new Duck();
		myAnimal.animalSound();
		myCat.animalSound();
		myDuck.animalSound();
	}
}
