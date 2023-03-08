package week3.day2;

public class Automation extends MultipleLanguage {
	
	public void ruby() {
		
		System.out.println("Learning Ruby is my abstract method");
		
	}

	public void java() {
		System.out.println("Learning Java is my super class");
		
	}

	public void selenium() {
		System.out.println("Learning Selenium is my father class");
		
	}
	
	public static void main(String[] args) {
		
		Automation a = new Automation();
		
		a.java();
		a.selenium();
		a.python();
		a.ruby();
	}

}

