import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DuplicateIdException {
public static void main(String[] args) throws IOException {
		
		int numberofplayers ;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Accept input data from user
		System.out.println("Enter the team name:");
		@SuppressWarnings("unused")
		String teamname = br.readLine();
		
		System.out.println("Enter the number of players suggested");
		numberofplayers = Integer.parseInt(br.readLine());
		String playerid[] = new String[numberofplayers];
		String playername[] = new String[numberofplayers];
		
		for(int i=0;i<numberofplayers;i++) {
			System.out.println("enter the player "+(i+1)+" details");
			playerid[i] = br.readLine();
			playername[i] = br.readLine();
		}
		
		
		
		for(int k=0;k<numberofplayers;k++) {
			
			for(int j=k+1;j<numberofplayers;j++) {
				                                  
				try {
					if(playerid[k].equals(playerid[j])) {               //logic to check duplicate id in array
						playername[j]=br.readLine();
					}
					
					for(int k1=0;k<numberofplayers;k++) {
						for(int j1=k+1;j<numberofplayers;j++) {
							
							try {
								if(playerid[k].equals(playerid[j])) {         //if duplicate id found then throw the exception
									throw new DuplicationIdException();
								}
							}
							catch(Exception e) {                             //catch the exception
								System.out.println(e);
							}
						}
					}
					for(int l=0;l<numberofplayers;l++) {
						System.out.println(playerid[l]+"  "+playername[l]);       //display all unique id and name of player    
					}
				}
				finally {
					
				}
			}
			
			
		}
	}
}

class DuplicationIdException extends Exception{
	private static final long serialVersionUID = 1L;
	DuplicationIdException(){
		super("player ID must be unique");          //dsiplay message if duplicate id is there
	}
}



