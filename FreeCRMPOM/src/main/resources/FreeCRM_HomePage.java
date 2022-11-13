
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;

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

	public class FreeCRM_HomePage {
		//property declarations
		
		WebDriver driver;
		//Free CRM Logo
		 @FindBy(how = How.XPATH, using="//img[contains(@alt,'free crm logo')]")
		 @CacheLookup 
		 WebElement FreeCRMLogo;
		 //Free CRM Home Page Links
		 @CacheLookup
		 @FindBy(how=How.XPATH, using="//a[contains(text(),'Login')]")  WebElement lnkLogin;
		 @CacheLookup
		 @FindBy(how=How.XPATH, using="") WebElement lnkSignUp;
		 @CacheLookup
		 @FindBy(how=How.XPATH, using="") WebElement lnkPricing;
		 @CacheLookup
		 @FindBy(how=How.XPATH, using="") WebElement lnkFeatures;
		 @CacheLookup
		 @FindBy(how=How.XPATH, using="") WebElement lnkCustomers;
		 @CacheLookup
		 @FindBy(how=How.XPATH, using="") WebElement lnkcontactUs;
		
		// This is to construct the object with the driver
		public FreeCRM_Home(WebDriver driver) {
			this.driver = driver;
		}
		
		/**************************************************************************
		 * Method name: freeCRM_VerifyLinks_homepage()
		 * Objective: To Verify the specific links are present on the home page
		 * Author: Umashankar Konda
		 * Created Date:
		 * 
		 * *************************************************************************/
		public boolean freeCRM_VerifyLinks_homepage(){
			boolean exFlag = true;
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
	}



