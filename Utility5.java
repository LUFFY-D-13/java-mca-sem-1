import java.io.*;


 class Utility{
	
		public static long factorial(long value)
		{
			
			long fact=1;
			int i;
			for(i=1;i<=value;i++)
			{
				fact=fact*i;
			}
			return fact;
		}
		public static boolean isPrime(int value)
		{
			int count=0,i;
			for(i=2;i<value;i++)
			{
				if(i%value!=0)
				{
					count=1;
				}
			}
				if(count==1)
				{
					return false;
				}
				else
				{
					return true;
				}
					
		}
		
		public static boolean isEven(long value)
		{
				int even=0;
				
					if(value%2==0)
					{
						even=1;
					}
				
				if(even==1)
				{
					return true;
				}
				else
				{
					return false;
				}
						
		}
		public static boolean isOdd(long value)
		{
				int odd=0;
				
					if(value%2==1)
					{
						odd=1;
					}
				
				if(odd==1)
				{
					return true;
				}
				else
				{
					return false;
				}
						
		}
}

class main1{
public static void main(String args[])
	{
		long result;
		Utility obj=new Utility();
		
			result=obj.factorial(5);
			
			System.out.println("factorial is="+result);
			
			System.out.println("is Prime="+obj.isPrime(6));
			
			System.out.println(" is even="+obj.isEven(7));
			
			System.out.println(" is odd="+obj.isOdd(7));
			
			
	}
}