import java.util.Scanner;

public class WaterCalculation
{
	public static void main(String[] args) 
	{
		//GETTING INPUTS FROM USER		
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int arr[] = new int[length];
		int top[] = new int[length];
		int bottom = 0;
		int total=0,i=0;
		for(i=0;i<length;i++)
		{
			arr[i]=scanner.nextInt();
		}
		scanner.close();
		top[0] = bottom = arr[0];
		
		//STORE THE MINIMUM VALUE IN BOTH TOP AND BOTTOM VARIABLES 
		for(i=1;i<length;i++)
		{
			if(arr[i]<top[0])
			{
				top[0]=arr[i];
				bottom = arr[i];
			}
		}
		//COMPARE AND STORE THE MAXIMUM VALUE IN TOP ARRAY
		for(i=1;i<length;i++)
		{
			if(top[i-1]>arr[i-1])
			{
				top[i] = top[i-1];
			}
			else
			{
				top[i] = arr[i-1];
			}
			System.out.println(top[i]+" new ");
		}
		for(i=length-1;i>=1;i--)
		{
			//COMPARE AND STORE THE MAXIMUM VALUE IN BOTTOM ARRAY
			if(bottom>arr[i])
			{
				bottom = bottom;
			}
			else
			{
				bottom=arr[i];
			}
			System.out.println(bottom+" old ");
			
			//STORE THE DIFFERENCE IN TOTAL VARIABLE
			if(top[i]<bottom)
			{
				if(top[i]>arr[i])
                {
					total+=top[i]-arr[i];
                }
			}
			else
			{
				if(bottom>arr[i])
				{
					total+=bottom-arr[i];					
				}
			}
			System.out.println(total);
		}
		System.out.println(total);
	}
}
		