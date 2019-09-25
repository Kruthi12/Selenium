package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class wediver_demo_webshop {
  @Test
  public void f() {
	  WebDriver driver=driver_utility.getDriver("chrome");
	  String url="http://demowebshop.tricentis.com";
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.findElement(By.linkText("Log in")).click();;
	  driver.findElement(By.className("email")).sendKeys("aravind.guggilla57@gmail.com");
	  driver.findElement(By.id("Password")).sendKeys("aravind");
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	  driver.close();
	  driver.quit();
  } 
}