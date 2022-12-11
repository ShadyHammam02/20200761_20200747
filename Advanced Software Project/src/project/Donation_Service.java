package project;


public class Donation_Service extends Services{
	
	public void createDonationService(String s){
		
		Services var = new Donation_Service();
		
		if(s == "school" || s == "School"){
			var = new School_Donation();
		}
		else if(s == "cancer" || s == "Cancer"){
			var = new Cancer_Donation();
		}
		else if(s == "ngo" || s == "NGO"){
			var = new NGO_Donations();
		}
	}
	
}

