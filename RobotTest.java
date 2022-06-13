package Personnes;

public class RobotTest {

	public static void main(String[] args) {
		Robot totor = new Robot("Totor", 12, 6, Robot.SUD);
		Robot stator = new Robot("Stator", 12, 4);
		totor.afficherPosition();
		stator.afficherPosition();
		totor.avancer();
		totor.afficherPosition();
		stator.afficherPosition();
		totor.avancer();
		totor.afficherPosition();
		stator.afficherPosition();
		if (totor.memePosition(stator))
			System.out.println("Le plus fort entre " + totor.getNom() + " et " + stator.getNom() +
					" est : " + totor.lePlusFort(stator).getNom());

	}

}
