package ood.callcenter;

public enum CallCenterPositionEnum {
	RESPONDENT(1),
	MANAGER(2),
	DIRECTOR(3);
	
	private int positionLevel;

	public int getPositionLevel() {
		return positionLevel;
	}

	public void setPositionLevel(int positionLevel) {
		this.positionLevel = positionLevel;
	}

	private CallCenterPositionEnum(int positionLevel) {
		this.positionLevel = positionLevel;
	}
	
	
	
}
