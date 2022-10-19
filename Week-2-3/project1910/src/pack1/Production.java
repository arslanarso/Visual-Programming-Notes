package pack1;

public class Production {
	
	String title, director, writer;

	public Production(String title, String director, String writer) {
		this.title = title;
		this.director = director;
		this.writer = writer;
	}
	
	public void display() {
		System.out.println("Title :  "+ this.title);
		System.out.println("Director :  "+ this.director);
		System.out.println("Writer :  "+ this.writer);
		

	}

}
