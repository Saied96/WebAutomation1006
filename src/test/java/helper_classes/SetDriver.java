package helper_classes;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class SetDriver {

	public static WebDriver driver;
	public String browser;
	
	
	/**
	 * Will create a new WebDriver for the desired browser
	 */
	
	@Before
	public void beforeTest(Scenario scenario) throws Exception {
		System.out.println("Before test....");
		
		System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");
		driver = new ChromeDriver();
	
	}
	
	
	@After
	public void afterTest(Scenario scenario) {
		System.out.println("After test....");
		driver.quit();
		
		}
		
		
		public static void deleteCookies(WebDriver driver) {
	        Set<org.openqa.selenium.Cookie> cookies = driver.manage().getCookies();
	        driver.manage().deleteAllCookies();
	        if (!cookies.isEmpty()) {
	            System.out.println(cookies.size());
	            Iterator<org.openqa.selenium.Cookie> iter= driver.manage().getCookies().iterator();
	            while(iter.hasNext()){
	                Cookie C = (Cookie) iter.next();
	              //  System.out.println(C.getName()+"\n" + C.getPath()+"\n"+ C.getDomain()+"\n"+C.getValue()+"\n"+C.getExpiry());
	            }
	            cookies.clear();
	            System.out.println(cookies.size());
	        }
		
	}
	
	
	
}

