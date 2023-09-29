package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	//Declaration
	
	//Address of + icon
	@FindBy(id = "add")
	private WebElement plusIcon;
	
	//Address of Add To Cart Button
	@FindBy(xpath = "//button[@ondblclick='addtocart()']")
	private WebElement addToCartBtn;
	
	//Initialization
	public AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization

	public WebElement getPlusIcon() {
		return plusIcon;
	}
	
	public void addToCartButton()
	{
		addToCartBtn.click();
	}

}
