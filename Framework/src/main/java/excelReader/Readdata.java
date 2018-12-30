package excelReader;

import library.Exceldataconfig;

public class Readdata {

	public static void main(String[] args) {
		
    Exceldataconfig excel = new Exceldataconfig("C:\\Users\\Ashish Rai\\Documents\\TestData.xlsx");
		
		System.out.println(excel.getData(0, 0, 1));
	}
	
	public Object[][] passData()
	{
		Exceldataconfig excel = new Exceldataconfig("C:\\Users\\Ashish Rai\\Documents\\TestData.xlsx");
		
		int rows = excel.getRowCount(0); 
		
		Object[][] data = new Object[rows][2];
		
		for(int i=0; i<rows; i++)
		{
			data[i][0] = excel.getData(0, i, 0);
			data[i][1] = excel.getData(0, i, 1);
					
		}
		 
		return data;
		
	}
	
}
