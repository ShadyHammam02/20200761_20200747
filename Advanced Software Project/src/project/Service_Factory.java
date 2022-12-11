package project;

import java.util.Scanner;

public class Service_Factory {
	
	public void createService(String x){
		if(x == "Mobile" || x == "mobile"){
			
			Mobile_Service var = new Mobile_Service();
			
			Scanner company = new Scanner(System.in);
			System.out.print("Which company do you want? (We,Orange,Etisalat,Vodafone) ");
			String choice = company.nextLine();
			
			
	
			if(choice == "We" || choice == "we"){
				var.createMobileCompany(choice);
			}
			else if(choice == "Orange" || choice == "orange"){
				var.createMobileCompany(choice);
			}
			else if(choice == "Etisalat" || choice == "etisalat"){
				var.createMobileCompany(choice);
			}
			else if(choice == "Vodafone" || choice == "vodafone"){
				var.createMobileCompany(choice);
			}
		}
		else if(x == "Internet" || x == "internet"){
			
			Scanner company = new Scanner(System.in);
			System.out.print("Which company do you want? (We,Orange,Etisalat,Vodafone) ");
			String choice = company.nextLine();
			
			Internet_Service var = new Internet_Service();
			
			if(choice == "We" || choice == "we"){
				var.createInternetCompany(choice);
			}
			else if(choice == "Orange" || choice == "orange"){
				var.createInternetCompany(choice);
			}
			else if(choice == "Etisalat" || choice == "etisalat"){
				var.createInternetCompany(choice);
			}
			else if(choice == "Vodafone" || choice == "vodafone"){
				var.createInternetCompany(choice);
			}
		}
		else if(x == "Landline" || x == "landline"){
			
			Scanner company = new Scanner(System.in);
			System.out.print("which bill do you want to pay? (Monthly,Quarter) ");
			String choice = company.nextLine();
			
			Landline_Service var = new Landline_Service();
			
			if(choice == "Monthly" || choice == "monthly"){
				var.createLandlineService(choice);
			}
			else if(choice == "Quarter" || choice == "quarter"){
				var.createLandlineService(choice);
			}
		}
		else if(x == "Donation" || x == "donation"){
			
			Scanner don = new Scanner(System.in);
			System.out.print("What do you want to donate for? (school,ngo,cancer) ");
			String choice = don.nextLine();
			
			Donation_Service var = new Donation_Service();
			
			if(choice == "School" || choice == "school"){
				var.createDonationService(choice);
			}
			else if(choice == "NGO" || choice == "ngo"){
				var.createDonationService(choice);
			}
			else if(choice == "Cancer" || choice == "cancer"){
				var.createDonationService(choice);
			}
		}
	}	
}
