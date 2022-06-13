package Personnes;

public class PersonneTest {

	public static void main(String[] args) {
		Personnes faneva = new Personnes("Faneva", "Masculin", 20);
		Personnes koloina = new Personnes("Koloina", "Masculin", 20);

		System.out.println(koloina);
		System.out.println(faneva);
		
		koloina.penser("Je veux discuter avec Faneva");
		faneva.ecouter();
		koloina.parler("Est-ce que tu as vu le match d'hier ?");


	}

}
