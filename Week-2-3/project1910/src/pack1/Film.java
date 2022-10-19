package pack1;

public class Film extends Production {
	
	int boxOfficeGross;

	public Film(String title, String director, String writer, int boxOfficeGross) {
		super(title, director, writer);
		this.boxOfficeGross = boxOfficeGross;
	}
	
	public void display() {
		super.display();
		System.out.println("Box Office Gross : "+ this.boxOfficeGross);
	}

}
