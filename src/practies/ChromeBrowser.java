package practies;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\FP\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("Http://Facebook.com");

	}

}
