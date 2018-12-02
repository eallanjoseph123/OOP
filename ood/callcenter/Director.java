package ood.callcenter;

public class Director extends CallCenterHandler implements CallCenterPosition {

	private boolean amIavailbale =true;

	@Override
	public CallCenterPositionEnum getPosition() {
		return CallCenterPositionEnum.DIRECTOR;
	}

	@Override
	void acceptCall() {
		
	}


	@Override
	boolean isAvailable() {
		return amIavailbale;
	}

}
