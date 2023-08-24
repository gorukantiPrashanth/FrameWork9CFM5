package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class AddressFormPage {
	
//	declaration
	@FindBy(id = "Name")
	private WebElement nameTF;
	@FindBy(id = "House/Office Info")
	private WebElement houseinfoTF;
	@FindBy(id = "Street info")
	private WebElement streetinfoTF;
	@FindBy(id = "Landmark")
	private WebElement landmarkTF;
	@FindBy(id = "Country")
	private WebElement countryDropdown;
	@FindBy(id = "State")
	private WebElement stateDropdown;
	@FindBy(id = "City")
	private WebElement cityDropdown;
	@FindBy(id = "Pincode")
	private WebElement pincodeTF;
	@FindBy(id = "Phone Number")
	private WebElement phoneNumberTF;
	@FindBy(xpath = "//button[text()='Add Address']")
	private WebElement addAddressButton;
	
//	initialization
	public AddressFormPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//	utilization
	public void addAddressDetails(WebDriverUtility web, String name,
			String houseinfo, String street, String landmark,String country,
			String state, String city,String pincode, String phoneNum ) {
	nameTF.sendKeys(name);
	houseinfoTF.sendKeys(houseinfo);
	streetinfoTF.sendKeys(street);
	landmarkTF.sendKeys(landmark);
	
	web.selectFromDropdown(country, countryDropdown);
	web.selectFromDropdown(state, stateDropdown);
	web.selectFromDropdown(city, cityDropdown);
	
	pincodeTF.sendKeys(pincode);
	phoneNumberTF.sendKeys(phoneNum);
	addAddressButton.click();
	}
}
