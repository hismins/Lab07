package edu.handong.csee.java.Prob2;

public class Chicken {

	private String Name;
	private double Price;
	private int Rating;

	public void Chicken()
	{
		this.Name = "";
		this.Price = 0.0;
		this.Rating = 0;
	}

	public Chicken(String Name, double Price, int Rating)
	{
		this.Name = Name;
		this.Price = Price;
		this.Rating = Rating; //I don't really understand. Why i must use all same name in package class, class, and method?
	}

	public String get_Name() {
		return this.Name;
	}

	public double get_Price() {
		return  this.Price;
	}
	public int get_Rating() {
		return this.Rating;
	}

	public void set_Name(String Name) {
		this.Name = Name;
	}
	public void set_Price(double Price) {
		this.Price = Price;
	}
	public void set_Rating(int Rating) {
		this.Rating = Rating;
	}
	public static void main(String[] args) {
		Chicken	menu1 = new Chicken("Cheese_mustard", 16000.00, 0 );
		Chicken	menu2 = new Chicken("Honey_mustard", 16000.00, 1 );
		Chicken	menu3 = new Chicken("Spicey_chicken", 16000.00, 5 );

		menu1.set_Rating(3);
		menu2.set_Rating(4);
		menu3.set_Rating(1);

		System.out.println(menu1.get_Name() + "'s rating is " + menu1.get_Rating());
		System.out.println(menu2.get_Name() + "'s rating is " + menu2.get_Rating());
		System.out.println(menu3.get_Name() + "'s rating is " + menu3.get_Rating());
	}
}
