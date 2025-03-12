package tcAssignment;

import java.util.List;

public class Team {
	private String teamName;
	private String city;
	private String division;
	private List<Player> players;
	public void playGame() {
		System.out.println("play well");
		
	}
	public void hireCoach() {
		System.out.println();
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
}
