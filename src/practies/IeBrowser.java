package practies;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver",
				"C:/Users/FP/Downloads/IEDriverServer.exe");
		InternetExplorerDriver d=new InternetExplorerDriver();
		d.get("Http://yahoo.com");

	}

}
