package exosPOOS4;

public class ProgrammePrincipaleRobot {

	public static void main(String[] args) {
		Corrig�_robot robot1 = new Corrig�_robot(2, 2, "Sud");
		System.out.println("On a cr�� le robot 1 avec les param�tres suivantes : Position suivant x est X = " + robot1.getPositionX() + " et la position suivant y est Y = " + robot1.getPositionY());
		System.out.println(robot1.getOrientation());
		robot1.tournerADroite();
		robot1.avancer();
	} 
}
