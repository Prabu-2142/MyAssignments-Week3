package week3.day1;

public class AxisBank extends BankingInfo {
	
	public String deposit() {
		
		return "Recurring Deposit Overrided";
	}

	public static void main(String[] args) {
		
		AxisBank ax = new AxisBank();
		
	     String S1 = ax.deposit();
	     
	     System.out.println(S1);
	     
	     String s = "Recurring Deposit";
	     
	     if(ax.deposit()!=s) {
	    	 
	    	 System.out.println("Pass");
	     }
	
	     else {
	    	 System.out.println("Fail");
	     }
		

	}

}
