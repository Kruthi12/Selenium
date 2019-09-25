package Day1;

import org.testng.annotations.Test;

public class testng_demo {
  @Test(priority=1)
  public void login() {
	  System.out.println("In the login method.");
  }
  @Test(priority=3)
  public void homepage() {
	  System.out.println("In the homepage method.");
  }
  @Test(priority=4)
  public void logout() {
	  System.out.println("In the logout method.");
  }
  @Test(priority=2)
  public void register() {
	  System.out.println("In the register method.");
  }
}