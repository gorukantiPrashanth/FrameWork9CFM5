package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class HomePage {
    //declaration
	@FindBy(xpath = "//button[@aria-label='Account setting']")
	private WebElement profileButton;
	@FindBy(xpath = "//li[.=My Profile']")
	private WebElement myProfile;
	@FindBy(xpath = "//li[.='Logout']")
	private WebElement logout;
	@FindBy(xpath = "//a[text()='Electronic']")
	private WebElement electronicTab;
	@FindBy(xpath = "//a[text()='Headphones']")
	private WebElement headphonesLink;
	
	
    //initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
    //utilization
	public void clickProfileButton() {
		profileButton.click();
	}
	
	public void selectMyProfile() {
		myProfile.click();
	}
	
	public void clicklogout() {
		logout.click();
	}
	
	public void mouseHoverToElectronic(WebDriverUtility web) {
		web.mouseHover(electronicTab);
	}
	public void clickHeadPhonesLink() {
		headphonesLink.click();
	}

}
