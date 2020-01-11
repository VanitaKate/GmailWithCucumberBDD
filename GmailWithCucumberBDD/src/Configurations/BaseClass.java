package Configurations;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestListener;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Configurations.ReadConfig;
import PageObjects.ComposeGmailPage;
import PageObjects.DefaultGmailPage;
import PageObjects.GmailLoginPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;


//@Test
public class BaseClass {

	//	public  Logger logger=LogManager.getLogger(BaseClass.class);
	private static final int TIMEOUT = 5;
	private static final int POLLING = 100;
	public static WebDriver driver;
	public static WebDriverWait wait;
	//	public static	ReadConfig ReadConfig=new ReadConfig();

	@BeforeClass
	public static void TimeStamp() {
		DateFormat df = new SimpleDateFormat("dd:MM:yy HH:mm:ss");
		Date dateobj = new Date();
		System.out.println(df.format(dateobj));
	}
	public static void setup() throws InterruptedException {


		//		System.out.println(ReadConfig.getFireFoxPath());
		/*
		 * ChromeOptions options=new ChromeOptions(); options.
		 * setBinary("C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\chrome.exe"
		 * ); System.setProperty("webdriver.chrome.driver",
		 * "C:\\Selenium Drivers\\chromedriver.exe"); WebDriver driver=new
		 * ChromeDriver(options);
		 */

		System.setProperty("webdriver.gecko.driver","C:\\Selenium Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().deleteAllCookies(); driver.manage().window().maximize();
		driver.get("https://Gmail.com");
		//driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		Thread.sleep(9000);

		//		System.out.println(driver.getTitle());
	}
	@AfterClass
	public static void endTest() {
		driver.quit();
	}
	/*
	 * public void setup() throws InterruptedException {
	 * System.out.println(System.getProperty("user.dir")+ReadConfig.getChromePath())
	 * ;
	 * System.out.println(System.getProperty("user.dir")+ReadConfig.getFireFoxPath()
	 * ); System.out.println(System.getProperty("user.dir")+ReadConfig.getIEPath());
	 * if(Browser.equalsIgnoreCase("ChromeDriver")) {
	 * System.setProperty("webdriver.chrome.driver",
	 * System.getProperty("user.dir")+ReadConfig.getChromePath()); driver=new
	 * ChromeDriver(); } else if(Browser.equalsIgnoreCase("FireFox")) {
	 * System.out.println(ReadConfig.getFireFoxPath());
	 * System.setProperty("webdriver.gecko.driver",
	 * "C:\\Selenium Drivers\\geckodriver.exe"); driver=new FirefoxDriver(); //
	 * driver.get("https://gmail.com"); // Thread.sleep(5000); //
	 * System.out.println(driver.getTitle()); }else
	 * if(Browser.equalsIgnoreCase("IEDriver")) {
	 * System.setProperty("webdriver.ie.driver",
	 * System.getProperty("user.dir")+ReadConfig.getIEPath()); driver=new
	 * InternetExplorerDriver(); } } public void getURL() throws
	 * InterruptedException {
	 * 
	 * } // @After public void EndTest() { // driver.quit(); }
	 * 
	 * public void getDataBaseResultset() { SQLOracleConnection sqlCon=new
	 * SQLOracleConnection(); try { ResultSet
	 * RS=sqlCon.getDataBaseResultColumnNumber("EMPLOYEE",1); } catch (SQLException
	 * e) { // TODO Auto-generated catch block e.printStackTrace(); } }
	 * 
	 */

}
