package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ducksHomePage extends testBase{

	public ducksHomePage() {
		
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(xpath="//div//h2//span[contains(text(),'Duck')]")

    WebElement ducksText;
	
	
	public String ducksHomePageTitle() {
		return driver.getTitle();
		
	}

	public boolean Verify_ducksText() {
		return ducksText.isDisplayed();
		
		
	}
	
}
