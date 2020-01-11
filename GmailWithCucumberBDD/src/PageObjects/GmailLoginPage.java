package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Configurations.BaseClass;
import org.openqa.selenium.support.ui.Select;
public class GmailLoginPage extends BaseClass{
	JavascriptExecutor js= (JavascriptExecutor)driver;
//	Action Action=new Action( driver);
	public GmailLoginPage() {
		//		driver=BaseClass.InitialiseDriver();
		PageFactory.initElements(driver, this);
		if (driver!=null) System.out.println("driver in object repository is not null");
	}

	@FindBy(xpath="//input[@id='identifierId']") WebElement txtUserName;

	@FindBy(xpath="//input[@class='whsOnd zHQkBf']") WebElement txtPassword;

	@FindBy(xpath="//span[contains(text(),'Next')]") WebElement ButtonNext;

	@FindBy(xpath="//span[contains(text(),'Next')]")
	WebElement ButtonNext1;

	@FindBy(xpath="//div[@class='T-I J-J5-Ji T-I-KE L3']")
	WebElement btnCompose;

	//	@FindBy(id="identifierId") WebElement txtUserName;	
	/*
	 * WebElement txtUserName=driver.findElement(By.id("identifierId")); WebElement
	 * ButtonNext=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
	 * WebElement ButtonNext1=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		boolean nextFlag=driver.findElement(By.xpath("//span[contains(text(),'Next')]")).isDisplayed();
		WebElement txtPassword=driver.findElement(By.name("password"));
		WebElement btnCompose=driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']"));*/
	public void setUserName(String UserName) throws InterruptedException {
		if (driver!=null) {
			System.out.println("driver object is not null");
		}
		if (txtUserName!=null) {
			//			System.out.println("name of txtUserName is : "+txtUserName.getAttribute("name"));
			System.out.println("UserName field found");
		}
		System.out.println("UserName is: "+UserName);
		txtUserName.click();
		//		boolean flag=txtUserName.isDisplayed();
		//		System.out.println(flag);
				js.executeScript("document.getElementById('identifierId').value='"+UserName+"';");
				Thread.sleep(4000);
				
//		txtUserName.sendKeys(UserName);
	}
	public void setPassword(String Password) {
		if (txtPassword.isDisplayed()) {
			System.out.println("Password field is displayed");
		}
		txtPassword.click();
		System.out.println("Password is: "+Password);
		js.executeScript("document.getElementByClassName('whsOnd zHQkBf').value='"+Password+"';");
//txtPassword.sendKeys(Password);

	}
	public boolean btnNextPresent() {

		boolean nextFlag=ButtonNext.isDisplayed();
		return nextFlag;
	}
	public void btnNextClick() throws InterruptedException {
		ButtonNext.click();

		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click;", ButtonNext);
		//		Thread.sleep(5000);
	}

	public void btnNext1Click() throws InterruptedException {

		//		js.executeScript("arguments[0].click;", ButtonNext1);

		Thread.sleep(5000);
	}

}
