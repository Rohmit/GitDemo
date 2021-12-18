package stepDefinations;

import cucumber.api.java.en.Given;

public class TaggingSteps {
	@Given("^Login to application with valid user$")
	public void login_to_application_with_valid_user() {
	    System.out.println("Application Login");
	}

	@Given("^login to application with invalid user name$")
	public void login_to_application_with_invalid_user_name(){
		  System.out.println("Application Login with invalid user name");
	}

	@Given("^Login with user name having special characters$")
	public void login_with_user_name_having_special_characters(){
		  System.out.println("Application Login with user special characters");
	}

	@Given("^Login with user id having numeric characters$")
	public void login_with_user_id_having_numeric_characters() {
		  System.out.println("Application Login with numeric characters");
	}


	
	
	
	
	
	
}
