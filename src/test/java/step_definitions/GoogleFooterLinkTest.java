package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import helper_classes.SetDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleFooterLinkTest {
	private WebDriver driver;

	public GoogleFooterLinkTest() {
		driver = SetDriver.driver;
	}

	
	
	
	
	
	@Given("I launch the Google home page url")
	public void i_launch_the_google_home_page_url() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver",    "C:/Users/saied rahman/utilities/chromedriver.exe");            
		driver = new ChromeDriver();  // For Chrome Browser
		driver.get("https://www.google.com");
		Thread.sleep(2000);
	}

	

	@Given("I scroll down to the end of the page")
	public void i_scroll_down_to_the_end_of_the_page()throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);   

	}

	@When("I select {string} link in the Google footer")
	public void i_select_link_in_the_google_footer(String footerLink_text)throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		By linkedElement = By.xpath("//a[contains(text(),'" + footerLink_text + "')]");
		driver.findElement(linkedElement).click();
		Thread.sleep(2000);
	}

	@Then("I verified the selected Google page by the existence of the {string} text")
	public void i_verified_the_selected_google_page_by_the_existence_of_the_text(String string) {
		// Write code here that turns the phrase above into concrete actions
		for (String newWindow : driver.getWindowHandles()) {
			driver.switchTo().window(newWindow); 
			driver.close();

	}
	}
}