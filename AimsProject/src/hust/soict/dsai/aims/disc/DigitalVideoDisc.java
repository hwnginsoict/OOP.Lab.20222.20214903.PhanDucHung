package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	private static int nbDigitalVideoDiscs = 0;
	private int id;
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost){
		this(director,category,title,cost);
		this.setLength(length);
//		this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title){
		this.title = title;
		this.nbDigitalVideoDiscs ++;
		this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String category, String title, float cost){
		this(title);
		this.category = category;
		this.cost = cost;
//		this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String director, String category, String title, float cost){
		this(category,title,cost);
//		this.id = nbDigitalVideoDiscs;
	}
	public boolean isMatch(String title) {
		return this.title.equals(title);
	}
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public int getNbDigitalVideoDiscs(){
		return nbDigitalVideoDiscs;
	}
	public int getId() {
		return id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	@Override 
	public String toString(){
		return ("DVD - " + this.title 
				+ " - " + this.category
				+ " - " + this.director
				+ " - " + this.length
				+ ": " + this.cost + "$");
	}
	
}