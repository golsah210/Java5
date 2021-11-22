
public class Pacman {
	public int points;
	
	public Pacman() {
		points = 0;
	}
	
	public void printData() {
		System.out.println(points);
	}

	public void eat(Fruit eatenFruit) {
		System.out.println("Pacman ate the fruit!");
		eatenFruit.disapear();
		
	}
}
