package ExceptionHandling;

public class TryAndCatchEx3 {

	public static void main(String[] args)
	{
	int a[]= {10,20,30};
	         //0  1  2
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	
	
	//System.out.println(a[3]);
	//Element 3sathi kuthlach element nahi so ArrayIndexOutOfBoundsException yet aahe tayla try and cath through aapn solve karu
	
	   try 
	   {
		System.out.println(a[3]);
	   }
	   
		catch(Exception e)
		{
			System.out.println("change the value of index");
		}

		
		//////////Varcha prog end khalcha finallu block sathi
	   
	   //Aapn finally block kaywork pn use karu shkto when we need to write the independant code
	   //Independant code sathi finally block use karto
       //So eth 300 ans pn yenar so jeva aaplayla kahi independant code run krava lagto teva to try cath block vr depend nahi raht
	   //tayla aapn finally block madhe the shkto
	   
		finally 
		{
		System.out.println(100+200);
		}
	   System.out.println("continue");
		System.out.println("End");
	   
	   
		
	}
	}
	
