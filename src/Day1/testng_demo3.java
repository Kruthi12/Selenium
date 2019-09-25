package Day1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testng_demo3 {
  @Test
  public void f() {
	  
	  Assert.assertTrue(16<18);
  }
  @Test
  public void testdemo1() {
	  Assert.assertTrue("hello".startsWith("h"));
  }
  @Test
  public void testdemo2() {
	  Assert.assertEquals("Hello","Hello");
	  Assert.assertTrue("hello".startsWith("H"));
	  Assert.assertTrue(16<18);
  }
  @Test
  public void testdemo3() {
	  Object obj=null;
	  Assert.assertNull(obj);
  }
  @Test
  public void testdemo4() {
	  SoftAssert s=new SoftAssert();
	  s.assertEquals(10,11);
	  s.assertEquals(2, 2);
	  s.assertEquals("Hello", "hello");
	  s.assertAll();
  }
}