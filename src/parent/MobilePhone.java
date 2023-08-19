package parent;

public abstract class MobilePhone {
	private String os;
	
	public MobilePhone() {
		
	}
	
	public String getOs() {
		return this.os;
	}
	
	public void setOs(String os) {
		this.os = os;
	}
	
	public abstract boolean isOn();
}
