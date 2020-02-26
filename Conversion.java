import java.util.*;

public class Conversion
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		//GETTING INPUTS FROM USER
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		Conversion convert = new Conversion();
		System.out.println("The roman is" +convert.intToNumeral(number));
		scanner.close();
	}
	
	//FUCTION TO RETURN THE EQUIVALENT ROMAN NUMERALS 
	public String intToNumeral(int value)
	{
		String roman = " ";
		while(value!=0)
		{
			if(value >= 1000 && value <= 10000 )
			{
				roman += "M";
				value -= 1000;
			}
			else if(value >= 500 && value <= 899)
			{
				roman += "D";
				value -= 500;
			}
			else if((value >= 100 && value <=499) || (value >=900 && value <= 999))
			{
				if(value >= 100 && value <=399)
				{
					roman += "C";
					value -= 100;
				}
				else
				{
					roman += "C";
					value += 100;
				}
			}
			else if(value >= 50 && value <= 89)
			{
				roman += "L";
				value -= 50;
			}
			else if((value >= 10 && value <= 49)||(value >= 90 && value <= 99))
			{
				if(value >= 10 && value <= 39)
				{
					roman += "X";
					value -= 10;
				}
				else
				{
					roman += "X";
					value += 10;
				}
			}
			else if(value == 9) 
			{
				roman += "IX";
				value -= 9;
			}
			else if(value >= 5 && value<=8)
			{
				roman += "V";
			    value -= 5;
			}
			else if(value >= 1&& value <=4)
			{
				if(value >= 1 && value <= 3)
				{
					roman += "I";
					value -= 1;
				}
				else
				{
					roman += "I";
					value += 1;
				}
			}
		}
		return roman;
	 }
}
 