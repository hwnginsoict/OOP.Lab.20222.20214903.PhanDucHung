package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<DigitalVideoDisc> itemsOrdered = 
			new ArrayList<DigitalVideoDisc>();
	private int qtyOrdered = 0;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered == 20) {
			System.out.println("The cart is full, "
					+ "please remove previous discs to add!");
			return ;
		}
		if(qtyOrdered > 15) {
			System.out.println("The cart is almost full!");
		}
		
		itemsOrdered.add(disc);
		qtyOrdered += 1;
		System.out.println("The disc has been added!");
	}
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
//		for(int i=0; i< dvdList.length; i++) {
//			addDigitalVideoDisc(dvdList[i]);
//		}
		for (DigitalVideoDisc disc: dvdList) {
			addDigitalVideoDisc(disc);
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		addDigitalVideoDisc(dvd1);
		addDigitalVideoDisc(dvd2);
	}
	
	public void removeDigitalVideoDisc (DigitalVideoDisc disc) {
		try {
			itemsOrdered.remove(disc);
			qtyOrdered -= 1;
			System.out.println("The disc is removed!");
		}
		catch (Exception e) {
			System.out.println("Disc has not been added yet!");
			return ;
		}
	}
	public float totalCost() {
		float total = 0;
		for(int i= 0; i< itemsOrdered.size(); i++) {
			total += itemsOrdered.get(i).getCost();
		}
		return total;
	}
	public void print() {
		System.out.println("***********************CART***********************");
		for (int i = 0; i < this.qtyOrdered; i++ ) {
			System.out.println(i+1 + ". " + itemsOrdered.get(i));
		}
		System.out.println("Total cost: " + totalCost() + "$");
		System.out.println("**************************************************");
	}
	public void searchId(int id) {
		for(DigitalVideoDisc item: itemsOrdered) {
			if(item.getId() == id) {
				System.out.println(item);
				return ;
			}
			System.out.println("No DVD is matched!");
		}
	}
	public void searchTitle(String title) {
		for(DigitalVideoDisc item: itemsOrdered) {
			if(item.isMatch(title)) {
				System.out.println(item);
				return ;
			}
			System.out.println("No DVD is matched!");
		}
	}
}
