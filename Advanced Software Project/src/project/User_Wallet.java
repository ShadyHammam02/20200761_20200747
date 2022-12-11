package project;

public class User_Wallet {
	
	static float total_funds = 0;
	
	public void addFunds(float funds){
		//total_funds = 0;
		total_funds += funds;
		System.out.print(funds + " pounds have been added to your wallet. ");
	}
	
	public void checkFunds(){
		System.out.print("You have " + total_funds + " in your wallet. ");
	}
}
