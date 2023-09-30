package scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pom.SkillraryDemoLoginPage;
import pom.SkillraryLoginPage;
import pom.TestingPage;

public class TestCase2 extends BaseClass{
	
	@Test
	public void tc2() throws Throwable
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoAppWebElement();
		utilities.switchingTabs(driver);
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		utilities.dropdowns(sd.getSelectCategoryDD(), pdata.getPropertyData("coursedd"));
		TestingPage tp=new TestingPage(driver);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", tp.getFacebookLink());
		
		//utilities.scrollbar(driver, tp.getFacebookLink());
//		Point cordinates = tp.getFacebookLink().getLocation();
//		int X=cordinates.getX();
//		int Y=cordinates.getY();
//		
//		utilities.scrollBar(driver, X, Y);
		tp.facebookWebElement();
	}

}
