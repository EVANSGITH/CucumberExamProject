package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SkyBlueBackground {
WebDriver driver;

 public SkyBlueBackground(WebDriver driver){
	
	this.driver=driver;
}
 @FindBy(how=How.XPATH,using="//*[@id=\"extra\"]/button[1]")WebElement SKYBLUE_BACKGROUND_BUTTON_LOCATOR;
 
 public void clickOnSetSkyBlueBackgroundButton() throws InterruptedException {
		SKYBLUE_BACKGROUND_BUTTON_LOCATOR.click();
		Thread.sleep(15000);
	}
}
