package scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pom.AddToCartPage;
import pom.SkillraryDemoLoginPage;
import pom.SkillraryLoginPage;

public class TestCase1 extends BaseClass {
	@Test
	public void tc1()
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoAppWebElement();
		utilities.switchingTabs(driver);
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		utilities.mouseHover(driver, sd.getCoutseTab());
		sd.javaLinkWebElement();
		AddToCartPage ac=new AddToCartPage(driver);
		utilities.doubleClick(driver, ac.getPlusIcon());
		ac.addToCartButton();
		utilities.popup(driver);
		
	}

}
