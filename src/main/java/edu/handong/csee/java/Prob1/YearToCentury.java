package edu.handong.csee.java.Prob1;
import java.util.Scanner;

public class YearToCentury {

	static int Year;
	static int Cent;
	
	public int whatYear() {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Input Year: ");
		return Year = keyboard.nextInt();
	}
	
	public int calc_Century() {
				
		if(Year%100==0) 
			Cent = Year/100;
		else Cent = (Year/100) + 1;
		
		return Cent;
		
	}
	public static void main(String[] args) {
		YearToCentury ThisIsYear = new YearToCentury(); 
		ThisIsYear.whatYear();
		ThisIsYear.calc_Century();
	
		
		System.out.println(Year + " is " + Cent + "th century.");
	}
		
}
		
		
			