package project;

public class Landline_Service extends Services{
	
	public void createLandlineService(String s){
		
		Landline_Service var;
		
		if(s == "monthly" || s == "Monthly"){
			var = new Monthly();
		}
		else if(s == "quarter" || s == "Quarter"){
			var = new Quarter();
		}
	}
}
