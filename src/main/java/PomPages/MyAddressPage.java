package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddressPage {
//	declaration
	@FindBy(xpath = "//button[text()='Add Address']")
	private WebElement addAddressButton;
	@FindBy(xpath = "//div[text()='successfully added']")
	private WebElement  successmessage;
	
//	initialization
	public MyAddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//	utilization
	public void clickAdresses() {
		addAddressButton.click();
	}
	
	public String getSuccessMessage() {
		return successmessage.getText();
	}

}
