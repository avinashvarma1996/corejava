import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PlayersBO1
{
	//method to print the details of players

 public void displayPlayerDetails()throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter number of players");
	int n=Integer.parseInt(br.readLine());
	System.out.println("Do you know the details of the captain? Type Yes/No");
	String know= br.readLine();
	String capdetails="Captain details not found";
	
	//try catch block to handle null pointer exception when their is no caption mentioned
		try
		{
			if(know.length()==0)
			{
				throw new NullPointerException();
			}
			else if(know.equalsIgnoreCase("yes"))
				{
					System.out.println("Enter name of the captain");
					String captainame=br.readLine();
					System.out.println("Enter country of the captain");
					String capcountry=br.readLine();
					System.out.println("Enter skillset of the captain");
					String capskill=br.readLine();
					capdetails= captainame+capcountry+capskill;
				}
		}
			catch(NullPointerException e)
			{
				System.out.println(e);
			}
		//take the names of player as input
Player player[]=new Player[n];
 	
	
	for(int i=0;i<n;i++)
	{
	System.out.println("Enter name of the player"+" "+(i+1));
	String name= br.readLine();
	System.out.println("Enter country of the player"+" "+(i+1));
	String country= br.readLine();
	System.out.println("Enter skillset of the player"+" "+(i+1));
	String skill= br.readLine();
Player player1=new Player(name,country,skill);
	player[i]=player1;
	}
	System.out.println(capdetails);
	for(int j=0;j<player.length;j++)
	{
	System.out.println(player[j]);

	}
	}
}
