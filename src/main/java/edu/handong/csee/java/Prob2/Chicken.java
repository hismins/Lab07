package edu.handong.csee.java.Prob2;//this class's package.

/**this class will print information of chickens.
 * *
 * @author miin
 *
 */
public class Chicken {//name of class.

	private String Name;//this variable "Name" is private.
	private double Price;//this variable "Price" is private.
	private int Rating;//this variable "Rating" is private.

	//Constructors
	public void Chicken()//a method Chicken.It initialize variables in this method.
	{
		this.Name = "";//initializes this.variable "Name"
		this.Price = 0.0;//initializes this.variable "Price"
		this.Rating = 0;//initializes this.variable "Rating"
	}

	public Chicken(String Name, double Price, int Rating)//another method Chicken which is input variables.
	{
		this.Name = Name;//initialize this.variable "Name" by input "Name"
		this.Price = Price;//initialize this.variable "Price" by input "Price"
		this.Rating = Rating; //initialize this.variable "Rating" by input "Rating"
	}

	//getter
	public String get_Name() {//this method get "Name" and return type is String.
		return this.Name; //it will return gettered "this.Name"
	}

	public double get_Price() {//this method get "Price" and return type is double.
		return  this.Price;//it will return gettered "this.Price"
	}
	public int get_Rating() {//this method get "Rating" and return type is int.
		return this.Rating;//it will return gettered "this.Rating"
	}

	//setter
	public void set_Name(String Name) {//this method set "Name" and input type is String.
		this.Name = Name;//put input "Name" to "this.Name"
	}
	public void set_Price(double Price) {//this method set "Price" and input type is double. 
		this.Price = Price;//put input "Price" to "this.Price"
	}
	public void set_Rating(int Rating) {//this method set "Rating" and input type is int.
		this.Rating = Rating;//put input "Rating" to "this.Rating"
	}
	public static void main(String[] args) {//this is main method
		Chicken	menu1 = new Chicken("Cheese_mustard", 16000.00, 0 );//put values into a instant of class "menu1"
		Chicken	menu2 = new Chicken("Honey_mustard", 16000.00, 1 );//put values into a instant of class "menu1"
		Chicken	menu3 = new Chicken("Spicey_chicken", 16000.00, 5 );//put values into a instant of class "menu1"

		menu1.set_Rating(3);//set Rating of "menu1" 3.
		menu2.set_Rating(4);//set Rating of "menu2" 4.
		menu3.set_Rating(1);//set Rating of "menu3" 1.

		System.out.println(menu1.get_Name() + "'s rating is " + menu1.get_Rating());//print this line.
		System.out.println(menu2.get_Name() + "'s rating is " + menu2.get_Rating());//print this line.
		System.out.println(menu3.get_Name() + "'s rating is " + menu3.get_Rating());//pring this line.
	}
}
