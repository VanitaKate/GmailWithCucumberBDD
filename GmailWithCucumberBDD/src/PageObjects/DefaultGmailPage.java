package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Configurations.BaseClass;

public class DefaultGmailPage extends BaseClass {
	
	public DefaultGmailPage() {
	//	driver=rdriver;
		PageFactory.initElements(BaseClass.driver, this);
		
	}
	@FindBy(xpath="//div[@class='T-I J-J5-Ji T-I-KE L3']")
	WebElement btnCompose;
//	WebElement btnCompose=driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']"));
	
	@FindBy(xpath="//span[contains(text(),'Sent')]")
	WebElement menuSent;

	@FindBy(xpath="//span//span[contains(text(),'Security alert')]/ancestor::tr/td[2]/div")
	WebElement emailSubjectcheckbox;
	
	@FindBy(xpath="//span[@class='gb_Ia gbii']")
	WebElement userLogo;

@FindBy(xpath="//a[contains(text(),'Sign out')]")
WebElement SignOut;

	public boolean btnComposePresent() {
		boolean btnComposeflag=btnCompose.isEnabled();
		return btnComposeflag;
	}

	public void btnComposeClick() throws InterruptedException {
		btnCompose.click();
		
			Thread.sleep(4000);
		
//		return new ComposeGmailPage();
	}
	public void clickMenuSentItems() {
		menuSent.click();		
	}
	public String gettextVariable() {
		String textVariable="MyVariable";
		return textVariable;
	}
	
	public boolean emailSubjectcheckboxChecked() {
		emailSubjectcheckbox.click();
		boolean flag=emailSubjectcheckbox.isSelected();
		
		return flag;
	}
	public boolean SignOutEnabled() {
		boolean flag=SignOut.isEnabled();
		return flag;
	}
	public void SignOutGmail() {
		SignOut.click();
	}
}
