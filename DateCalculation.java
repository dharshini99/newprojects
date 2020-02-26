import java.util.Scanner;

public class DateCalculation
{
	static int sum = 0;
	static int month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	//FUNCTION TO CALCULATE THE TOTAL MONTHS OF THE GIVEN YEAR AND CURRENT YEAR
	static int newDate(int mon1,int mon2,int day1,int day2)
	{
		sum = 0;
		for(int i=0;i<mon1-1;i++)
		{
			sum += month[i];			
		}		
		sum = 365-(sum+Math.abs(day1-1));
		for(int i=0;i<mon2-1;i++)
		{
			sum += month[i];
		}
		sum += day2;
		return sum;
	}
	
	public static void main(String[] args)
	{
		// GETTING INPUTS FOR CALCULATING THE DURATION BETWEEN GIVEN DATES
		int date1,month1,year1,date2,month2,year2,count=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enetr the first date");
		date1 = scanner.nextInt();
		month1 = scanner.nextInt();
		year1 = scanner.nextInt();
		System.out.println("Enter the second date");
		date2 = scanner.nextInt();
		month2 = scanner.nextInt();
		year2 = scanner.nextInt();
		scanner.close();
		int result = 0,i=0;
				
		//TO FIND THE LEAP YEAR COUNT
		for(i=year1;i<=year2;i++)
		{
			if(i%4==0)
			{
				count++;
			}
		}
		if(month1>2)
		{
			count = count-1;
		}
		if(month2<3 && year2%4==0)
		{
			count = count-1;
		}
		
		//TO CALCULATE DAYS FROM GIVEN DATE TO CURRENT DATE
		for(i=year1+1;i<year2;i++)
		{
			for(int j=0;j<12;j++)
			{
				sum += month[j];
		    }
		}
		if(year1 == year2)
		{
			if(month1!=month2)
			{
				for(i=month1;i<month2;i++)
			    {
					result += month[i-1];
					System.out.println(result+" new ");
			    }
			    result = Math.abs(result-date1)+date2+count; 
			}
			else
			{
				result = Math.abs(date2 - date1);
			}
		}
		else
		{
			result = sum+count+newDate(month1,month2,date1,date2);
		}
	   System.out.println("The total number of days is "+ result);
	}	   
}