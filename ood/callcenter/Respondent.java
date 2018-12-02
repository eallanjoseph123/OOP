package ood.callcenter;

public class Respondent extends CallCenterHandler implements CallCenterPosition{
	
	private boolean amIavailbale;

	@Override
	public CallCenterPositionEnum getPosition() {
		return CallCenterPositionEnum.RESPONDENT;
	}

	@Override
	void acceptCall() {
		System.out.println("respondent accep");
	}

	@Override
	boolean isAvailable() {
		return amIavailbale;
	}

}
