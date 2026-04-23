package tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
	Parking p;
	Vehicule v;

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

}
