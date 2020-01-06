package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Configurations.BaseClass;

public class GmailLoginPage extends BaseClass{

	public GmailLoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="identifierId")
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtPassword;


	@FindBy(xpath="//span[contains(text(),'Next')]")
	WebElement ButtonNext;

	@FindBy(xpath="//*/span[contains(text(),'Next')]")
	WebElement ButtonNext1;


	@FindBy(xpath="//div[@class='T-I J-J5-Ji T-I-KE L3']")
	WebElement btnCompose;

	//	@FindBy(id="identifierId") WebElement txtUserName;	
	//	WebElement txtUserName=driver.findElement(By.id("identifierId"));
	//	WebElement ButtonNext=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
	//	WebElement ButtonNext1=driver.findElement(By.xpath("//*/span[contains(text(),'Next')]"));
	//	boolean nextFlag=driver.findElement(By.xpath("//span[contains(text(),'Next')]")).isDisplayed();
	//	WebElement txtPassword=driver.findElement(By.name("password"));
	//	WebElement btnCompose=driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']"));
	public void setUserName(String UserName) {
		if (driver!=null) {
			System.out.println("Driver is not null");
		}else {
			System.out.println("driver is null");
		}
		txtUserName.sendKeys(UserName);
	}
	public boolean btnNextPresent() {
		boolean nextFlag=ButtonNext.isDisplayed();
		return nextFlag;
	}
	public void btnNextClick() throws InterruptedException {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click;", ButtonNext);
		Thread.sleep(5000);
	}
	public void setPassword(String Password) {
		txtPassword.sendKeys(Password);
	}
	public void btnNext1Click() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click;", ButtonNext1);
		Thread.sleep(5000);
	}

}
