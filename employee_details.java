# myjavaprograms
import java.util.Scanner;

public class Employee {
	String firstName;
	String lastName;
	double salary;
	public Employee()
	{
		firstName="\0";
		lastName="\0";
		salary=0.0;
	}
	public void setFirst(String x)
	{
		this.firstName=x;
	}
	public void setLast(String y)
	{
		this.lastName=y;
	}
	public void setSalary(double z)
	{
		if(z>0.0)
			this.salary=z;
	}
	public String getFirst()
	{
		return firstName;
	}
	public String getLast()
	{
		return lastName;
	}
	public double getSalary()
	{
		return salary;
	}
	public double annualIncome()
	{
		return (salary*12);
	}
	public double increment()
	{
		double x=((double)1/10)*(salary*12);
		return (x+salary*12);
	}
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		System.out.println("\nEnter details of 1st employee:");
		System.out.print("First name:");
		String s=input.nextLine();
		e1.setFirst(s);
		System.out.print("Last name:");
		String r=input.nextLine();
		e1.setLast(r);
		System.out.print("Monthly salary:");
		double p=input.nextDouble();
		e1.setSalary(p);
		Scanner in=new Scanner(System.in);
		System.out.println("\nEnter details of 2nd employee:");
		System.out.print("First name:");
		String a=in.nextLine();
		e2.setFirst(a);
		System.out.print("Last name:");
		String b=in.nextLine();
		e2.setLast(b);
		System.out.print("\nMonthly salary:");
		double c=in.nextDouble();
		e2.setSalary(c);
		System.out.println("\nDETAILS OF 1ST EMPLOYEE AS FOLLOWS...");
		System.out.print("First Name:"+e1.getFirst()+"\nLast Name:"+e1.getLast()+"\nMonthly salary:"+e1.getSalary());
		System.out.println("\nAnnual Income:"+e1.annualIncome()+"\nAfter 10% Increment,New salary:"+e1.increment());
		System.out.println("\nDETAILS OF 2ND EMPLOYEE AS FOLLOWS...");
		System.out.print("First Name:"+e2.getFirst()+"\nLast Name:"+e2.getLast()+"\nMonthly salary:"+e2.getSalary());
		System.out.println("\nAnnual Income:"+e2.annualIncome()+"\nAfter 10% Increment,New salary:"+e2.increment());
			}
	}
