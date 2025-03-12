package tcAssignment;

public class Player {
	String name;
	String position;
	int jerseyNumber;
	public void playGame() {
		System.out.println(name + " position " + position);
	}
	public void train() {
		System.out.println("calling train method");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getJerseyNumber() {
		return jerseyNumber;
	}
	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	
}
