package Package1;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test
	public void createOrgTest() {
		
		String Url = System.getProperty("url");
		String Browser= System.getProperty("browser");
		String Username = System.getProperty("usernam");
		String Password = System.getProperty("password");
		
		System.out.println(Url);
		System.out.println(Browser);
		System.out.println(Username);
		System.out.println(Password);
		
		
		
		System.out.println("createContactTest executed");
		} 

	
	@Test
	public void modifyOrgTest() {
		System.out.println("modifyContactTest executed");
		} 

}
