package tdd;

public class Parking {
	private int nbplaces;
	private Vehicule[] vehicules;
	private int nbplacesoccupé = 0;

	public Parking(int nbplaces) {
		this.nbplaces = nbplaces;
		this.vehicules = new Vehicule[nbplaces];
	}

	public int getNbplaceslibres() {
		return nbplaces - nbplacesoccupé;
	}

	public void ajouter(Vehicule v) {
		vehicules[nbplacesoccupé] = v;
		nbplacesoccupé++;
	}

	public void retirer(Vehicule v) {
		for (int i = 0; i < vehicules.length; i++) {
			if (vehicules[i] == v) {
				vehicules[i] = null;
				nbplacesoccupé--;
			}

		}
		return;
	}

}
