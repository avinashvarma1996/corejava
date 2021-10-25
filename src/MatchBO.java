
public class MatchBO {
	public void viewDetails(String matchList[])
	 {
	  //playerList
	  for (int i = 0; i < matchList.length; i++) {
	            System.out.println(matchList[i] + " ");
	        }
	 }

public Match createMatch(String data, Team[] teamList) {
		
		Match m  = new Match();
		for (int i = 0; i < teamList.length; i++) 
		{
			System.out.println("");
		}
		return m;
}

public void findTeam(String matchDate, String[] matchlist) {
	
	int count=0;
	 
	 for (int i = 0; i < matchlist.length; i++) {
	       
	      String dp = matchlist[i];
	      boolean check = dp.contains(matchDate); 
	      if(check)
	      {
	        System.out.println(matchlist[i]);
	        count++;
	      }
	}
	//To check if there is no match date found
	if(count==0) 
	{
	 System.out.println("Match Date not Found");
	}	
}

public void findAllMatchesOfTeam(String teamName, String[] matchlist) {
	int count=0;
	 
	 for (int i = 0; i < matchlist.length; i++) {
	       
	      String dp = matchlist[i];
	      boolean check = dp.contains(teamName); 
	      if(check)
	      {
	        System.out.println(matchlist[i].toString());
	        count++;
	      }
	}
	//To check if there is no match date found
	if(count==0) 
	{
	 System.out.println("Team Name not Found..!");
	}	
	
}
}
