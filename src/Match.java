
public class Match {
	private String  date;
	private String team1;
	private String team2;
	private String venue;
	private Team team;
public Match() {
		
}
public Match(String date, String team1, String team2, String venue, Team team) {
	super();
	this.date = date;
	this.team1 = team1;
	this.team2 = team2;
	this.venue = venue;
	this.team = team;
}
public Match createMatch(String data, Team[] teamList) {
	return null;
	
}
@Override
public String toString() {
	String.format(date, team1,team2,venue);
	return super.toString();
}

public String getDate() {
	return date;
}
public String getTeam1() {
	return team1;
}
public String getTeam2() {
	return team2;
}
public String getVenue() {
	return venue;
}
public void setDate(String date) {
	this.date = date;
}
public void setTeam1(String team1) {
	this.team1 = team1;
	
}
public void setTeam2(String team2) {
	this.team2 = team2;
	
}
public void setVenue(String venue) {
	this.venue = venue;
}
public boolean contains(String matchDate) {
	// TODO Auto-generated method stub
	return false;
}

}
