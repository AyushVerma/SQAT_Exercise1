public class Frame {
	private int firstThrow;
	private int secondThrow;
	
	public Frame(int firstThrow, int secondThrow) throws BowlingException{
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
		if(firstThrow >10 || firstThrow+secondThrow>10) {
			throw new BowlingException();
		}
	}
	
	public int getFirstThrow() {
		return firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}

	//returns the score of a single frame
	public int score(){
		
		int score = 0;
		if(firstThrow == 10)
			score = 10;
		else 
			score = firstThrow +secondThrow;
		
		return score;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		//to be implemented
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		//to be implemented
		return false;
	}
}
