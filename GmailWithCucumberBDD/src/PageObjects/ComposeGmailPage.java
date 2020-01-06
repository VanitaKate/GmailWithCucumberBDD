package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Configurations.BaseClass;

public class ComposeGmailPage extends BaseClass {

	public ComposeGmailPage() {

		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//input[@name='subjectbox']")	
	WebElement txtSubject;

	@FindBy(xpath="//input[@name='subjectbox']")
	WebElement txtReceipient;

	@FindBy(xpath="//div[@label='Message Body']")
	WebElement txtMessageBody;
	
	@FindBy(xpath="//div[contains(text(),'Send')]")
	WebElement btnSend;
	


	public void setEmailSubject(String subject) {
		txtSubject.sendKeys("email-1 compose");
	}
	public void setEmailReceipients(String receipients) {
		txtReceipient.sendKeys("vasudha1981@yahoo.com");
				
	}
	public void setMessageBody(String MessageBody){
		txtMessageBody.sendKeys("Hi, this is a test email, composed by selenium webdriver. Thanks & regards, Vanita Kate");
	}
	public void clickSendEmail() {
		btnSend.click();		
	}
	
}
