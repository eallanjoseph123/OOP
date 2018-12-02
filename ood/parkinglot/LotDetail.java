package ood.parkinglot;

public class LotDetail {
	private Space space;
	private int level;

	public LotDetail(Space space, int level) {
		this.space = space;
		this.level = level;
	}

	public Space getSpace() {
		return space;
	}

	public void setSpace(Space space) {
		this.space = space;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
