package project;

import java.util.Scanner;

public class Overall_Discount extends Payment_Decorator implements Discount{

	public boolean addDiscount() {
		
		Scanner don = new Scanner(System.in);
		System.out.print("Is this your first service? ");
		String choice = don.nextLine();
		
		boolean flg = false;
		
		if(choice == "Yes" || choice == "yes"){
			flg = true;
		}
		else{
			flg = false;
		}
		
		return flg;
	}
	
	public void payDiscount(int x){
		super.pay(x);
		if(this.addDiscount()){
			System.out.print("You have a 10% discount on payment. ");
		}
		else{
			System.out.print("You have no discount ");
		}
	}
	
}
