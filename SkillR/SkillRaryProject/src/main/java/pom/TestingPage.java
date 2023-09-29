package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	//Declaration
	
	@FindBy(xpath = "(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebookLink;
	
	//Initialization
	public TestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void facebookWebElement()
	{
		facebookLink.click();
	}

	public WebElement getFacebookLink() {
		return facebookLink;
	}
	
}
