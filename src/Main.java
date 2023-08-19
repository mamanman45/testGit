import child.Android;
import child.Ios;
import parent.MobilePhone;

public class Main {
	public static void main(String[] args) {
		MobilePhone android = new Android("Android");
		MobilePhone iphone = new Ios("IOS");
		
		System.out.println("Kondisi HP " + android.getOs() + " menyala =" + android.isOn());
		((Android)android).setTurnOn(true);
		System.out.println("Kondisi HP " + android.getOs() + " menyala =" + android.isOn());
		
		System.out.println(" ");
		
		System.out.println("Kondisi HP " + iphone.getOs() + " menyala =" + iphone.isOn());
		((Ios)iphone).setTurnOn(true);
		System.out.println("Kondisi HP " + iphone.getOs() + " menyala =" + iphone.isOn());
		
	}
}
