package stepDefination;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^User is on Zee Business Website$")
    public void user_is_on_zee_business_website() throws Throwable{
        throw new PendingException();
    }

    @When("^User clicks on the Login\/Register window on the right top corner to arrive$")
    public void user_clicks_on_the_loginregister_window_on_the_right_top_corner_to_arrive() throws Throwable {
        throw new PendingException();
    }

    @Then("^The user is navigates to user details page $")
    public void the_user_is_navigates_to_user_details_page() throws Throwable {
        throw new PendingException();
    }

    @And("^The user will enter the  email and click on the continue option\.$")
    public void the_user_will_enter_the_email_and_click_on_the_continue_option() throws Throwable {
        throw new PendingException();
    }
	
	

}
