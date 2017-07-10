package excel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFile {

	public static void main(String[] args) throws IOException
	{
		String textFile="D:\\SampleData.txt";
		File Fc=new File(textFile);
		Fc.createNewFile();
		
		FileWriter Fw=new FileWriter(textFile);
		BufferedWriter Bw=new BufferedWriter(Fw);
		Bw.write("HI");
		Bw.newLine();
		Bw.write("QTP");
		Bw.close();
		//Reading Data
		FileReader Fr=new FileReader(textFile);
		BufferedReader Br=new BufferedReader(Fr);
	String content="";
		while((content=Br.readLine())!=null)
		{
			System.out.println(content);
		}
		

	}

}
