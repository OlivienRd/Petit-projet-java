package DEV;

public class TestPileEntierMaillon {

	public static void main(String[] args) {
PileEntierMaillon pile = new PileEntierMaillon();
		
		pile.empiler(10);
		pile.empiler(5);
		pile.empiler(15);
		pile.empiler(24);
		
		//System.out.println(pile.toString());
		pile.afficherPile();
	}

}
