import java.util.Scanner;

public class FrequentWords
{
	public static void main(String[] args)
	{
		//GETTING INPUTS FROM USER
		int count=0,i=0,length=1,k=0,j1=0;
		int[] value = new int[500];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = scanner.nextLine();
		input += '\0';
		scanner.close();
		//STRING ARRAY TO STORE WORDS ONE BY ONE IN A ARRAY INDEX
		String wordarray[] = new String[input.length()];
		String newstr = "";
		
		//LOOPING STATEMENT TO SPLIT WORDS IN A GIVEN PARAGRAPH
		for(i=0;i<input.length();i++)
		{
			if(input.charAt(i)==32||input.charAt(i)=='\0')
			{
				count++;
				newstr="";
			}
			else
			{
				newstr += input.charAt(i);
			}
			wordarray[count] = newstr;
		}
		i=0;j1=0;
		
		//TO FIND THE FREQUENT WORD COUNT FROM THE GIVEN PARAGRAPH
		for(int j=0;j<count;j++)
		{
			for(k=j+1;k<count;k++)
			{
				if((wordarray[j].length()==wordarray[k].length()) && wordarray[k]!="\0")
				{
					if(wordarray[j].equals(wordarray[k]))
					{
						length++;
						wordarray[k]="\0";
					}
				}
			}
			if(length>=1 && wordarray[k]!="\0" && wordarray[j]!="\0")
			{
				value[i] = length;
				wordarray[j1] = wordarray[j];
				i++;j1++;
				length=1;
			}
		}
			
		//TO SORT THE WORDS IN DESCENDING ORDER BASED ON THE FREQUENT COUNT IN THE PARAGRAPH  
		for(j1=0;j1<i;j1++)
		{
			for(int k1=j1+1;k1<=i;k1++)
			{
				if(value[j1]>=value[k1])
				{
					continue;
				}
				else
				{
					int temp;
					String s;
					temp = value[j1];
					value[j1] = value[k1];
					value[k1] = temp;
					s = wordarray[j1];
					wordarray[j1] = wordarray[k1];
					wordarray[k1] = s;
				}
			}
		}
		
		//TO PRINT TOP 5 FREQUENT WORDS ALONE
		for(i=0;i<5;i++)
		{
			System.out.println(wordarray[i]+" repeated "+value[i]+" times ");
		}
	}
}