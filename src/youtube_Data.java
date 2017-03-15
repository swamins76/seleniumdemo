import java.io.File;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class youtube_Data {
	private WebDriver iedriver;
	private WebDriver chdriver;
	String myURL;
	String results;
	//Beginning part
	@Before
	public void setup() throws Exception{
		File iefile = new File("C:\\Users\\swami\\workspace\\Selenium\\DemoProject\\src\\LIB\\IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", iefile.getAbsolutePath());
		
		File chfile = new File("C:\\Users\\swami\\workspace\\Selenium\\DemoProject\\src\\LIB\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chfile.getAbsolutePath());
		
		//iedriver = new InternetExplorerDriver();
		chdriver = new ChromeDriver();
		myURL = "http://www.youtube.com";
	
	}
	
	@Test
	public void mymaintest() throws Exception{
		//launch a browser and navigate to url
		//iedriver.navigate().to(myURL);
		chdriver.navigate().to(myURL);
		chdriver.findElement(By.xpath("//*[@id='masthead-search-term']")).sendKeys("Pragmatic Marketing");
		//chdriver.findElement(By.xpath("//*[@id='login-password']")).sendKeys("Pepsi123!");
		//chdriver.wait(10);
		chdriver.findElement(By.xpath("//*[@id='search-btn']")).click();
		results = chdriver.findElement(By.xpath("//*[starts-with(@id,'section-list')]")).getText();		
		System.out.println(results);
		
		chdriver.findElement(By.xpath("//*[@id='nav-settings__dropdown-trigger']/div/span[1]")).click();
		//chdriver.findElement(By.xpath("//*[@id='ember4445']")).click();
		//*[@id="ember3474"]
		//*[@id="login-email"]
		//*[@id="nav-settings__dropdown-trigger"]/div/span[1]
		//*[@id="header-my-account-password"]
		//*[@id="header-my-account-sign-in"]
		//*[@id="header-my-account-sign-in"]
		//*[@id="section-list-306122"]/li[1]/div/div[1]/div/p
		//*[@id="section-list-564240"]/li[1]/div/div[1]/div/p
		//*[@id="section-list-564240"]/li[1]/div/div[1]/div/p
		//*[@id="section-list-197993"]/li[1]/div/div[1]/div/p
		//*[@id="section-list-174628"]/li[1]/div/div[1]/div/p
	}
	
	@After
	public void myteardown() throws Exception{
		//chdriver.close();
	}

}
