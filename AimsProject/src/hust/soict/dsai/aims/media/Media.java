package hust.soict.dsai.aims.media;

public class Media {

	private int id;
	private String title;
	private String category;
	private float cost;
	public Media() {
		// TODO Auto-generated constructor stub
	}
	public Media(int id, String title, String category, float cost) {
		this(category, title, cost);
		this.setId(id);
	}
	public Media(String title){
		this.setTitle(title);
	}
	public Media(String category, String title, float cost){
		this(title);
		this.setCategory(category);
		this.setCost(cost);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}

}
