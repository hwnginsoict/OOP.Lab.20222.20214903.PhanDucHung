package hust.soict.dsai.aims.media;

public class Disc extends Media {
	private String director;
	private int length;
	
	public Disc() {
		// TODO Auto-generated constructor stub
	}
	public Disc(String director, String category, String title, float cost){
		super(category,title,cost);
		this.setDirector(director);
	}
	public Disc(String title, String category, String director, int length, float cost){
		this(director,category,title,cost);
		this.setLength(length);
	}
	public Disc(String director, int length) {
		super();
		this.setDirector(director);
		this.setLength(length);
	}
	public Disc(String title) {
		super(title);
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}