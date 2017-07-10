package methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class excelloginohrm {
	String res;

	public static void main(String[] args) throws InterruptedException, IOException {
		
		 File scr=new File("C:\\Users\\FP\\Desktop\\yy.xlsx");
	        FileInputStream Fis=new FileInputStream(scr);
	        XSSFWorkbook wb=new XSSFWorkbook(Fis);
	        XSSFSheet ws=wb.getSheetAt(0);
	        excelloginohrm r=new excelloginohrm ();
	    int rct=ws.getLastRowNum();
	  
	    
	    for (int i = 1; i <=rct; i++)
	    {
	    	  String userName= ws.getRow(i).getCell(0).getStringCellValue();
	          String pwd=ws.getRow(i).getCell(1).getStringCellValue();
	        System.out.println(userName);
	        System.out.println(pwd);
	      
	       
	    	String res=r.kumar(userName, pwd);
	    }
	}
	public String kumar(String userName, String pwd) throws InterruptedException
    {
	   FirefoxDriver d=new FirefoxDriver();
	    d.get("http://opensource.demo.orangehrmlive.com/");
	    d.findElement(By.id("txtUsername")).sendKeys(userName);
	    d.findElement(By.id("txtPassword")).sendKeys(pwd);
	    d.findElement(By.id("btnLogin")).click();
	    Thread.sleep(2000);
	  
	        if (d.findElement(By.linkText("PIM")).isDisplayed()) {
	            
	        	res="pass";
	            
	        }
	        else {
	            System.out.println("FAIL");
	            res="fail";
	        }
    return res;

	
    }
}
