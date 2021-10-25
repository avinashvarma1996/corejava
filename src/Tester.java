import java.util.Scanner;


public class Tester {
	static Player p1;
	static PlayerBO pb1;
	static Team t1;
	static TeamBO tb1;
	static Match m1;
	static MatchBO mb1;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Player Count: ");
		int n = sc.nextInt();
		pb1 = new PlayerBO();
		String[] playerlist = new String[n];// To store the details of players
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter player "+(i+1)+" Detail: \n");
			System.out.println("Enter Player Name: ");
			sc.nextLine();
			String sp = sc.nextLine();
			
			System.out.println("Enter Country name: ");
			String c = sc.next();
			
			System.out.println();
			System.out.println("Enter Skill: ");
			String skill = sc.next();
			
			String as = sp+" "+c+" "+skill;
			playerlist[i] = as;
			p1 = new Player();
			p1.setName(sp);
			p1.setCountry(c);
			p1.setSkill(skill);	
		}
		
		System.out.println("Enter the Team Count: ");
		int n1 = sc.nextInt();
		tb1 = new TeamBO();
		String[] teamlist = new String[n1];// To store the details of players
		for(int i=0;i<n1;i++)
		{
			System.out.println("Enter Team "+(i+1)+"Detail: \n");
			System.out.println();
			System.out.println("Enter Team Name: ");
			sc.nextLine();
			String team = sc.nextLine();
			
			System.out.println("Enter Player name: ");
			String p1 = sc.next();
			
			String as1 = team+" "+p1+" ";
			teamlist[i] = as1;
			t1 = new Team();
			t1.setName(team);
			t1.setPlayer(p1);
		}
		
		System.out.println("Enter the Match Count: ");
		int n2 = sc.nextInt();
		mb1 = new MatchBO();
		String[] matchlist = new String[n2];// To store the details of players
		for(int i=0;i<n2;i++)
		{
			System.out.println("Enter Match "+(i+1)+"Detail: \n");
			System.out.println();
			System.out.println("Enter Match Date: ");
			sc.nextLine();
			String date = sc.nextLine();
			
			System.out.println("Enter Team1 name: ");
			String team1 = sc.next();
			System.out.println("Enter Team2 name: ");
			String team2 = sc.next();
			
			System.out.println("Enter Venue name: ");
			String v = sc.next();
			
			String as2 = date+" "+team1+" "+team2+" "+v+" ";
			matchlist[i] = as2;
			m1 = new Match();
			m1.setDate(date);
			m1.setTeam1(team1);
			m1.setTeam2(team2);
			m1.setVenue(v);
		}
		System.out.println();
		System.out.println();
		System.out.println("--- Menu ---");
		System.out.println("1.Find Team ");
		System.out.println("2.Find All Matches in A Specific Venue ");
		System.out.println("3.Exit");
		System.out.println("Enter Your Choice: ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter Match Date: ");
			String date = sc.next();
			mb1.findTeam(date, matchlist);
			System.out.println();
			
			break;
			
		case 2:
			System.out.println("Match Details____");
			System.out.println("Enter Team Name: ");
			String name = sc.next();
			
			mb1.findAllMatchesOfTeam(name, matchlist);
			break;
		case 3:
			System.out.println("You Choose to Exit..!");
		}		
		
	}


}
