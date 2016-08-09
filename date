import java.util.Scanner;
public class Date{
	int month;
	int day;
	int year;
	
	Date()
	{
		month=0;
		day=0;
		year=0;
		
	}
	void setMonth(int x)
	{
		this.month=x;
	}
	void setDay(int y)
	{
		this.day=y;
	}
	void setYear(int z)
	{
		this.year=z;
	}
	Scanner input=new Scanner(System.in);
	void getMonth()
	{

		int m=input.nextInt();
		setMonth(m);
	}
	void getDay()
	{
	
		int d=input.nextInt();
		setDay(d);
	}
	void getYear()
	{   
		int y=input.nextInt();
		setYear(y);
	}
	void displayDate()
	{
		System.out.print("Date in <mm/dd/yy> format:"+month+"/"+day+"/"+year);
	}

	public static void main(String [] args)
	{
		Date t=new Date();
		System.out.print("enter the month:");
   	t.getMonth();
		System.out.println();
		System.out.print("enter the day:");
		t.getDay();
		System.out.println();
		System.out.print("enter the Year:");
		t.getYear();
		System.out.println();
	 t.displayDate();	
	}
}
