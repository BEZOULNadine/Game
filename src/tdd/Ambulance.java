package tdd;

public class Ambulance extends Vehicule {

	public Ambulance(String immatriculation) {
		super(immatriculation);
	}

	@Override
	public boolean estabonne(Parking p) {
		return true;
	}

	@Override
	public void abonner(Parking p) {
	}

}
