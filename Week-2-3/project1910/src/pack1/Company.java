package pack1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Company {
	
	
	ArrayList<Play> plays = new ArrayList<Play>();
	ArrayList<Film> films = new ArrayList<Film>();

	
	public int getINT(String message) {
		
		return Integer.parseInt(JOptionPane.showInputDialog(message));
	}
	
	public String getString(String message) {
		
		String input = JOptionPane.showInputDialog(message).toLowerCase();
		
		return input;
		
	}
	
	public Play newPlay() {
		Play play = new Play(getString("Title?"), getString("Director?"), getString("Writer?"), getINT("Performances?"));
		
		return play;
				
	}
	
	public Film newFilm() {
		Film film = new Film(getString("Title?"), getString("Director?"), getString("Writer?"), getINT("Box Office Gross?"));
		
		return film;
				
	}
	
	public void newProduction(String productionType) {
		
		String input = productionType.toLowerCase();
		
		
		if(input.equals("film")) {
			films.add(newFilm());
			
			JOptionPane.showMessageDialog(null, "Film Saved!");

		} else if(input.equals("play")) {
			plays.add(newPlay());
			
			JOptionPane.showMessageDialog(null, "Play Saved!");
			
		} else {
			JOptionPane.showMessageDialog(null, "No production like this.");
		}
		
		
	}
	
	public void showAllPlays() {
		
		System.out.println("The Play List : ");
		for (Play p : plays) {
			System.out.println(p.title+ " " +p.director+" "+ p.writer+" "+p.performances);
			
		}
		
	}
	
	public void showPlay(String title) {
		
		System.out.println("The Play details : ");		
		for (Play p : plays) {
			if(p.title.equals(title)) {
				System.out.println(p.title+ " " +p.director+" "+ p.writer+" "+p.performances);
				
				
			}
			
		}
	}
	
	public void showAllFilms() {
		
		System.out.println("The Film List : ");
		for (Film f : films) {
			System.out.println(f.title+ " " +f.director+" "+ f.writer+" "+f.boxOfficeGross);
			
		}
		
	}
	
	public void showFilm(String title) {
		
		System.out.println("The Play details : ");		
		for (Film f : films) {
			if(f.title.equals(title)) {
				System.out.println(f.title+ " " +f.director+" "+ f.writer+" "+f.boxOfficeGross);
				
				
			}
			
		}
		
	}
	
	public void displayAll() {
		
	}
	
	public void displayAll(String productionType) {
		
	}
	
	public void delete(String type, String title) {
		
		int index=0;
		
		if(type.equals("film")) {
			for (Film f : films) {
				if(f.title.equals(title)) {
					index= films.indexOf(f);
				}
				
			}
		}
		else if (type.equals("play")) {
			for (Play p : plays) {
				if(p.title.equals(title)) {
					plays.remove(p);
				}
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "No Type like this");
		}
		
		films.remove(index);
		
	}
	
	

	public static void main(String[] args) {
		Company c = new Company();
		
		c.newProduction("film");
		c.showAllFilms();

		

	}

}
