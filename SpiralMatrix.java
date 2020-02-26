import java.util.Scanner;

public class SpiralMatrix
{
	public static void main(String[] args) 
	{
		// GETTING INPUTS FROM USER
		int i=0,j=0,left,right,top,bottom;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the two dimensional matrix");
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		int a[][] = new int[row][col];
		System.out.println("Enter the elements");
		
		//TO GET ELEMENTS IN A TWO DIMENSIONAL MATRIX FORM
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
		
		//TO FIND THE MIDDLE ELEMENT
		if(row%2==0)
		{
			left = row/2-1;
			top = left;
		}
		else
		{
			left = row/2;
			top = left;
		}
		right = left+1;
		bottom = right;
        i=0;j=0;
        
        //TO PRINT MATRIX IN A SPIRAL FORM FROM CENTER TO OUTER
        while(i<row && j<col )
        {
        	for (i=left;i<right;i++) 
            {
        		System.out.println(a[top][i]);
            }
            left--;
            for (i=top;i<bottom;i++)
            {
            	System.out.println(a[i][right]);
            }
            top--;
            for (i=right;i>left;i--) 
            {
              	System.out.println(a[bottom][i]);
            }
            right++;
            for (i=bottom;i>top;i--)
            {
              	System.out.println(a[i][left]);
            }
            bottom++;
		}
	}
}

