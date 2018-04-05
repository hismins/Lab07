package edu.handong.csee.java.Prob1;//this class's package.
import java.util.Scanner; //this class will and can use scanner.

public class YearToCentury {//class name.

	static int Year;//this static variable can use in anywhere of class.
	static int Cent;//this static variable can use in anywhere of class.

	public int whatYear() {//public method which return type is int.
		Scanner keyboard = new Scanner(System.in);//instantiate to Scan.

		System.out.println("Input Year: ");//print this line.
		return Year = keyboard.nextInt();//next input int will put to variable "Year"
	}

	public int calc_Century() {//public method which return type is int.

		if(Year%100==0) //this is condition. next line will be executed if the rest of "Year" is 0.
			Cent = Year/100; //put right side to left side.
		else Cent = (Year/100) + 1;//if condition is not true, execute this.

		return Cent;//this method returns "Cent"

	}
	public static void main(String[] args) { //this is main method.
		YearToCentury ThisIsYear = new YearToCentury(); //instantiate class to name of "ThisIsYear"
		ThisIsYear.whatYear();//execute method whatYear() in instant "ThisIsYear".
		ThisIsYear.calc_Century();//excute method calc_Century() in instant "ThisIsYear"


		System.out.println(Year + " is " + Cent + "th century."); //print this line.
	}

}


