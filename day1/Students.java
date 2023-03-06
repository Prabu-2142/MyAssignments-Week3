package week3.day1;

public class Students {
	
	public void getStudentsInfo(int idNumber) {
		
		System.out.println("Department ID is : "+idNumber);
		
	}
	
public void getStudentsInfo(int idNumber, String name) {
	
		
		System.out.println("Student ID number is : "+idNumber);
		System.out.println("Student Name is : "+name);
		
	}

public void getStudentsInfo(String email, String phoneNumber) {
	
	System.out.println("Student email is : "+email);
	System.out.println("Student Phone number is : "+phoneNumber);
	
}

	public static void main(String[] args) {
		
		Students s = new Students();
		s.getStudentsInfo(404);
		s.getStudentsInfo(123, "prabu");
		s.getStudentsInfo("qwerty123@gmail.com", "9999999999");

	}

}
