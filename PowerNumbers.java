import java.util.Scanner;

public class PowerNumbers
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		//GETTING INPUTS
		System.out.println("Enter the number");
		String number=scanner.nextLine();
		int j,result,total=0;
		scanner.close();
		
		//LOOPING STATEMENT TO FIND THE POWER VALUE
		for(int i=0;i<number.length();i++)
		{
			if(i!=number.length()-1)
			{
				result=1;
				for(j=0;j<number.charAt(i+1)-'0';j++)
				{
					result*=number.charAt(i)-'0';
				}
				total+=result;
			}
			else
			{
				result=1;
				for(j=1;j<=number.charAt(0)-'0';j++)
				{
					result*=number.charAt(number.length()-1)-'0';
				}
				total+=result;
			}
		}
		System.out.println(total);
	}
}

