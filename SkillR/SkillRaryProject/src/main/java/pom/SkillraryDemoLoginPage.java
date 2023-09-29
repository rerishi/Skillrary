package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage {
	//Declaration
	
	//Address of the Course
	@FindBy(id = "course")
	private WebElement coutseTab;
	
	//Address of java
	@FindBy(xpath = "(//a[text()='Java'])[1]")
	private WebElement javaLink;
	
	//Address of Select Category DD
	@FindBy(xpath = "//select[@class='chosen-select']")
	private WebElement selectCategoryDD;
	
	//Address of Feedback Tab
	@FindBy(xpath = " //a[text()='FEEDBACK']")
	private WebElement feedbackTab;
	
	//Initialization
	public SkillraryDemoLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization

	public WebElement getCoutseTab() {
		return coutseTab;
	}

	public WebElement getSelectCategoryDD() {
		return selectCategoryDD;
	}
	
	public void javaLinkWebElement()
	{
		javaLink.click();
	}
	
	public void feedbackTabWebElement()
	{
		feedbackTab.click();
	}

}
