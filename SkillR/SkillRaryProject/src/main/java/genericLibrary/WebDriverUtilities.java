package genericLibrary;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtilities {
	
	//1. Handling Drop-Downs
	public void dropdowns(WebElement element, String text)
	{
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	
	//2. Handling Mouse Hover
	public void mouseHover(WebDriver driver, WebElement element)
	{
		Actions a=new Actions(null);
		a.moveToElement(element).perform();
	}
	
	//3. Handling Right Click
	public void rightClick(WebDriver driver, WebElement element)
	{
		Actions a=new Actions(driver);
		a.contextClick(element).perform();
	}
	
	//4. Handling Double Click
	public void doubleClick(WebDriver driver, WebElement element)
	{
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();
	}
	
	//5. Handling Drag & Drop
	public void dragdrop(WebDriver driver, WebElement src, WebElement target)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(src, target).perform();
	}
	
	//6. Handling Frames
	public void switchFrames(WebDriver driver, WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	//7. Handling Default Content
	public void switchBackToFrame(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
	//8. Handling Child Browser Pop-up
	public void switchingTabs(WebDriver driver)
	{
		Set<String> child = driver.getWindowHandles();
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
	}
	
	//9. Handling Parent Window
	public void parentWindow(WebDriver driver, String parent)
	{
		parent=driver.getWindowHandle();
		driver.switchTo().window(parent);
	}
	
	//10. Handling Scroll Bars
	public void scrollBar(WebDriver driver,int x, int y)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	public void scrollbar(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("a[0].window.scrollIntoview();", element);
	}
	
	//11. Explicit Wait
	public void explicit(WebDriver driver, WebElement element, Duration time)
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	//12. Handling Alter Pop-up
	public void popup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
}
