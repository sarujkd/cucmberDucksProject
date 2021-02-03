package pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchDuckPage extends testBase{


	public SearchDuckPage() {
				
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(xpath="//*[@class='gLFyf gsfi']")
    WebElement searchDuckBox;
	
	public ducksHomePage SearchDucks(String duckText)  {
		searchDuckBox.clear();
		searchDuckBox.sendKeys(duckText);
	
		searchDuckBox.sendKeys(Keys.ENTER);
		//System.out.println(driver.getTitle());
		return new ducksHomePage();
		
	}
	
	public String GoogleTitle() {
		return driver.getTitle();
		
	}
}