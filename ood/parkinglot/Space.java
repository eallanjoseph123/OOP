package ood.parkinglot;

public class Space {
	private int level;
	private int totalSpace;
	private boolean available;

	public Space(int level, int totalSpace, boolean available) {
		super();
		this.level = level;
		this.totalSpace = totalSpace;
		this.available = available;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getTotalSpace() {
		return totalSpace;
	}

	public void setTotalSpace(int totalSpace) {
		this.totalSpace = totalSpace;
		if(this.totalSpace > 0) {
			this.setAvailable(true);
		}
		
	}

	public boolean isAvailable() {
			if(this.totalSpace == 0) {
				this.setAvailable(false);
			}
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

}
