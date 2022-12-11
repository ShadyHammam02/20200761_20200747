package project;

public class Internet_Service extends Services{
	
	public void createInternetCompany(String choice){
		
		//Internet_Service var;
		
		if(choice == "We" || choice == "we"){
			Internet_Service var = new We_Internet();
		}
		else if(choice == "Orange" || choice == "orange"){
			Internet_Service var = new Orange_Internet();
		}
		else if(choice == "Etisalat" || choice == "etisalat"){
			Internet_Service var = new Etisalat_Internet();
		}
		else if(choice == "Vodafone" || choice == "vodafone"){
			Internet_Service var = new Vodafone_Internet();
		}
	}
	
}
