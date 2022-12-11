package project;

public abstract class User {
	
	String email, password;
	
	public User(String email, String password){
		this.email = email;
		this.password = password;
	}

	public void setEmail(String email){
		this.email = email;
	}
	
	public void setPass(String password){
		this.password = password;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public String getPass(){
		return this.password;
	}
}
