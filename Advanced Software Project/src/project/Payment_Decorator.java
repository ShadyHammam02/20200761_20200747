package project;

public class Payment_Decorator extends User_Payment{
	
	public void pay(int cost){
		
		Overall_Discount z = new Overall_Discount();
		Specific_Discount y = new Specific_Discount();
		
		System.out.print("Paying " + cost + " pounds ");
		z.payDiscount(cost);
		y.payDiscount2(cost);
	}

}
