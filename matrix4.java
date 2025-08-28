import java.io.*;
import java.util.Scanner;

public class matrix4
{
	public static void main(String args[])
	{
		int [][] r=new int[3][3];
		int [][] c=new int[3][3];
		int [][] k=new int[3][3];
		int i,j;
		
		
		Scanner sc=new Scanner(System.in);
		
		
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				
				System.out.print("array value enter"+(i+1)+"of"+(j+1)+"::");
				while (!sc.hasNextInt())
				{
					System.out.print("please enter integer value");
						sc.next();
				}
				r[i][j]=sc.nextInt();
			}
			
		}
		
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
					
				System.out.print("array value enter"+(j+1)+"of"+(j+1)+"::");
				 while (!sc.hasNextInt())
					 {
						 System.out.print("please enter integer value");
							sc.next();
					 }
					 c[i][j]=sc.nextInt();
			}
		}
		System.out.println("addition");
		 for(i=0;i<=2;i++)
		 {
			 for(j=0;j<=2;j++)
			 {
				k[i][j]=r[i][j]+c[i][j];
				 System.out.print(k[i][j]+ "\t");
			 }
			  System.out.println();
		 }
		 
		 System.out.println("substration");
		 for(i=0;i<=2;i++)
		 {
			 for(j=0;j<=2;j++)
			 {
				k[i][j]=r[i][j]-c[i][j];
				 System.out.print(k[i][j]+ "\t");
			 }
			  System.out.println();
		 }
		 System.out.println("multiplication");
		 for(i=0;i<=2;i++)
		 {
			 for(j=0;j<=2;j++)
			 { 
				for (int add = 0; add < 3; add++) 
				{
					k[i][j]=k[i][j]+r[i][add]*c[add][j];
				}
					System.out.print(k[i][j]+ "\t");
			 }
				System.out.println();
		 }
				
	 }
	
	
}
