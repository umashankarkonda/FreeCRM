
/****************************************************************************
 * @Class Name: FreeCRM_Hme
 * @Objective: To Define the test objects belongs to Free CRM home page
 *****************************************************************************/

/*****************************************************************************
 * @author UMASHANKAR
 * @version Draft
 * Creation Date:
 * Reviewed On:
 * Reviewed by:
 * Last Modified on:
 * Last modified By:
 *****************************************************************************/
package pages;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage_Objects {
	//property declarations
	
	WebDriver driver;
	// This is to construct the object with the driver
		public HomePage_Objects(WebDriver driver) {
			this.driver = driver;
		}
	
	//Free CRM Logo
	 @FindBy(how = How.XPATH, using="//img[contains(@alt,'free crm logo')]")
	 @CacheLookup 
	 WebElement FreeCRMLogo;
	 //Free CRM Home Page Links
	 @CacheLookup
	 @FindBy(how=How.XPATH, using="//a[contains(text(),'Login')]")  WebElement lnkLogin;
	 @CacheLookup
	 @FindBy(how=How.XPATH, using="//a[contains(text(),'Sign Up')]") WebElement lnkSignUp;
	 @CacheLookup
	 @FindBy(how=How.XPATH, using="//a[contains(text(),'Pricing')]") WebElement lnkPricing;
	 @CacheLookup
	 @FindBy(how=How.XPATH, using="//a[contains(text(),'Features')]") WebElement lnkFeatures;
	 @CacheLookup
	 @FindBy(how=How.XPATH, using="//a[contains(text(),'Customers')]") WebElement lnkCustomers;
	 @CacheLookup
	 @FindBy(how=How.XPATH, using="//a[contains(text(),'Contact Us')]") WebElement lnkcontactUs;
	
	
	
	/**************************************************************************
	 * Method name: freeCRM_VerifyLinks_homepage()
	 * Objective: To Verify the specific links are present on the home page
	 * Author: Umashankar Konda
	 * Created Date:
	 * 
	 * *************************************************************************/
	public boolean freeCRM_VerifyLinks_homepage(){
		boolean exFlag = true;
		System.out.println(driver.getTitle());
		if (FreeCRMLogo.isDisplayed()){
			System.out.println("Free CRM Logo is presnt home page");
		}
		else {System.out.println("Free CRM Logo is not Present home page");
		exFlag=false;
		}
		if (lnkLogin.isDisplayed()) System.out.println("Login link is present on the home page");
		else {exFlag=false;
		System.out.println("Login link is not present on the home page");
		}
		if (lnkSignUp.isDisplayed()) System.out.println("Sign UP link is present on the home page");
		else {exFlag=false; System.out.println("Signup link is not present on the Home page");}
		if (lnkFeatures.isDisplayed()) System.out.println("Features link is present on the home page");
		else {exFlag=false;System.out.println("Features link is not present on the home page");}
		if (lnkPricing.isDisplayed()) System.out.println("Pricing link is present on thehome page");
		else {exFlag=false; System.out.println("Pricing link is not present on the Home page");}
		if (lnkCustomers.isDisplayed()) System.out.println("Customers link is present on the home page");
		else {exFlag=false;System.out.println("Customers link is not present on the home page");}
		if (lnkcontactUs.isDisplayed()) System.out.println("Contact us link is present on th ehome page");
		else {exFlag=false;System.out.println("Contact us link is not present on the Home page");}
		return exFlag;
	}
	/***************************************************************************************************
	 * Method name: verifyPageTitle(String strTitle)
	 * Parameter: Expected Title in string
	 * Objective: To Verify Browser title
	 * Author: Umashankar Konda
	 * Created Date:
	 * 
	 * **************************************************************************************************/
	public boolean verifyPageTitle(String strTitle) {
		boolean exeStatus;
		if (driver.getTitle().contains(strTitle)) {System.out.println("The page title is matched with the expected");
		exeStatus = true;}
		else {System.out.println("The page title verification failed. expected title is "
		+strTitle+"\t Actual title on the age is : "+driver.getTitle());	exeStatus=false;}
		
		return exeStatus;
	}
}


