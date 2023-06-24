package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost){
		super(title, category, director, length, cost);
	}
	
	public DigitalVideoDisc(String title){
		super(title);
	}
	
	public DigitalVideoDisc(String title, String category, float cost){
		this(title);
		this.setCategory(category);
		this.setCost(cost);
	}
	
	public DigitalVideoDisc(String director, String category, String title, float cost){
		this(category,title,cost);
		this.setDirector(director);
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	
//	public boolean isMatch(String title) {
//		return this.getTitle().equals(title);
//	}
	
	@Override 
	public String toString(){
		return ("DVD - " + this.getTitle() 
				+ " - " + this.getCategory()
				+ " - " + this.getDirector()
				+ " - " + this.getLength()
				+ ": " + this.getCost() + "$");
	}
	
}
