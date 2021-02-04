package steps;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.LoginPage;
import page.SkyBlueBackground;
import page.SkyWhiteBackground;
import util.BrowserFactory;

public class StepDef {
	
	 WebDriver driver;
		LoginPage login;
		SkyBlueBackground skyblue;
		SkyWhiteBackground whitebackground;
		
		@Before
		public void BeforeRun() {
			
			driver=BrowserFactory.init();
			login=PageFactory.initElements(driver,LoginPage.class);
			skyblue=PageFactory.initElements(driver,SkyBlueBackground.class);
			whitebackground=PageFactory.initElements(driver,SkyWhiteBackground.class);
		}

		@Given  ("^Techfios test page$")
		public void User_is_on_the_Techfios_test_page () {
			driver.get("https://techfios.com/test/101/");
		}	
		 @When("^User clicks on  set skyBlue Background  button $") 
		   public void User_clicks_on_set_skyBlue_Background_button () throws Throwable {
			 skyblue.clickOnSetSkyBlueBackgroundButton();
			 Thread.sleep(3000);
			 
		}
		 @Then("^The background color should change to skyBlue$")
		   public void The_background_color_should_change_to_skyBlue() throws Throwable {
			 TakesScreenshot ts = ((TakesScreenshot) driver);
				File sourceFile = ts.getScreenshotAs(OutputType.FILE);
				String currentDir = System.getProperty("user.dir");
				FileUtils.copyFile(sourceFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
			
		
		}
		
		   @When("^User clicks on the  set White Background Button $") 
		  public void User_clicks_on_the_set_White_Background_Button() throws Throwable {
				whitebackground.clickOnSetWhiteBackgroundButton();
				Thread.sleep(3000);
	}
		   @Then("^The Background colour Should Change to White$")
		   public void The_Background_colour_Should_Change_to_White() {
			   System.out.println("white background setup button should be clickable");
			   
		   }
		   

	@When("^User clicks on  set skyBlue Background  button$")
	public void user_clicks_on_set_skyBlue_Background_button() throws Throwable {
	    System.out.println("set background button should be clickable");
	} 

	@When("^User clicks on the  set White Background Button$")
	public void user_clicks_on_the_set_White_Background_Button() throws Throwable {
	    System.out.println("white button clicks");
	}

		   
	}		

	
