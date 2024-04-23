package chatGPT;

public class AnimalExample {

	public static void main(String[] args) {
		Animal d1 = new Dog("초코", "강아지");
		Animal c1 = new Cat("땅콩", "고양이");
		
		d1.makeSound();
		c1.makeSound();
		
		int i =1;
		System.out.println(String.format("%03d", i));
				

	}

}
