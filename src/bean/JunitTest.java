package bean;
import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTest {
		
	
	
	/*@Test
		public void testOne(){
			
			System.out.println("Junit test case to test getters and setters");
			String Uname = "Ashwini";
			User u = new User();
			u.setUname(Uname);
			String getName = u.getUname();
			assertEquals(getName, Uname);
		
		
		}*/
	@Test
		public void testOne(){
			beginAt("http://localhost:8080/CustomerOnBoard/index1.jsp"); 
	       		assertTitleEquals("Registration Form");
		}
	
		
}


