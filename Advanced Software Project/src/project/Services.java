package project;

public class Services {
	Service_Factory obj= new Service_Factory();
	
	String service;
	
	public void setService(String servicename){
		this.service = servicename;
	}
	
	public String getService(){
		 return this.service;
	}
	 
	public void orderService(String s){
		obj.createService(s);
	}
}
