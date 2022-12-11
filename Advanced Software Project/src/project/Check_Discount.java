package project;


public class Check_Discount{
	
	Specific_Discount obj = new Specific_Discount();
	Overall_Discount x = new Overall_Discount();
	
	public void Check_Overall_Discount(){
		
		if(x.addDiscount()){
			System.out.print("You have a 10% discount.");
		}
		else{
			System.out.print("You have no discounts.");
		}
	}
	
	public void Check_specific_dicount(){
		if(obj.addDiscount()){
			System.out.print("You have a 20% discount.");
		}
		else{
			System.out.print("You have no discounts.");
		}
	}
	
}
