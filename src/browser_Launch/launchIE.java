package browser_Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class launchIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver", "F:\\Selenium\\drivers\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		

	}

}
