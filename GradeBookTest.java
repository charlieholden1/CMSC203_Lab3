import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	
	GradeBook book1;
	GradeBook book2;
	
	
	@BeforeEach
	void setUp() throws Exception {
		book1 = new GradeBook(5);
		book2 = new GradeBook(5);
		
		book1.addScore(4);
		book1.addScore(5);
		book1.addScore(6);
		
		book2.addScore(1);
		book2.addScore(2);
		book2.addScore(3);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		book1 = null;
		book2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(book1.toString().equals("4.0 5.0 6.0 "));
		assertTrue(book2.toString().equals("1.0 2.0 3.0 "));
	}

	@Test
	void testSum() {
		assertEquals( 15, book1.sum());
		assertEquals( 6, book2.sum());
	}

	@Test
	void testMinimum() {
		assertEquals( 4, book1.minimum());
		assertEquals( 1, book2.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals( 11, book1.finalScore());
		assertEquals( 5, book2.finalScore());
	}
}
