package ExceptionHandling;

public class TryAndCatch {

	public static void main(String[] args)
	//This exception like a traffic control
	//Jith issue yet aahe te saide la theun baki test continue karnar try and cath block through
	{
		
//	int a=10;
//	int b=0;
//	
//	//exception
//	int c=a/b;
//	System.out.println(c);
	
	//He varch jepa aapn run karto teva ArithmeticException yete tayla handle kru
	//Line number 14 and 15 mule exception yet aahe
	//Jay code mule problem yet aahe tayla aapn try block madhe theu
	//aani solution la catch block madhe theu
		
		try
		{
		int a=10;
		int b=0;
		}
		
        catch(Exception e) //Catch chaky khali error yete so Exceptionj cha ek object eth theva lagto exception class 
		//aani taychaek objet e aapn taychay block madhe theu
        {
        	System.out.println("we can not divid the value by zero");
        	System.out.println("change the value of b variable");
        }
	
	        System.out.println("Continue the program");
	        System.out.println("End of program");

	}

}
