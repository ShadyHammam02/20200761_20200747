package project;

import java.util.ArrayList;

public class User_Sign_Up extends User{

	String name;
	ArrayList<User> users = new ArrayList<User>();	

	public User_Sign_Up(String email, String password, String name) {
		super(email,password);
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void signUp(User_Sign_Up m){
		users.add(m);
		System.out.print("Sign up successful");
	}
}
