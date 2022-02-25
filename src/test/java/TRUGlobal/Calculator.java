package TRUGlobal;

interface Cal
{
	// void SwitchOn();
	 
	// void sum(int input);
	
	int Substract(int First, int Second);
}

public class Calculator {

	public static void main(String[] args) 
	{
		/*
		 * Cal cal=() -> { System.out.println(" Switch on "); };
		 * 
		 * cal.SwitchOn();
		 */
		
		/*
		 * Cal cal= (int input) -> { System.out.println("Sum:" +input); };
		 * cal.sum(543256);
		 */
		
		
		Cal cal=(First, Second) -> 
		{
			//return Second-First;   // we can also remove return keyword
			//or
			if(Second  < First)
				throw new RuntimeException("Second is greater");
			else
			{
				return Second-First;
			}
				
		};
		System.out.println(cal.Substract(4, 49));
	}

}
