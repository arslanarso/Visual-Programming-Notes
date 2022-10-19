package pack1;

public class Play extends Production {
	
	int performances;

	public Play(String title, String director, String writer, int performances) {
		super(title, director, writer);
		this.performances = performances;
	}
	
	public void display() {
		super.display();
		System.out.println("Performances : "+ this.performances);
	}

}
