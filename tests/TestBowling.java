import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test(expected=BowlingException.class)
	public void testValidFrame() throws BowlingException {
		
		Frame f = new Frame(10,0);
	}
	
	@Test
	public void testFrameScore() throws BowlingException {
		
		Frame f = new Frame(4,5);
		int score = f.score();
		assertFalse(score!=9);
	}
	
	

}
