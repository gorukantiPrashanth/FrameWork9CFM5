package PomPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigiupPage {
	
//	Declaration
	@FindBy(id = "First Name")
	private WebElement firstNameTF;
	@FindBy(id = "Last Name")
	private WebElement lastNameTF;
	@FindBy(xpath = "//div[@id='Gender']/descendant::label/span[2]")
	private List<WebElement> genderRadioButton;
	@FindBy(id = "Phone Number")
	private WebElement phoneNumberTF;
	@FindBy(id = "Email Address")
	private WebElement emailAddressTF;
	@FindBy(id = "Password")
	private WebElement passwordTF;
	@FindBy(id = "Confirm Password")
	private WebElement comfirmPasswordTF;
	@FindBy(id = "Terms and Conditions")
	private WebElement termaAndConditionCB;
	@FindBy(id = "Register")
	private WebElement registerButtonTF;
	
//	Initialization
	public SigiupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
//	Utilization
	public void createAccount(String firstName,String lastName, 
			String expectedGender, String phoneNum, String email,String password) {
		firstNameTF.sendKeys(firstName);
		lastNameTF.sendKeys(lastName);
		
		for(WebElement element: genderRadioButton) {
			String gender = element.getText();
				if(gender.equals(expectedGender)) {
					element.click();
					break;
				}
		}
		phoneNumberTF.sendKeys(phoneNum);
		emailAddressTF.sendKeys(email);
		passwordTF.sendKeys(password);
		comfirmPasswordTF.sendKeys(password);
		termaAndConditionCB.click();
		registerButtonTF.click();
	}
}
