package library;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataconfig
{
    Workbook wb;
    Sheet sheet1;
	
    public Exceldataconfig(String excelpath) 
    {
    	
    try
    {
		File file = new File(excelpath);     //Create an object of FileInputStream class to read excel file
		
		FileInputStream inputStream = new FileInputStream(file);
		        
		String fileExtensionName = excelpath.substring(excelpath.indexOf("."));
		
		wb = null;
		
		if(fileExtensionName.equals(".xlsx"))
		{
		  wb = new XSSFWorkbook(inputStream);
		}
		else if(fileExtensionName.equals(".xls"))
		{
		   wb = new HSSFWorkbook(inputStream);
		}
				
	 } 
     catch (Exception e)
    {
    	 System.out.println(e.getMessage());
	}   
     
    }
    
    public String getData(int sheetnumber,int row,int column)
	{
		sheet1 = wb.getSheetAt(sheetnumber);
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
	
	public int getRowCount(int sheetIndex)
	{
	
		int row = wb.getSheetAt(sheetIndex).getLastRowNum();
		row = row + 1;
		return (row);
		
	}
	
}