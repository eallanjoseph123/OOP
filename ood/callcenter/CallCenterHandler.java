package ood.callcenter;

import java.util.HashMap;
import java.util.Map;

public abstract class CallCenterHandler {

	private static Map<CallCenterPositionEnum, CallCenterHandler> emps = new HashMap<>();

	static {
		for (CallCenterPositionEnum e : CallCenterPositionEnum.values()) {
			switch (e) {
			case RESPONDENT:
				emps.put(e, new Respondent());
				break;
			case MANAGER:
				emps.put(e, new Manager());
				break;
			default:
				emps.put(CallCenterPositionEnum.DIRECTOR, new Director());
				break;
			}
		}
	}

	public static void call() {
		//get the initial responder
		CallCenterHandler emp = CallCenterHandler.emps.get(CallCenterPositionEnum.RESPONDENT);
		if(!emp.isAvailable()) {
			emp = dispatchCall();
		}
		
		emp.acceptCall();
		
	}
	
	public static CallCenterHandler dispatchCall(){
		
		for (CallCenterPositionEnum e : CallCenterPositionEnum.values()) {
			if(e == CallCenterPositionEnum.MANAGER && emps.get(CallCenterPositionEnum.MANAGER).isAvailable()) {
				return emps.get(CallCenterPositionEnum.MANAGER);
			}
		}
		return emps.get(CallCenterPositionEnum.DIRECTOR);
	}
	
	
	
	//set the logic here 
	abstract void acceptCall();
	
	abstract boolean isAvailable();

}
