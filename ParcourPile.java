package DEV;

public class ParcourPile {
	int courant;
	PileEntier pile;

	public ParcourPile(int courant, PileEntier pile) {
		super();
		this.courant = courant;
		this.pile = pile;
	}
	
	public int eltCourant() {
		return pile.EltDansPile(courant); 
	}
	
	public void eltSuivant() {
		courant --;
	}
	
	public boolean estEnFin() {
		if (courant == -1)
			return true;
		else
			return false;
}
}
