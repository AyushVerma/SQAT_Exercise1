import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test(expected=BowlingException.class)
	public void test() throws BowlingException {
		
		Frame f = new Frame(10,0);
	}

}
