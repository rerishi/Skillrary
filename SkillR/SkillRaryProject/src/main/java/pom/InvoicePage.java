package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoicePage {
	//Declaration
	
	//Address of Download Invoice Button
	@FindBy(name = "downloadInvoice")
	private WebElement downloadInvoiceBtn;
	
	//Initialization
	public InvoicePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void downloadInvoiceButton()
	{
		downloadInvoiceBtn.click();
	}
}
