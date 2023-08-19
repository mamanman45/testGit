package child;

import parent.MobilePhone;

public class Ios extends MobilePhone {
private boolean isOn = false;
	
	public Ios(String os) {
		setOs(os);
	}
	
	public void setTurnOn(boolean state) {
		this.isOn = state;
	}
	
	@Override
	public boolean isOn() {
		return isOn;
	}

}
