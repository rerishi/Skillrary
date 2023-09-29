package scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pom.InvoicePage;
import pom.SkillraryDemoLoginPage;
import pom.SkillraryLoginPage;

public class TestCase3 extends BaseClass {
	
	@Test
	public void tc3()
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoAppWebElement();
		utilities.switchingTabs(driver);
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		sd.feedbackTabWebElement();
		InvoicePage ip=new InvoicePage(driver);
		ip.downloadInvoiceButton();
	}

}
