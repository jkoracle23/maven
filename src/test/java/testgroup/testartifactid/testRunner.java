package testgroup.testartifactid;


import org.junit.Assert;
import org.junit.Test;

public class testRunner {

	@Test
	public  void Test()
	{
		System.out.println("hi");
		System.out.println("added line from github portal");
		
		Assert.assertEquals("this is message", "test", "not test");
		System.out.println("added second line from github portal")
	}
	
	
}
