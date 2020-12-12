package DataType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Primitive {

	public static void main(String[] args) {
		
		
		
		//Modulation
		
		int T=26;
		int Y=5;
		int modulation = T%Y;
		
	System.out.println(modulation);
		
	
	//Operators
	
	String driver="chrome";
	if (driver.equalsIgnoreCase("chrome")) {
		
		System.out.println("driver click");
	}
		
	int q=16;
	if (q==20) {
		System.out.println("PASS");
	}
	else if(q!=20);
	{
		System.out.println("FAIL");
	}
				
		
				

		
}
}