package tdd;

public class Parking {
	private int nbplaces;
	private Vehicule[] vehicules;
	private int nbplacesoccupé = 0;
	private int tarif;
	private float reduction;

	public Parking(int nbplaces, int tarif) {
		this.nbplaces = nbplaces;
		this.vehicules = new Vehicule[nbplaces];
		this.tarif = tarif;
	}

	public Parking(int nbplaces, int tarif, float reduction) {
		this.nbplaces = nbplaces;
		this.vehicules = new Vehicule[nbplaces];
		this.tarif = tarif;
		this.reduction = reduction;
	}

	public int getNbplaceslibres() {
		return nbplaces - nbplacesoccupé;
	}

	public boolean ajouter(Vehicule v) {
		if (nbplacesoccupé < nbplaces) {
			vehicules[nbplacesoccupé] = v;
			nbplacesoccupé++;
			return true;
		}
		return false;
	}

	public int retirer(Vehicule v, int duréestationement) {
		for (int i = 0; i < vehicules.length; i++) {
			if (vehicules[i] == v) {
				vehicules[i] = vehicules[nbplacesoccupé - 1];
				vehicules[nbplacesoccupé - 1] = null;
				nbplacesoccupé--;
				float coeff = 1;
				if (v.estabonne(this)) {
					coeff = 1 - reduction;
				}
				return (int) (duréestationement * tarif * coeff);
			}
		}
		throw new IllegalArgumentException();
	}

	public boolean contient(Vehicule v) {
		for (int i = 0; i < vehicules.length; i++) {
			if (vehicules[i] == v) {
				return true;
			}
		}
		return false;

	}

}
