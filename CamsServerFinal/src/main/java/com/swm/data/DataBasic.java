package com.swm.data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONArray;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;

import com.swm.domain.Counsel;
import com.swm.service.CounselService;

public class DataBasic {
	
	@Autowired
	private CounselService service;
	

	public static String[][] readExcelFile(XSSFWorkbook workBook){

		String[][] data = null;
		List<Counsel> list = new ArrayList<Counsel>();


		int sheetNum = workBook.getNumberOfSheets();

		for (int k = 0; k < sheetNum; k++) {

			XSSFSheet sheet = workBook.getSheetAt(k);

			int rows = sheet.getPhysicalNumberOfRows();

			data = new String[rows][];
			for (int r = 0; r < rows; r++) {
				XSSFRow row = sheet.getRow(r);
				int cells = row.getPhysicalNumberOfCells();

				data[r] = new String[cells];

				for (short c = 0; c < cells; c++) { // 255

					XSSFCell cell = row.getCell(c);
					
					if (cell == null) {
						continue;
					}
					data[r][c] = poiGetCellValue(cell);
				//	System.out.println("[" + r + "]" + "[" + c + "] = "	+ data[r][c]);
				}// cell
				
				if(r != 0)
					list.add(new Counsel(data[r][0], data[r][1], data[r][2], data[r][3], data[r][4], data[r][5], data[r][6], data[r][7], data[r][8], data[r][9], data[r][10], 
													data[r][11], data[r][12], data[r][13], data[r][14], data[r][15], data[r][16], data[r][17], data[r][18], data[r][19], data[r][20],
													data[r][21], data[r][22], data[r][23], data[r][24], data[r][25], data[r][26]));
				
			

			}// row
		}
		
		JSONArray jsonArray = JSONArray.fromObject(list);
		System.out.println("jsonArray" + jsonArray);
		try {
			
			BufferedWriter out = new BufferedWriter(new FileWriter("test2.json"));
			out.write(""+jsonArray);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return data;
	}
	/*
	 
	List<Counsel> list = new ArrayList<Counsel>();
			
			System.out.println("inseting into db");
			for (int i = 0; i < data.length; i++) {
				list.add(new Counsel(data[i][0], data[i][1],  data[i][2], data[i][3], data[i][4], data[i][5]));
			}
			JSONArray jsonArray = JSONArray.fromObject(list);
			System.out.println("jsonArray" + jsonArray);
	public static Counsel counsel(String no, String type, String relationship, String clientAge, String clientType, String date){
		
		Counsel counsel = new Counsel();
		counsel.setNo(no);
		counsel.setType(type);
		counsel.setRelationship(relationship);
		counsel.setClientAge(clientAge);
		counsel.setClientType(clientType);
		counsel.setDate(date);
		System.out.println(counsel.getNo()+counsel.getType()+counsel.getRelationship()+counsel.getClientAge()+counsel.getClientType()+counsel.getDate());
		return service.create(counsel);
		
	}
*/
	private static String poiGetCellValue(XSSFCell cell){
		String value;
		if(cell.getCellType() == 0){
			if(HSSFDateUtil.isCellDateFormatted(cell)){
				Date date = cell.getDateCellValue();
				SimpleDateFormat newDate= new SimpleDateFormat("M/d/yyyy");
				value = newDate.format(date);
				int month = date.getMonth()+1;
			}else
				value=""+cell.getNumericCellValue();
		}else if(cell.getCellType() == 1)
			value=cell.getStringCellValue();
		else 
			value="";
		
		return value;
	}

}
