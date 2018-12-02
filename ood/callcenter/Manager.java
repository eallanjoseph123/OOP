package ood.callcenter;

public class Manager extends CallCenterHandler implements CallCenterPosition{	
	
	private boolean amIavailbale;
	
	@Override
	public CallCenterPositionEnum getPosition() {
		return CallCenterPositionEnum.MANAGER;
	}

	@Override
	void acceptCall() {
		amIavailbale = true;
		System.out.println("respondent accep");
	}


	@Override
	boolean isAvailable() {
		return amIavailbale;
	}

}
