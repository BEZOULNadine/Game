package tdd;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
	Parking p;
	Vehicule v;
	Vehicule vv;
	Vehicule vvv;
	Parking pp;
	Ambulance a;

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void iter1() {
		p = new Parking(10, 6);
		assertEquals(p.getNbplaceslibres(), 10);

	}

	@Test
	void iter2() {
		p = new Parking(10, 5);
		v = new Vehicule("1");
		assertEquals(p.getNbplaceslibres(), 10);
		p.ajouter(v);
		assertEquals(p.getNbplaceslibres(), 9);

	}

	@Test
	void iter3() {
		p = new Parking(10, 7);
		v = new Vehicule("1");
		assertEquals(p.getNbplaceslibres(), 10);
		p.ajouter(v);
		assertEquals(p.getNbplaceslibres(), 9);
		p.retirer(v, 4);
		assertEquals(p.getNbplaceslibres(), 10);
	}

	@Test
	void iter4() {
		p = new Parking(10, 3);
		v = new Vehicule("1");
		p.ajouter(v);
		assertEquals(15, p.retirer(v, 5));
	}

	@Test
	void iter5() {
		p = new Parking(2, 3);
		v = new Vehicule("1");
		vv = new Vehicule("6");

		p.ajouter(v);
		p.ajouter(v);
		assertEquals(false, p.ajouter(vvv));
	}

	@Test
	void iter6() {
		p = new Parking(2, 3);
		v = new Vehicule("1");
		vv = new Vehicule("6");
		p.ajouter(v);
		assertEquals(true, p.contient(v));
		assertEquals(false, p.contient(vv));
	}

	@Test

	void iter7() {
		p = new Parking(100, 0);
		pp = new Parking(100, 0);
		v = new Vehicule("1");
		p.ajouter(v);
		assertThrows(IllegalArgumentException.class, () -> pp.retirer(v, 1));
	}

	@Test

	void iter8() {
		p = new Parking(100, 0);
		pp = new Parking(100, 0);
		v = new Vehicule("1");
		v.abonner(p);
		assertEquals(v.estabonne(p), true);
		assertEquals(v.estabonne(pp), false);

	}

	@Test

	void iter9() {
		p = new Parking(100, 10, 0.5f);
		v = new Vehicule("1");
		v.abonner(p);
		p.ajouter(v);
		assertEquals(15, p.retirer(v, 3));

	}

	@Test

	void iter10() {
		p = new Parking(10, 10, 0.5f);
		pp = new Parking(100, 10, 0.5f);
		Ambulance a = new Ambulance("AMB");
		assertTrue(a.estabonne(p));
		assertTrue(a.estabonne(pp));

	}

}
