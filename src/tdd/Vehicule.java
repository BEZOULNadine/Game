package tdd;

public class Vehicule {
	public String immatriculation;
	public Parking[] abonnement = new Parking[10];
	public int nbabonnement = 0;

	public Vehicule(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public void abonner(Parking p) {
		abonnement[nbabonnement] = p;
		nbabonnement++;
	}

	public boolean estabonne(Parking p) {
		for (int i = 0; i < abonnement.length; i++) {
			if (abonnement[i] == p) {
				return true;
			}

		}
		return false;

	}
}
