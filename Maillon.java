package DEV;

public class Maillon {

	private int elt;
	private Maillon suivant;

	Maillon(int e, Maillon s) {
		elt = e;
		suivant = s;
	}

	public int getElt() {
		return elt;
	}

	public void setElt(int elt) {
		this.elt = elt;
	}

	public Maillon getSuivant() {
		return suivant;
	}

	public void setSuivant(Maillon suivant) {
		this.suivant = suivant;
	}
}
