package Personnes;

public class Robot {

	static final String NORD = "NORD";
	static final String EST = "EST";
	static final String SUD = "SUD";
	static final String OUEST = "OEUST";
	private int x, y;
	private String orientation;
	private String nom;
	private int puissance;
	
	public Robot(String nom) {
		this.nom = nom;
		x = 0;
		y = 0;
		orientation = NORD;
		puissance = (int)(100 * Math.random());
	}
		public Robot(String nom, int x, int y) {
		this.nom = nom;
		this.x = x;
		this.y = y;
		orientation = NORD;
		puissance = (int)(100 * Math.random());
	}
		public Robot(String nom, int x, int y, String orientation) {
		this.nom = nom;
		this.x = x;
		this.y = y;
		this.orientation = orientation;
		puissance = (int)(100 * Math.random());
	}
	
	public void tournerADroite() {
		switch(orientation) {
		case NORD :
			orientation = EST;
			break;
		case EST :
			orientation = SUD;
			break;
		case SUD :
			orientation = OUEST;
			break;	
		case OUEST :
			orientation = NORD;
			break;
		}
	}
	
	public void avancer() {
		switch(orientation) {
		case NORD :
			y += 1;
			break;
		case EST :
			x += 1;
			break;
		case SUD :
			y -= 1;
			break;	
		case OUEST :
			x -= 1;
			break;
		}
	}
	
	public boolean memePosition(Robot r) {
		if (this.x == r.x && this.y == r.y)
			return true;
		else
			return false;
	}
	
	public Robot lePlusFort(Robot r) {
		if (this.puissance > r.puissance)
			return this;
		else 
			return r;
	}
	
	public void afficherPosition() {
		System.out.println("Robot : " + nom + ", Position : X = " + x + 
				", Y = " + y + ", ORIENTATION = " + orientation + 
				", PUISSANCE : " + puissance);
	}

	public String getNom() {
		return nom;
	}
	

	

}
