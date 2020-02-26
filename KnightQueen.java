import java.util.Scanner;

public class KnightQueen 
{
	public static void main(String[] args) 
	{	
		//GETTING QUEEN AND KNIGHT POSITION AS INPUT FROM USER
		int queenrow,queencol,knightrow,knightcol;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the row and column of queen");
		queenrow = scanner.nextInt();
		queencol = scanner.nextInt();
		System.out.println("Enter the row and column of knight");
		knightrow = scanner.nextInt();
		knightcol = scanner.nextInt();
		scanner.close();
		boolean value = findPositions(queenrow,queencol,knightrow,knightcol);
		if(value)
		{
			System.out.println("They cut each other");
		}
		else
		{
			System.out.println("They do not cut each other");
		}
	}
	
	//FUNCTION TO RETURN THE BOOLEAN(TRUE OR FALSE) VALUES
	public static boolean findPositions(int qval1,int qval2,int kval3,int kval4)
	{
		//EITHER ROW OR COLUMN OF QUEEN AND KNIGHT ARE EQUAL THEY CUT EACH OTHER
		if(qval1==kval3 || qval2==kval4)
		{
			return true;
		}
		//TO CHECK DIAGONAL POSITION OF QUEEN
		else if(Math.abs(qval1-kval3)==Math.abs(qval2-kval4))
		{
			return true;
		}
		//TO CHECK KNIGHT POSITION
		else if((Math.abs(qval1-kval3)==1 && Math.abs(qval2-kval4)==2) || (Math.abs(qval1-kval3)==2 && Math.abs(qval2-kval4)==1))
		{
			return true;
		}
		return false;
	}
}
