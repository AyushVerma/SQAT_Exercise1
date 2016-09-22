import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test(expected=BowlingException.class)
	public void testValidFrame() throws BowlingException {
		
		Frame f = new Frame(10,0);
	}
	
	@Test
	public void testFrameScore() throws BowlingException {
		
		Frame f = new Frame(11,0);
		int score = f.score();
		assertTrue(score==10);
	}
	
	

}
