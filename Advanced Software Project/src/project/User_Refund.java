package project;

public class User_Refund {
	
	Admin_Refund_List obj = new Admin_Refund_List();
	
	public void refund(String name){
		obj.refundRequests.add(name);
		System.out.print("You have been added to refund list");
	}
}
