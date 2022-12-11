package project;

import java.util.Scanner;

public class Admin {
	
	public Admin(){
		Scanner admin = new Scanner(System.in);
		System.out.print("choose 1 to view refund list or 2 to add discount. ");
		int choice = admin.nextInt();
		
		if(choice == 1){
			Admin_Refund_List obj = new Admin_Refund_List();
		}
		else{
			Specific_Discount obj = new Specific_Discount();
			obj.addDiscount();
		}
	}

}
