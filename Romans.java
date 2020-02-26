import java.util.*; 

public class Romans
{
	public static void main(String[] args)
    {
    	//CREATING OBJECT FOR CLASS
         Romans convert = new Romans();
         //GETTING INPUTS
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the roman");
     	 String romans = scanner.nextLine();
     	 scanner.close();
     	 System.out.println("The value is"+ " " +convert.number(romans));
     }
    
    //FUNCTION TO CONVERT NUMBERS TO ROMAN NUMERALS
    public  int numeral(char value)
    {  
       	value = Character.toUpperCase(value);
    	if(value == 'I')
    	{
    		return 1;
    	}
    	else if(value == 'V')
    	{
    		return 5;
    	}
    	else if(value == 'X')
    	{
    		return 10;
    	}
    	else if(value == 'L')
    	{
    		return 50;
    	}
    	else if(value == 'C')
    	{
    		return 100;
    	}
    	else if(value == 'D')
    	{
    		return 500;
    	}
    	else if(value == 'M')
    	{
    		return 1000;
    	}      
    		return 0; 	
    }
    
    //GETTING INPUT AS NUMBER FROM USER
    public int number(String romans)
    {
    	int num = 0;
    	for(int i=0;i<romans.length();i++)
        {
    		int initial = numeral(romans.charAt(i));
    		if (i+1<romans.length())
    		{
    			int second = numeral(romans.charAt(i+1)); 
	            if (initial>=second) 
	            {
	            	num += initial;
	            } 
	            else
	            {
	            	num += second - initial; 
	            	i++;
	            } 
            } 
	        else
	        { 
	        	num = num + initial; 
	        }
       }
        return num;
    } 
}

    
  
