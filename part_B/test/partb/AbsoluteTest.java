package partb;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AbsoluteTest {
	
//	BlackboxTest: Ich gehe davon aus, dass ich 1 als Ergebnis bekomme, wenn ich die Methode mit -1 oder mit 1 aufrufe.
	
	Absolute absolute;
	
//	WhiteBoxTest wird mit UnitTest umgesetzt:
	
	@Before
	public void initial(){
		absolute = new Absolute();
	}

	@Test
	public void TestNegativeValue() {
		assertEquals(1, Absolute.absoluteValueOf(-1));
	}
	
	@Test
	public void TestPositiveValue() {
		assertEquals(1, Absolute.absoluteValueOf(1));
	}

}
