package com.swm.controller;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.servlet.ServletUtilities;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.swm.data.DataBasic;
import com.swm.data.DataToChart;
import com.swm.domain.Counsel;
import com.swm.service.CounselService;

@Controller
@RequestMapping("/data")
public class DataController {

	@Autowired
	private static CounselService service;

	@RequestMapping(value = "/readExcel")
	public String readExcel() {

		String filePath = "test600.xlsx";
		File file1 = new File(filePath);
		System.out.println(file1.getAbsolutePath());
		String[][] data={{""},{""}};

		if (!file1.exists())
			System.out.println("file dosen't exist");

		XSSFWorkbook workBook;
		try {
			workBook = new XSSFWorkbook(new FileInputStream(new File(filePath)));

			data = DataBasic.readExcelFile(workBook); // read excel data and put
											// into the array
			
			System.out.println("the end");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "/index";
	}

	public Counsel counsel(String no, String type, String relationship,
			String clientAge, String clientType, String date) {

		Counsel counsel = new Counsel();
		counsel.setNo(no);
		counsel.setType(type);
		counsel.setRelationship(relationship);
		counsel.setcAge(clientAge);
		counsel.setcType(clientType);
		counsel.setDate(date);
		System.out.println(counsel.getNo() + counsel.getType()
				+ counsel.getRelationship() + counsel.getcAge()
				+ counsel.getcType() + counsel.getDate());
		return service.create(counsel);

	}

	@RequestMapping(value = "/readExcelAndCreateChart")
	public ModelAndView readExcelAndCreateChart(HttpServletRequest request,
			HttpServletResponse response) {

		ModelAndView mav = new ModelAndView();
		HttpSession session = request.getSession(true);
		response.setContentType("text/html; charset=utf-8");

		String filePath = "test600.xlsx";
		File file1 = new File(filePath);
		System.out.println(file1.getAbsolutePath());
		int[][] dataset = { { 0, 0 } };

		if (!file1.exists())
			System.out.println("file dosen't exist");

		XSSFWorkbook workBook;
		try {
			workBook = new XSSFWorkbook(new FileInputStream(new File(filePath)));
			dataset = DataToChart.dataToChart(workBook);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		XYDataset xyDataset = createXYDataset(series(dataset));
		JFreeChart chart = createChart(xyDataset);
		String filename;
		try {
			filename = ServletUtilities
					.saveChartAsPNG(chart, 700, 500, session);
			mav.addObject("file", "http://" + request.getServerName() + ":"
					+ request.getServerPort() + request.getContextPath()
					+ "/servlet/DisplayChart?filename=" + filename);
			mav.setViewName("charts/piechart");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return mav;

	}

	private ArrayList<XYSeries> series(int[][] dataset) {
		ArrayList<XYSeries> series = new ArrayList<XYSeries>();

		series.add(createXYSeries(dataset, 0, "���"));
		series.add(createXYSeries(dataset, 1, "�ܵ�"));
		series.add(createXYSeries(dataset, 2, "�κΰ���"));
		series.add(createXYSeries(dataset, 3, "�����"));
		series.add(createXYSeries(dataset, 4, "��������"));
		series.add(createXYSeries(dataset, 5, "�����"));
		series.add(createXYSeries(dataset, 6, "���Ÿ�"));
		series.add(createXYSeries(dataset, 7, "�����ڽŹ���"));
		series.add(createXYSeries(dataset, 8, "�����"));
		series.add(createXYSeries(dataset, 9, "�ߵ�"));
		series.add(createXYSeries(dataset, 10, "��Ÿ"));

		return series;
	}

	private XYSeries createXYSeries(int[][] dataset, int n, String title) {
		XYSeries series = new XYSeries(title);
		for (int i = 0; i < dataset.length; i++) {
			series.add(i, dataset[i][n]);
		}
		return series;
	}

	private XYDataset createXYDataset(ArrayList<XYSeries> series) {
		XYSeriesCollection result = new XYSeriesCollection();
		Iterator<XYSeries> it = series.iterator();
		while (it.hasNext()) {
			result.addSeries(it.next());
		}
		return result;
	}

	private JFreeChart createChart(XYDataset xyDataset) {
		JFreeChart chart = ChartFactory.createXYLineChart("Date - Type",
				"Date", "Frequence", xyDataset, PlotOrientation.VERTICAL, true,
				true, false);
		TextTitle subTitle = new TextTitle("Frequency Type per Date");

		chart.setBackgroundPaint(Color.WHITE);
		chart.addSubtitle(subTitle);
		chart.getTitle().setFont(new Font("����", Font.BOLD, 15));
		chart.getLegend().setItemFont(new Font("����", Font.PLAIN, 10));
		return chart;
	}

	
}
