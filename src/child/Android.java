package child;
import parent.MobilePhone;

public class Android extends MobilePhone {
	private boolean isOn = false;
	
	public Android(String os) {
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
