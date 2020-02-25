import java.util.Scanner;

public class Anagram 
{
	public static void main(String[] args) 
	{
		//GETTING INPUTS FROM USER
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = scanner.nextLine();
		String wordarray[] = new String[input.length()];
		input += '\0';
		String newstring = "";
		scanner.close();
		
		//STATEMENT TO SPLIT WORDS FROM A GIVEN PARAGRAPH
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==32 || input.charAt(i)=='\0')
			{
				count++;
				newstring = "";
			}
			else
			{
				newstring += input.charAt(i);
			}
			wordarray[count] = newstring;
			System.out.println(wordarray[count]);
		}
		
		//TO FIND THE EQUAL LENGTH OF WORDS
		for(int j=0;j<count-1;j++)
		{
			for(int k=j+1;k<count;k++)
			{
				if(wordarray[j].length()==wordarray[k].length() && wordarray[j]!="\0" && wordarray[k]!="\0")
				{
					int length1 = anagram(wordarray[j],wordarray[k]);
					if(length1==wordarray[j].length())
					{
						System.out.print(wordarray[j]+" and ");
						newstring += wordarray[k];
						System.out.println(newstring+" are anagrams");
						wordarray[k] = "\0";
					}
					newstring = "\0";
				}
			}
		}	
	} 
	
	//FUNCTION TO CHECK THAT THE WORD IS ANAGRAM OR NOT
	public static int anagram(String word1,String word2)
	{
		int length=0,i=0;
		char value1[] = new char[100];
		char value2[] = new char[100];
		for(i=0;i<word1.length();i++)
		{
			value1[i] = word1.charAt(i);
		    value2[i] = word2.charAt(i);
		}
		for(int j1=0;j1<i;j1++)
		{
			for(int k1=0;k1<i;k1++)
			{
				if(value1[j1]==value2[k1])
				{
					length++;
				    value2[k1] = '#';			
				}
			}
		}
		return length;
	}
}

	
