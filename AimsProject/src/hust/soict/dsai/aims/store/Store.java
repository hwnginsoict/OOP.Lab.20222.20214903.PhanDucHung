package hust.soict.dsai.aims.store;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Store {
	private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>();
	private int nbItems = 0;
	public void addDVD(DigitalVideoDisc dvd) {
		itemsInStore.add(dvd);
		nbItems += 1;
		System.out.println("The disc is added to store!");
	}
	public void removeDVD(DigitalVideoDisc dvd) {
		try {
			itemsInStore.remove(dvd);
			nbItems -= 1;
			System.out.println("The disc is removed from store!");
		}
		catch (Exception e) {
			System.out.println("Disc doesn't exist!");
			return ;
		}
	}
	public int getNbItems() {
		return nbItems;
	}
}
