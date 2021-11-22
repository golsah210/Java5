
public class Fruit {
	public boolean isVisible;

	public Fruit() {
		isVisible = true;
	}
	
	public void disapear() {
		isVisible = false;
		System.out.println("The fruit is hidden.");
	}

}
