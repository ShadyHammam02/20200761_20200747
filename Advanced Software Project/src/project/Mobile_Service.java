package project;



public class Mobile_Service extends Services{
	
	public void createMobileCompany(String choice){
				
		if(choice == "We" || choice == "we"){
			Mobile_Service var = new We_Mobile();
		}
		else if(choice == "Orange" || choice == "orange"){
			Mobile_Service var = new Orange_Mobile();
		}
		else if(choice == "Etisalat" || choice == "etisalat"){
			Mobile_Service var = new Etisalat_Mobile();
		}
		else if(choice == "Vodafone" || choice == "vodafone"){
			Mobile_Service var = new Vodafone_Mobile();
		}
	}
	
}
