import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test(expected=BowlingException.class)
	public void testValidFrame() throws BowlingException {
		
		Frame f = new Frame(10,0);
	}
	
	@Test
	public void testFrameScore() throws BowlingException {
		
		Frame f = new Frame(5,9);
		int score = f.score();
		assertTrue(score==10);
	}
	
	@Test
	public void testFrameIsStrike() throws BowlingException {
		
		Frame f = new Frame(10,0);
		assertTrue(f.isStrike());
	}
	

}
