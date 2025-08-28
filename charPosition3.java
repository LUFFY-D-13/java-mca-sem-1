import java.io.*;
import java.util.Scanner;

public class charPosition3 
{
    public static void main(String[] args) {
		
		String str;
		int i,count=0,index;
		char ch;
		
		
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter a string: ");
        str = sc.nextLine();

        
        System.out.print("Enter a character to find: ");
        ch = sc.next().charAt(0); 

         index = str.indexOf(ch);

			if (index != -1) 
			{
				System.out.println("position character="+ch+" "+index);
			} 
				else 
			{
				System.out.println("not found in the string."+ch);
			}
			
			 for (i = 0; i < str.length(); i++) 
				{
					if (str.charAt(i) == ch) 
					{
						 count++;
					}
						
				}
				System.out.print("frequency of character="+count);
			
    }
}
