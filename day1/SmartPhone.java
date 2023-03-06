package week3.day1;

public class SmartPhone extends AndroidPhone {

	public void connectWhatsApp() {

		System.out.println("connecting WhatsApp");
	}
	
public void takeVideo() {
		
		System.out.println("Video Recording overrided");
	}

	public static void main(String[] args) {

		SmartPhone obj = new SmartPhone();
		obj.sendMsg();
		obj.makeCall();
		obj.saveContact();
		obj.takeVideo();
		obj.connectWhatsApp();

	}

}
