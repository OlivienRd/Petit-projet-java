package Personnes;

public class Personnes {
	String nom;
	String Sexe;
	int age;
	
		
	public Personnes(String nom, String sexe, int age) {
		super();
		this.nom = nom;
		Sexe = sexe;
		this.age = age;
	}

	public void parler(String phrase) {
		System.out.println(nom + " a dit : " + phrase);
	}
	
	public void ecouter() {
		System.out.println(nom + ", j'ecoute !");
	}
	
	public void penser(String tilt) {
		System.out.println(nom + " je suis en train de réflechir à ce que : " + tilt);
	}
	
	public int obtenirAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Personne : " + nom + ", " + Sexe + ", " + age + "ans";
	}
	
	
}
