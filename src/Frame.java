public class Frame {
	private int firstThrow;
	private int secondThrow;
	private int frameScore;
	public Frame(int firstThrow, int secondThrow) throws BowlingException{
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
		if(firstThrow >10 || firstThrow+secondThrow>10) {
			throw new BowlingException();
		}
		frameScore = score();
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
			score = firstThrow + secondThrow;
		
		return score;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		if(firstThrow == 10)
			return true;
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		
		if(!isStrike() && firstThrow+secondThrow==10)
			return true;
		return false;
	}
}
