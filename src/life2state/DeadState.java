package life2state;

public class DeadState implements CellState{

	@Override
	public CellState live() {
		return null;
	}

	@Override
	public CellState die() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAlive() {
		return false;
	}

}
