package chatGPT;

public class Animal {
	String name;
	String species;
	
	Animal(String name, String species){
		this.name=name;
		this.species=species;
	}
	
	void makeSound() {
	}

}

	class Dog extends Animal{
		
		Dog(String name, String species){
			super(name,species);
		}
		
		@Override
		void makeSound() {
			System.out.println("港港");
		}
		
	}
	
	
	class Cat extends Animal{
		
		Cat(String name, String species){
			super(name,species);
		}
		
		@Override
		void makeSound() {
			System.out.println("具克");
		}
		
	}	
	