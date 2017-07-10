package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadingData {

	public static void main(String[] args) throws IOException
	{
File src=new File("C:\\Users\\FP\\Desktop\\SampleData.xlsx");
	FileInputStream fis=new FileInputStream(src);
	//create workbook object
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	//create worksheet object
	XSSFSheet ws=wb.getSheetAt(0);
	int rcnt=ws.getLastRowNum();
	for (int i = 1; i <=rcnt; i++)
	{
		String data1=ws.getRow(i).getCell(0).getStringCellValue();
		String data2=ws.getRow(i).getCell(1).getStringCellValue();
			System.out.println(data1+"---"+data2);
	}
		wb.close();
	
	}

}
