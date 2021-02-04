package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SkyWhiteBackground {
	
WebDriver driver;
	
	public void SetEWhiteBackground(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"extra\"]/button[2]")WebElement WHITE_BACKGROUND_BUTTON_LOCATOR;

public void clickOnSetWhiteBackgroundButton() {
	WHITE_BACKGROUND_BUTTON_LOCATOR.click();
}
}


