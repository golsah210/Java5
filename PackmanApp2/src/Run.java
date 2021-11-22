
public class Run {

	public static void main(String[] args) {
		Pacman pacman = new Pacman();
		Fruit fruit = new Fruit();
		
		pacman.eat(fruit);
		
		System.out.println(fruit.isVisible);

	}

}
