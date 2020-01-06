package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Configurations.BaseClass;
import PageObjects.GmailLoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps extends BaseClass{

	@Given("^User is on Gmail login page$")
	public void user_is_on_Gmail_login_page() throws Throwable {
		GmailLoginPage LP=new GmailLoginPage();
		BaseClass.setup();

	}

	@When("^User enters valid username and password$")
	public void user_enters_valid_username_and_password() throws Throwable {

		GmailLoginPage LP=new GmailLoginPage();

		LP.setUserName("NaliniSkate");
		System.out.println("Username is entered");

		boolean nextFlag=LP.btnNextPresent();
		System.out.println("nextFlag: "+nextFlag);
		Assert.assertTrue(nextFlag); 
		System.out.println("Next button is displayed");	

		LP.btnNextClick();
		Thread.sleep(4000);	
		WebElement txtPassword=driver.findElement(By.name("password"));
		System.out.println("Password InputBox is identified");
		LP.setPassword("Hariom@001");
		System.out.println("Password entered");
//		DefaultGmailPage DP=LP.btnNext1Click();
	}

	@Then("^Clicks on Login button$")
	public void clicks_on_Login_button() throws Throwable {


	}
	//	@Test
	@Then("^user is able to login successfully$")
	public void user_is_able_to_login_successfully() throws Throwable {

	}
	@When("^user clicks on Compose button opens new email window$")
	public void user_clicks_on_Compose_button_opens_new_email_window() throws Throwable{

	}

	@Then("^user enters subject of email$")
	public void user_enters_subject_of_email() throws Throwable {

	}

	@Then("^user enters To email address of the email$")
	public void user_enters_To_email_address_of_the_email() throws Throwable{

	}

	@Then("^user enters the Message Body$")
	public void user_enters_the_Message_Body() throws Throwable{

	}

	@Then("^user clicks on Send button$")
	public void user_clicks_on_Send_button() throws Throwable{

		Thread.sleep(10000);
	}

	@Then("^email send successfully and displays under Sent items$")
	public void email_send_successfully_and_displays_under_Sent_items() throws Throwable{

		}
	}






