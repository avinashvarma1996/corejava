
public class PlayerDetails {

	public void viewDetails(String playerList[])
	 {
	  //playerList
	  for (int i = 0; i < playerList.length; i++) {
	            System.out.println(playerList[i] + " ");
	        }

	 }
	public void printPlayerDetailsWithSkill(String playerList[], String skill)

	{
	   
	 int count=0;
	 
	 for (int i = 0; i <playerList.length; i++) {
	        
	      
	      String dp = playerList[i];
	      boolean check = dp.contains(skill); 
	      if(check)
	      {
	       
	        System.out.println(playerList[i]);
	        count++;
	      }
	}
	//To check if there is no skill found
	if(count==0) 
	{
	 System.out.println("Skill not Found");
	}

	}


}
