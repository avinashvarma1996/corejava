
public class TestOverRangeException {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		//Accept Input as Total run and Faced Over
		
		System.out.println("Enter Total Runs:");
		float total_run =sc.nextFloat();
		
		System.out.println("Enter faced overs:");
		float faced_overs =sc.nextFloat();
		
		
		
		try {                                                  
			float run_rate=0;	
			if(faced_overs>0 && faced_overs<=20)
			{
				run_rate=total_run/faced_overs;                     
				System.out.println("Run Rate is:"+run_rate);
			}

			else {
				throw new OverRangeException ("Over is not in 1 to 20 range");     
			}
		}
			catch(OverRangeException e1)                                       
		{
				System.out.println("caught exception");
				System.out.println(e1.getMessage());                        
		}
			
		}
	
}




