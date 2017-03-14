import java.io.File;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class selenium_Code {
	private WebDriver iedriver;
	private WebDriver chdriver;
	String myURL;
	//Beginning part
	@Before
	public void setup() throws Exception{
		File iefile = new File("C:\\Users\\swami\\workspace\\Selenium\\DemoProject\\src\\LIB\\IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", iefile.getAbsolutePath());
		
		File chfile = new File("C:\\Users\\swami\\workspace\\Selenium\\DemoProject\\src\\LIB\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chfile.getAbsolutePath());
		
		//iedriver = new InternetExplorerDriver();
		chdriver = new ChromeDriver();
		myURL = "http://www.linkedin.com";
	
	}
	
	@Test
	public void mymaintest() throws Exception{
		//launch a browser and navigate to url
		//iedriver.navigate().to(myURL);
		chdriver.navigate().to(myURL);
		chdriver.findElement(By.xpath("//*[@id='login-email']")).sendKeys("swaminathans76@gmail.com");
		chdriver.findElement(By.xpath("//*[@id='login-password']")).sendKeys("Pepsi123!");
		//chdriver.wait(10);
		chdriver.findElement(By.xpath("//*[@id='login-submit']")).click();
		
		
		
		
		chdriver.findElement(By.xpath("//*[@id='nav-settings__dropdown-trigger']/div/span[1]")).click();
		chdriver.findElement(By.xpath("//*[@id='ember4445']")).click();
		//*[@id="ember3474"]
		//*[@id="login-email"]
		//*[@id="nav-settings__dropdown-trigger"]/div/span[1]
		//*[@id="header-my-account-password"]
		//*[@id="header-my-account-sign-in"]
		//*[@id="header-my-account-sign-in"]
	}
	
	@After
	public void myteardown() throws Exception{
		//chdriver.close();
	}
	
}
