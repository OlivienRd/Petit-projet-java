package DEV;

public class TestParcourPile {

	public static void main(String[] args) {
		PileEntier p= new PileEntier(); 
		PileEntier pile = new PileEntier();
		
		pile.empiler(10);
		pile.empiler(5);
		pile.empiler(15);
		pile.empiler(24); 
		
		ParcourPile parc1= new ParcourPile(pile.getSommet(), pile);
		System.out.println("Parcours pile  : ");
		while (!parc1.estEnFin()) {
			if (!parc1.estEnFin())
				System.out.print(parc1.eltCourant() + ", ");
			parc1.eltSuivant();
		}
	}

}
