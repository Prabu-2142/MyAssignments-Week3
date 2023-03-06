package week3.day1;

public class Calculator {

	public void add(int a,int b) {
		System.out.println(a+b);
	}
			
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public void sub(double a, double b) {
		System.out.println(a-b);
	}
	
	public void sub(int a, int b) {
		System.out.println(a-b);
	}

	public void mul(int a, double b) {
		System.out.println(a*b);
	}
	
	public void mul(double a, double b) {
		System.out.println(a*b);
	}
	
	public static void main(String[] args) {
		
		Calculator c= new Calculator();
		c.add(2, 3);
		c.add(4, 5, 6);
		c.sub(4.5, 3.5);
		c.sub(10, 3);
		c.mul(34, 34.5);
		c.mul(45.8, 87.4);
	}

}
