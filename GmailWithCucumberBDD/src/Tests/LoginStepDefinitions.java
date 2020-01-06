package Tests;

import org.openqa.selenium.By;
//import org.apache.commons.codec.binary.Base64;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Test;

import Configurations.BaseClass;
import PageObjects.ComposeGmailPage;
import PageObjects.DefaultGmailPage;
import PageObjects.GmailLoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitions extends BaseClass{
	DefaultGmailPage DP=new DefaultGmailPage();
	ComposeGmailPage CP=new ComposeGmailPage();
	GmailLoginPage LP=new GmailLoginPage();



	@Given("^User is on Gmail login page$")
	public void user_is_on_Gmail_login_page() throws Throwable {

		BaseClass.setup();
		//		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Drivers\\geckodriver.exe");
		//		driver=new FirefoxDriver();

		/*
		 * driver.manage().deleteAllCookies(); driver.get("https://Gmail.com");
		 * Thread.sleep(30000); System.out.println("User is on Gmail Page");
		 */

	}

	@When("^User enters valid username and password$")
	public void user_enters_valid_username_and_password() throws Throwable {

		//		WebElement txtUserName=driver.findElement(By.id("identifierId"));
		//		System.out.println("UserName is identified");
		//		txtUserName.sendKeys("NaliniSkate");
		LP.setUserName("NaliniSkate");
		System.out.println("Username is entered");
		//		WebElement ButtonNext=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		//		boolean nextFlag=driver.findElement(By.xpath("//span[contains(text(),'Next')]")).isDisplayed();
		boolean nextFlag=LP.btnNextPresent();
		System.out.println("nextFlag: "+nextFlag);
		Assert.assertTrue(nextFlag); 
		System.out.println("Next button is displayed");	
		LP.btnNextClick();
		//		ButtonNext.click();

		Thread.sleep(4000);	
		//		WebElement txtPassword=driver.findElement(By.name("password"));
		System.out.println("Password InputBox is identified");
		//		txtPassword.sendKeys("Hariom@001");
		LP.setPassword("Hariom@001");
		System.out.println("Password entered");
	}

	@Then("^Clicks on Login button$")
	public void clicks_on_Login_button() throws Throwable {
		//		WebElement ButtonNext1=driver.findElement(By.xpath("//*/span[contains(text(),'Next')]"));
		LP.btnNextClick();
		//		ButtonNext1.click();

	}
	//	@Test
	@Then("^user is able to login successfully$")
	public void user_is_able_to_login_successfully() throws Throwable {
		WebDriverWait wait=new WebDriverWait(driver,20);
		Thread.sleep(25000);

		//		WebElement btnCompose=driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']"));
		//		wait.until(ExpectedCondition.visibilityOfElementLocated(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")));
		System.out.println(driver.getTitle());


	}
	@When("^user clicks on Compose button opens new email window$")
	public void user_clicks_on_Compose_button_opens_new_email_window() throws Throwable{
		DP.btnComposeClick();
		Thread.sleep(4000);
		System.out.println("User logged in successfully and user is on default page: " +driver.getTitle());
	}

	@Then("^user enters subject of email$")
	public void user_enters_subject_of_email() throws Throwable {
//		WebElement txtSubject=driver.findElement(By.xpath("//input[@name='subjectbox']"));
//		txtSubject.sendKeys("email-1 compose");
		CP.setEmailSubject("Email by Selenium WebDriver");
	}

	@Then("^user enters To email address of the email$")
	public void user_enters_To_email_address_of_the_email() throws Throwable{
//		WebElement txtReceipient=driver.findElement(By.xpath("//textarea[@name='to']"));
//		txtReceipient.sendKeys("vasudha1981@yahoo.com");
		//		Action Action=new Action();
		CP.setEmailReceipients("vasudha1981@yahoo.com");
	}

	@Then("^user enters the Message Body$")
	public void user_enters_the_Message_Body() throws Throwable{
//		WebElement txtMessageBody=driver.findElement(By.xpath("//div[@label='Message Body']"));
//		txtMessageBody.sendKeys("Hi, this is a test email, composed by selenium webdriver. Thanks & regards, Vanita Kate");
		CP.setMessageBody("Hi, this is a test email, composed by selenium webdriver. Thanks & regards, Vanita Kate");
	}

	@Then("^user clicks on Send button$")
	public void user_clicks_on_Send_button() throws Throwable{
//		WebElement btnSend=driver.findElement(By.xpath("//div[contains(text(),'Send')]"));
//		btnSend.click();
		CP.clickSendEmail();
		Thread.sleep(10000);
	}

	@Then("^email send successfully and displays under Sent items$")
	public void email_send_successfully_and_displays_under_Sent_items() throws Throwable{
//		WebElement menuSent=driver.findElement(By.xpath("//a[contains(text(),'Sent')]"));		
//		menuSent.click();

//		WebElement checkbox=driver.findElement(By.xpath("//*/td[@id=\":63\"]//div[@id=\":64\"]"));

		Thread.sleep(5000);
		DP.clickMenuSentItems();
		Thread.sleep(10000);
		boolean flag=DP.checkBoxChecked();
		System.out.println(flag);
		if (flag) {
			System.out.println("Sent page displayed completely");
		}
	}




}
