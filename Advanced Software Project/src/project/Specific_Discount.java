package project;

import java.util.Scanner;

public class Specific_Discount extends Payment_Decorator implements Discount{
	
	public boolean addDiscount(){
		boolean flag = false;
		Scanner dis = new Scanner(System.in);
		System.out.print("Do you want to add a specific discount: ");
		String ans = dis.nextLine();
		dis.close();
		
		if(ans == "Yes" || ans == "yes" ){
			flag = true;
		}
		else{
			flag = false;
		}
		return flag;
	}
	
	public void payDiscount2(int x){
		super.pay(x);
		if(this.addDiscount()){
			System.out.print("You have a 20% discount on payment. ");
		}
		else{
			System.out.print("You have no discount ");
		}
	}
}
