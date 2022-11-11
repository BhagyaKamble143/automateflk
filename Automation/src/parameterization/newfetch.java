package parameterization;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class newfetch {
	FileInputStream file=new FileInputStream("C:\\Users\\USRE\\Documents\\WT1.xlsx");
	double data=WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getNumericCellValue();
	int rowCount=WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
	Cell c=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0);
	for(int i=0;i<=rowCount;i++) {
		int cellCount=WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		for(int j=0;j<=cellCount-1;j++) {
			if(c.equals(CellType.BOOLEAN)) {
				c.getBooleanCellValue();
				c.getBooleanCellValue();
			}
			else if(c.equals(CellType.NUMERIC)) {
				
			}
		}
	}
}
	
}

