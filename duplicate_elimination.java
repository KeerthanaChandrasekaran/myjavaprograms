import java.util.Scanner;
public class Arrays {
	public static void main(String args[])
	{   
		int i,j,temp=1;
		int a[]=new int[5];
		System.out.println("enter any 5 values between 10 & 100:");
		Scanner input=new Scanner(System.in);
		for(i=0;i<a.length;i++)
		{ 
			if(temp<=5)
		{
			System.out.printf("\nenter value%d:",temp++);
            int x=input.nextInt();		 
	     	System.out.print("\nAfter duplicate elimination,values are:");
		    int count=0;
			for(j=0;j<i;j++)			
			{
				if(x==a[j])
				{
					count++;
					break;
				}
			 }
			if(count==0)
			{
				a[i]=x;
				for(int k=0;k<=i;k++)
				System.out.print(" "+a[k]);
			}
			else
			{   i--;
				for(int k=0;k<=i;k++)
					System.out.print(" "+a[k]);
		    }
		}
		else
			break;
		
		}
	}
}


