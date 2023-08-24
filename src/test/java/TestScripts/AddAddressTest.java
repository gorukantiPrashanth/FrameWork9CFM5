package TestScripts;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class AddAddressTest extends BaseClass {
	@Test
	public void AddAddressTest() {
		welcome.clickLoginButton();
		login.clickonAddAddressButton();
	}

}
