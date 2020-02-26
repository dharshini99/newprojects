import java.util.Scanner;

public class Isomorphic 
{
	public static void main(String[] args) 
	{
		//GLOBAL VARIABLE
		int num1 = 0;
		char value = 0;
		String newvalue = "";
		
		//GETTING INPUTS
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the string");
		String string = scanner.next();
		scanner.close();
		
		//LOOPING STATEMENT TO SPLIT CHARACTERS AND NUMBERS
		for(int i=0;i<string.length();i++)
		{
			if((string.charAt(i)>='0') && (string.charAt(i)<='9'))
			{
    			num1 = string.charAt(i)-'0';
    			//CONDITION TO CHECK FOR DOUBLE DIGITS
    			while(i!=string.length()-1 && i+1<string.length())
    			{
    				if((string.charAt(i+1)>='0' && string.charAt(i+1)<='9'))
				    {
						num1 *= 10;
						num1 += string.charAt(i+1)-'0';
						i++;
			        }
    				else
    				{
    					break;
    				}
    			}
    			
    			//PRINT CHARACTERS UPTO NEARBY NUMBERS
				for(int j=0;j<num1;j++)
				{
					System.out.println(newvalue);
					
				}
				newvalue = "";
			}
		    else //TO STORE CHARACTERS
		    {
				if(((string.charAt(i)>='a') && (string.charAt(i)<='z')) || (string.charAt(i)>='A') && (string.charAt(i)<='Z'))
				{
				    value = string.charAt(i);
				    newvalue += value;
				}
		    }
		}
	}
}

