import java.util.ArrayList;
import java.util.List;

//Finish time: 16:44
//ID:139

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		
		frames.add(frame);
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		Frame temp = frames.get(frames.size()-1);
		
	}
	
	// Returns the game score
	public int score(){
		//to be implemented: should return game score 
		return 0;
	}
}
