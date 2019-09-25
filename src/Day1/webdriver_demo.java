package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class webdriver_demo {
	WebDriver driver=null;
  @Test
  public void browserlaunch() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\Browser drivers\\chromedriver.exe\\");
	  driver=new ChromeDriver();
	  String url="http://www.google.com";
	  driver.get(url);
	  
	  //System.setProperty("webdriver.ie.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\Browser drivers\\IEDriverServer.exe\\");
	  //driver=new InternetExplorerDriver();
	  //String url="http://www.google.com";
	  //driver.get(url);
	  
	  //System.setProperty("webdriver.gecko.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\Browser drivers\\geckodriver.exe");
	  //driver=new FirefoxDriver();
	  //String url="http://www.google.com";
	  //driver.get(url);
  }
}