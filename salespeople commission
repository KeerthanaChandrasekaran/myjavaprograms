import java.util.Scanner;
public class Salespeople {
	double grossPay;
	int total;
	Salespeople()
	{
		grossPay=0.0;
		total=0;
	}
	void getGross(double d)
	{
		this.grossPay=d;
	}
	void calculate(double d)
	{
		this.total=200+(int)(0.09*grossPay);
	}
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("enter the no. of salespeople:");
		int n=input.nextInt();
		Salespeople s[]=new Salespeople[n];
		for(int i=0;i<n;i++)
			s[i]=new Salespeople();
		System.out.printf("\nenter the gross pay for %d salespeople:",n);
		for(int i=0;i<n;i++)
		{   
			System.out.printf("\nSalesman %d:",i+1);
			double x=input.nextDouble();
			s[i].getGross(x);
			s[i].calculate(x);
		}
		int count[]=new int[11];
		for(int i=2;i<11;i++)
			count[i]=0;
		for(int i=0;i<n;i++)
		{
			if((s[i].total>=200)&&(s[i].total<300))
			++count[2];

			else if((s[i].total>=300)&&(s[i].total<400))
			++count[3];
			

			else if((s[i].total>=400)&&(s[i].total<500))
				++count[4];

			else
				if((s[i].total>=500)&&(s[i].total<600))
				++count[5];

			else if((s[i].total>=600)&&(s[i].total<700))
				++count[6];

			else if((s[i].total>=700)&&(s[i].total<800))
				++count[7];

			else if((s[i].total>=800)&&(s[i].total<900))
				++count[8];

			else if((s[i].total>=900)&&(s[i].total<1000))
				++count[9];

			else
				++count[10];
			
		}
		System.out.println("\n  Range\t\tNo.of salespeople");
		for(int i=2;i<11;i++)
		{
			int j=i*100;
			System.out.printf("%d $%d above:\t%d\n",i-1,j,count[i]);
		}
		}
		
	}


