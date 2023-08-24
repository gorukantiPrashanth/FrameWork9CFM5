package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class ShopperLoginPage {
	
private static final WebElement AddAddressButton = null;
	//	Declaration
	@FindBy(id = "Email")
	private WebElement emailTF;
	@FindBy(id = "password")
	private WebElement passwordTF;
	@FindBy(name = "Login")
	private WebElement loginButton;
	@FindBy(id = "Create Account")
	private WebElement createAccountButton;
	
//	Initialization
	public ShopperLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//	Utilization
	public void logininToApp(String email, String password) {
		emailTF.sendKeys(email);
		passwordTF.sendKeys(password);
	}

	public void clickCreateAccountButton() {
		// TODO Auto-generated method stub
		
	}

	public void clickonAddAddressButton() {
	     AddAddressButton.click();
		
	}
}
