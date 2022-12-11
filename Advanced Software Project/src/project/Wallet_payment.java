package project;

public class Wallet_payment extends User_Payment{

	public void pay(int cost) {
		
		if(User_Wallet.total_funds <= cost){
			System.out.print("Payment failed, insufficient funds. ");
		}
		else{
			System.out.print("Payment of " + cost + " is done using wallet funds. ");
			User_Wallet.total_funds -= cost;
		}
	}

}
