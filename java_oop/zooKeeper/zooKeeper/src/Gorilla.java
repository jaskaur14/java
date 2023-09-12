
public class Gorilla extends Mammal {
	public Gorilla () {
		super(100);
	}
	public void throwSomething() {
		System.out.println("The gorilla threw something");
		energyLevel -= 5;

	}
	public void eatBananas() {
		System.out.println("The gorilla ate some bananas and is happy");
		energyLevel += 10;
	}
	public void climb() {
		System.out.println("The gorilla climbed a tree");
		energyLevel -= 10;
	}
}
//super calls method from Parent class, which is Mammal
// Gorilla is child to Mammal class