package com.swm.data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONArray;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.swm.domain.SimpleCounsel;

public class DataToChart {

	@SuppressWarnings("deprecation")
	public static int[][] dataToChart(XSSFWorkbook workBook) {

		int[][] dataset = new int[13][13];
		List<SimpleCounsel> list = new ArrayList<SimpleCounsel>();

		int sheetNum = workBook.getNumberOfSheets();

		for (int k = 0; k < sheetNum; k++) {

			XSSFSheet sheet = workBook.getSheetAt(k);

			int rows = sheet.getPhysicalNumberOfRows();

			int tempMonth = 0;
			int type = 0;

			for (int r = 1; r < rows; r++) {
				XSSFRow row = sheet.getRow(r);
				int cells = row.getPhysicalNumberOfCells();

				XSSFCell cellType = row.getCell(1); // type
				XSSFCell cellDate = row.getCell(5); // date

				Date date = cellDate.getDateCellValue();
				tempMonth = date.getMonth()+1;
				type = (int) cellType.getNumericCellValue();
				dataset[tempMonth][type] += 1;
				
			//	System.out.println("[" + tempMonth + "]" + "[" + type + "] = " + dataset[tempMonth][type]);

			}// row

		}

		//verify date 
		String title;
		for(int i=1; i< dataset.length; i++){
			for(int j=1; j < dataset[i].length; j++){

				switch (j) {
				case 1:
					title="폭력"; break;
				case 2:
					title="외도"; break;
				case 3:
					title="부부갈등"; break;
				case 4:
					title="시집갈등"; break;
				case 5:
					title="가족갈등"; break;
				case 6:
					title="성폭력"; break;
				case 7:
					title="성매매"; break;
				case 8:
					title="여성자신문제"; break;
				case 9:
					title="법률문제"; break;
				case 10:
					title="중독"; break;
				default:
					title="기타"; break;
				}
				list.add(new SimpleCounsel(i,j+"."+title, dataset[i][j]));
				System.out.println("[" + i + "]" + "[" + j +"."+title+ "] = " + dataset[i][j]);
			}
		}
		JSONArray jsonArray = JSONArray.fromObject(list);
		System.out.println("jsonArray" + jsonArray);
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("simpletest.json"));
			out.write(""+jsonArray);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dataset;

	}

}
