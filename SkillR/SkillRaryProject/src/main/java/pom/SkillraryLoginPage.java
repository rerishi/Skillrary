package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	//Declaration
	
	//Address of Gears WebElement
	@FindBy(xpath = "//a[text()=' GEARS ']")
	private WebElement gearsBtn;
	
	//Address of SkillRary Demo Application
	@FindBy(xpath = "(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillraryDemoApp;
	
	//Address of Search Text Field
	@FindBy(xpath = "//input[@name='q']")
	private WebElement searchTxtFld;
	
	//Address of Search Icon Button
	@FindBy(xpath = "//input[@value='go']")
	private WebElement searchIcon;
	
	//Address of Close Icon in Cookies Pop-up
	@FindBy(xpath = "//a[@class='close_cookies']")
	private WebElement cookiesCloseBtn;
	
	//Initialization
	public SkillraryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void gearsButton()
	{
		 gearsBtn.click();
	}
	
	public void skillraryDemoAppWebElement()
	{
		skillraryDemoApp.click();
	}
	
	public void searchTextField(String name)
	{
		searchTxtFld.sendKeys(name);
	}
	
	public void searchIconBtn()
	{
		searchIcon.click();
	}
	
	public void cookiesCloseWebElement()
	{
		cookiesCloseBtn.click();
	}
}
