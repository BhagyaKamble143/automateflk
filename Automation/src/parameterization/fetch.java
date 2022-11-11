package parameterization;

import java.io.FileInputStream;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetch {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//FileInputStream file=new FileInputStream("C:\\Users\\USRE\\Documents\\WT1.xlsx");
		//Workbook w=WorkbookFactory.create(file);
		Sheet s=w.getSheet("Sheet1");
		Row r=s.getRow(1);
		Cell c=r.getCell(1);
		String data=c.getStringCellValue();
		System.out.println(data);
		
		int row=s.getLastRowNum();
		System.out.println(row);
		int cell=r.getLastCellNum();
		System.out.println(cell);
		for(int j=0;j<=row;j++) {
			int y=s.getRow(j).getLastCellNum();
			System.out.println(y);
			for(int i=0;i<=cell-1;i++) {
				System.out.println(r.getCell(i));
				
			}
			System.out.println();
		}
		
	}

}
