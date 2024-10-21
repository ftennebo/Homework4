package life2state;

public interface CellState {
	
	// the "handles" in the State pattern.
	public CellState live();
	public CellState die();
	public boolean isAlive();

}
