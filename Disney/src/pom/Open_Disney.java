package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Disney {
	 static WebDriver driver;
	public void Website() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium topics\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://disneyworld.disney.go.com/tickets/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

}
	public  Open_Disney(WebDriver driver)
	{
		Open_Disney.driver= driver;
		
	}
	public Open_Disney(){
		
	}
public WebDriver getdriver(){
	return Open_Disney.driver;
	}
}