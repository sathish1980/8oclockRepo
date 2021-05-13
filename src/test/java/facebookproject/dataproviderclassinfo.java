package facebookproject;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import commonmethods.reusable;
import pack.oclockmavenproject.excelreadandwrite;

public class dataproviderclassinfo 
{	
	String filepath="C:\\Users\\sathish.kumar15\\eclipse-workspace\\8oclockmavenproject\\inputFile\\";
	String fileName="inputdata.xls";
	String sheetName ="input";
	reusable cs= new reusable();
	excelreadandwrite ew= new excelreadandwrite();

	@DataProvider
	public String[][] excel() throws IOException
	{
		return ew.excelreaddata(filepath,fileName,sheetName );
	}
}
