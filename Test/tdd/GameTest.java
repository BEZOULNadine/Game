package tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
	Parking p;

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void iter1() {
		p = new Parking(10);
		assertEquals(p.getNbplaceslibres(), 10);

	}

}
