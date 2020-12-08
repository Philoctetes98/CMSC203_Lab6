import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	
	//attributes
	private GradeBook g1;
	private GradeBook g2;

	@BeforeEach
	void setUp() throws Exception {
		//Create two objects of the Gradebook class
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		//g1 scores
		g1.addScore(78);
		g1.addScore(84);
		
		//g2 scores
		g1.addScore(93);
		g1.addScore(75);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals(" 78.0 84.0 "));
		assertTrue(g2.toString().equals(" 93.0 75.0 "));
	}

	@Test
	void testSum() {
		assertEquals(162, g1.sum(), .0001);
		assertEquals(168, g2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(78, g1.minimum(), .001);
		assertEquals(75, g2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(84, g1.finalScore(), .001);
		assertEquals(93, g2.finalScore(), .001);
	}

	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
