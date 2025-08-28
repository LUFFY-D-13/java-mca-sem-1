
import java.io.*;
import java.util.Scanner;



public class a1prime
{
		public static void main(String args[])
		{
				int n,i=0,prime=0;
				
				Scanner sc=new Scanner(System.in);
				
				System.out.print("enter n=");
				n=sc.nextInt();
				
				
				for(i=2;i<n;i++)
				{
						if(n%i!=0)
						{
								continue;
						}
						else
						{
							
							prime=1;
							break;
							
						}
				}
				
				if(prime==1)
				{
					System.out.print("number is not prime"+n);
				}
				else
				{
					System.out.print("number is  prime:-"+n);
				}
			
		}
		
}
