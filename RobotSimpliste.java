package exosPOOS4;

public class RobotSimpliste {
	int posx;
	int posy;
	String orientation;
	
	public void tournerDroite(String orientation) {
		switch (orientation) {
		case "Nord" : orientation = "Est";
		case "Est" : orientation = "Sud";
		case "Sud" : orientation = "Ouest";
		case "Ouest" : orientation = "Nord";
		};
	}
	
	
	
}
