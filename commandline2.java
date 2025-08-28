import java.io.*;
import java.util.Arrays;

public class commandline2 
{
    public static void main(String[] args) {
		
		    if (args.length != 5)
				{
					System.out.println("Please enter only 5 integer value");
					return;
				}		

		int [] arr=new int[5];
		int i;
         arr[0] = Integer.parseInt(args[0]);
		 arr[1]	= Integer.parseInt(args[1]);
         arr[2] = Integer.parseInt(args[2]);
         arr[3]	= Integer.parseInt(args[3]);
         arr[4] = Integer.parseInt(args[4]);

        
    
	 
	 Arrays.sort(arr);
	 
	 for(i=0;i<=4;i++)
	 {
		 System.out.println(""+arr[i]);
	 }
		System.out.println("minimun num is"+arr[0]);
		System.out.println("maximun num is"+arr[4]);
	}
} 