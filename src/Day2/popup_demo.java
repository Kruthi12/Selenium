package Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class popup_demo {
  @Test
  public void f() {
	  WebDriver driver=driver_utility.getDriver("chrome");
	  String url="http://demowebshop.tricentis.com/login";
	  driver.navigate().to(url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//input[@value='Search']")).click();;
	  Alert alt=driver.switchTo().alert();
	  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	  System.out.println("Alert text is "+alt.getText());
	  alt.accept();
	  driver.close();
  }
}