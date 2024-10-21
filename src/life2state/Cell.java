package life2state;

public class Cell {
	private CellState state;
	
	public Cell() {
		this.state = new DeadState();
	}
	
	// from CellState interface
	public void live() {
		
	}
	
	public void die() {
		
	}
	
	public boolean isAlive() {
		return false;
	}

}
