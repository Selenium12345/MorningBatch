package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import methods.FunctionOHRM;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTest
{
public static void main(String[] args) throws IOException, InterruptedException 
{
FunctionOHRM app=new FunctionOHRM();
File src=new File("C:\\Users\\FP\\Desktop\\EmpDetails.xlsx");
FileInputStream fis=new FileInputStream(src);
XSSFWorkbook wb=new XSSFWorkbook(fis);
XSSFSheet ws=wb.getSheetAt(0);
int rcnt=ws.getLastRowNum();
app.appLaunch();
app.appLogin("Admin","admin");
for (int i = 1; i <=rcnt; i++)
{
String fName=ws.getRow(i).getCell(0).getStringCellValue();
String lName=ws.getRow(i).getCell(1).getStringCellValue();
String results=app.addEmp(fName, lName);
ws.getRow(i).createCell(2).setCellValue(results);	
FileOutputStream fos=new FileOutputStream(src);
wb.write(fos);
	}
		wb.close();
		
	}

}
