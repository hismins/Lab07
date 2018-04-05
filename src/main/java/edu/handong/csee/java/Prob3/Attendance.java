package edu.handong.csee.java.Prob3;//this class's package.
import java.util.Random;//this class will and can use random.

public class Attendance {//name of class.
	private String name = "";//this variable is private
	private int year = 0;//this variable is private
	private String student_id = "";//this variable is private
	private int missed = 0;//this variable is private

	//Constructors
	public Attendance()//a method Attendance.It initialize variables in this method.
	{
		this.name = "Null";//initializes this.variable
		this.year = 0;//initializes this.variable
		this.student_id = "Null";//initializes this.variable
		this.missed = 0;//initializes this.variable
	}

	public Attendance(String name, int year, String student_id, int missed)//another method  which is input variables.
	{
		this.name = name;//initialize this.variable by input.
		this.year = year;//initialize this.variable by input.
		this.student_id = student_id;//initialize this.variable by input.
		this.missed = missed;//initialize this.variable by input.
	}
	//Getters
	public String get_name()//this method get "name" and return type is String.
	{
		return name;//it will return gettered "name".
	}
	public int get_year()//this method get "year" and return type is int.
	{
		return year;//it will return gettered "year"
	}

	public String get_id()//this method get "id" and return type is String.
	{
		return student_id; //it will return gettered "id
	}
	public int get_missed()//this method get "missed" and return type is int. 
	{
		return missed; //it will return gettered "missed"
	}

	//Setters
	public void set_name(String name)//this method set "name" and input type is String.
	{
		this.name = name;//put input "name" to "this.name"
	}
	public void set_year(int year)//this method set "year" and input type is int.
	{
		this.year = year;//put input "year" to "this.year"
	}
	public void set_id(String student_id)//this method set "id" and input type is String.
	{
		this.student_id = student_id;//put input "id" to "this.id"
	}
	public void set_missed(int missed)//this method set "missed" and input type is int.
	{
		this.missed = missed;//put input "missed" to "this.missed"
	}


	public static void main(String[] args) {//this is main method.
		Attendance s_1 = new Attendance();//instantiates class Attendance to s_1
		Attendance s_2 = new Attendance();//instantiates class Attendance to s_2
		Attendance s_3 = new Attendance("Lucas", 1, "21833222", 0);//instantiates class Attendance to s_3 and put values.
		Attendance s_4 = new Attendance("Martha", 2, "21733444", 0);//instantiates class Attendance to s_1 and put values.

		s_1.set_name("Jess"); s_1.set_year(4); s_1.set_id("21400999"); s_1.set_missed(0);//sets values of s_1.
		s_2.set_name("Kent"); s_2.set_year(2); s_2.set_id("21700111"); s_2.set_missed(0);//sets values of s_1.

		Random randomGenerator = new Random();//instantiates random.

		s_1.set_missed(randomGenerator.nextInt(10));//sets value of s_1's missed to random.
		s_2.set_missed(randomGenerator.nextInt(10));//sets value of s_2's missed to random.
		s_3.set_missed(randomGenerator.nextInt(10));//sets value of s_3's missed to random.
		s_4.set_missed(randomGenerator.nextInt(10));//sets value of s_4's missed to random.

		if(s_1.get_missed() > 6)//condition.
		{
			System.out.println("I'm sorry " + s_1.get_name() + ". You fail this course");//print this line.
			System.out.println(s_1.get_name() + " - Number of absence: " + s_1.get_missed());//print this line.
		}
		else//if condition is not true, executes this line.
			System.out.println("We'll see about the grade, " + s_1.get_name());//print this line.
		
		if(s_2.get_missed() > 6)//condition.
		{
			System.out.println("I'm sorry " + s_2.get_name() + ". You fail this course");//print this line.
			System.out.println(s_2.get_name() + " - Number of absence: " + s_2.get_missed());//print this line.
		}
		else//if condition is not true, executes this line.
			System.out.println("We'll see about the grade, " + s_2.get_name());//print this line.
		
		if(s_3.get_missed() > 6)//condition.
		{
			System.out.println("I'm sorry " + s_3.get_name() + ". You fail this course");//print this line.
			System.out.println(s_3.get_name() + " - Number of absence: " + s_3.get_missed());//print this line.
		}
		else//if condition is not true, executes this line.
			System.out.println("We'll see about the grade, " + s_3.get_name());//print this line.
		
		if(s_4.get_missed() > 6)//condition.
		{
			System.out.println("I'm sorry " + s_4.get_name() + ". You fail this course");//print this line.
			System.out.println(s_4.get_name() + " - Number of absence: " + s_4.get_missed());//print this line.
		}
		else//if condition is not true, executes this line.
			System.out.println("We'll see about the grade, " + s_4.get_name());

	}

}


