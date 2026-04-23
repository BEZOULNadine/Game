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
		p = new Parking(10);
		assertEquals(p.getNbplaceslibres(), 10);

	}

	@Test
	void iter2() {
		p = new Parking(10);
		v = new Vehicule("1");
		assertEquals(p.getNbplaceslibres(), 10);
		p.ajouter(v);
		assertEquals(p.getNbplaceslibres(), 9);

	}

}
