package project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String newline = System.lineSeparator();
		Scanner x = new Scanner(System.in);
		System.out.println("Press 1 to sign in " + newline + "Press 2 to sign up " + newline + "Press 3 for admin ");
		int choice = x.nextInt();
		
		if(choice == 1){
			
			Scanner email = new Scanner(System.in);
			System.out.print("Enter email: ");
			String mail = email.nextLine();
			
			Scanner pass = new Scanner(System.in);
			System.out.print("enter password: ");
			String password = pass.nextLine();
			
			User_Sign_In obj = new User_Sign_In(mail,password);
			obj.SignIn(mail, password);
			
			int choose = 0;
			
			while(choose != 7){
				
				Scanner x1 = new Scanner(System.in);
				System.out.println(newline + "Press 1 to search a service " + newline + "Press 2 to check dicounts " + newline + "Press 3 to check wallet funds " + newline + "Press 4 to to add funds to wallet " + newline + "Press 5 to pay " + newline + "Press 6 to request refund " + newline + "Press 7 to exit ");
				choose = x1.nextInt();
			
				if(choose == 1){
					Scanner s = new Scanner(System.in);
					System.out.print("enter service name: (Mobile, Internet, Landline, Donation) ");
					String service = s.nextLine();
				
					Services m = new Services();
					m.orderService(service);

				}
				else if(choose == 2){
					Check_Discount c = new Check_Discount();
					c.Check_Overall_Discount();

				}
				else if(choose == 3){
					User_Wallet wal = new User_Wallet();
					wal.checkFunds();

				}
				else if(choose == 4){
					
					Scanner x2 = new Scanner(System.in);
					System.out.println("Enter desired amount: ");
					int funds = x1.nextInt();
					
					User_Wallet wal = new User_Wallet();
					wal.addFunds(funds);
				}
				else if(choose == 5){
					
					Scanner pay = new Scanner(System.in);
					System.out.print("How do you want to pay? (wallet, cash, visa) ");
					String method = pay.nextLine();
					
					Scanner x2 = new Scanner(System.in);
					System.out.println("How much will you pay? ");
					int val = x2.nextInt();
					
					 if(method == "wallet"){
						Wallet_payment wallet = new Wallet_payment();
						wallet.pay(val);
					 }
					 else if(method == "cash"){
						 Cash_Payment cash = new Cash_Payment();
						 cash.pay(val);
					 }
					 else{
						 CreditCard_Payment card = new CreditCard_Payment();
						 card.pay(val);
					 }
				}
				else if(choose == 6){
					User_Refund ref = new User_Refund();
					Scanner n = new Scanner(System.in);
					System.out.print("Enter your name: ");
					String user_name = n.nextLine();
					
					ref.refund(user_name);
				}
				else{
					System.exit(0);
				}
			}
		}
		else if(choice == 2){
			
			Scanner email = new Scanner(System.in);
			System.out.print("Enter email: ");
			String mail = email.nextLine();
			
			Scanner pass = new Scanner(System.in);
			System.out.print("enter password: ");
			String password = pass.nextLine();
			
			Scanner n = new Scanner(System.in);
			System.out.print("enter your name: ");
			String name = n.nextLine();
			
			User_Sign_Up obj = new User_Sign_Up(mail,password,name);
			obj.signUp(obj);
		}
		else{
			Admin obj =  new Admin();
		}

	}

}
