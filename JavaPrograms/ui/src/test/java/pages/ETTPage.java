package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ETTPage {

	private WebDriver driver;
	
	public ETTPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public boolean verifyHomePageIsDisplayed(String expectedTitle) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		try
		{
			wait.until(ExpectedConditions.titleContains(expectedTitle));
			System.out.println("Home page is displayed");
			return true;
		}
		catch (Exception e) {
			System.err.println("Home page is Not displayed");
			return false;
		}
	}
}
