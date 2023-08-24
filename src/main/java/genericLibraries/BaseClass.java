package genericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import PomPages.AddressFormPage;
import PomPages.CartPage;
import PomPages.HeadPhonePage;
import PomPages.HomePage;
import PomPages.MyAddressPage;
import PomPages.MyProfilePage;
import PomPages.ShopperLoginPage;
import PomPages.SigiupPage;
import PomPages.WelcomePage;

public class BaseClass {
	protected PropertiesUtility property;
	protected ExcelUtility excel;
	protected JavaUtality jutil;
	protected WebDriverUtility webUtil;
	public WebDriver driver;
	public static WebDriver sdriver;
	protected WelcomePage welcome;
	protected ShopperLoginPage login;
	protected HomePage home;
	protected SigiupPage signUp;
	protected MyProfilePage myProfile;
	protected MyAddressPage myAddress;
	protected HeadPhonePage headphone;
	protected CartPage cart;
	protected AddressFormPage address;
	
	//@BeforeSuite
	//@BeforeTest
	
	@BeforeClass
	public void classConfiguration() {
		property=new PropertiesUtility();
		excel=new ExcelUtility();
		jutil=new JavaUtality();
		webUtil=new WebDriverUtility();
		
		property.propertiesInist(IConstantPath.PROPERTIES_PATH);
		excel.excelInist(IConstantPath.EXCEL_PATH);
	}
	@BeforeMethod
	public void methodConfiguration() {
		driver=webUtil.navigaToApp(property.getdata("Browser"),property.getdata("url"),
				Long.parseLong(property.getdata("time")));
	    sdriver=driver;
	    login=new ShopperLoginPage(driver);
	    home=new HomePage(driver);
	    signUp=new SigiupPage(driver);
	    myProfile=new MyProfilePage(driver);
	    myAddress=new MyAddressPage(driver);
	    headphone=new HeadPhonePage(driver);
	    cart=new CartPage(driver);
	    address=new AddressFormPage(driver);
	}
	@AfterMethod
	public void methodTeardown() {
		home.clickProfileButton();
		home.clicklogout();
		
		}
	@AfterClass
	public void  classTeardown(){
		
	}

	}



