package com.swm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.servlet.ServletUtilities;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/charts")
public class ChartTestController {

	private String formViewName = "charts/piechart";
	
	@RequestMapping(value = "/piechart")
	 public ModelAndView handleReports(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession(true);
		response.setContentType("text/html");
		ModelAndView mav = new ModelAndView();
		PieDataset pdSet = createDataSet();
		JFreeChart chart = createChart(pdSet, "My Pie Chart");
		
		try {
			System.out.println("saving start...");
			String filename=ServletUtilities.saveChartAsPNG(chart, 500, 300, session);
			mav.addObject("file", "http://"+ request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/servlet/DisplayChart?filename="+filename);
			mav.setViewName(formViewName); 
			return mav;
		} catch (java.io.IOException exc) {
		    System.err.println("Error writing image to file");
		}
		return mav;
	}
	
	private PieDataset createDataSet() {
		DefaultPieDataset dpd = new DefaultPieDataset();
		dpd.setValue("mac", 21);
		dpd.setValue("Linux", 30);
		dpd.setValue("Window", 40);
		dpd.setValue("Others", 9);
		return dpd;
	}

	private JFreeChart createChart(PieDataset pdSet, String chartTitle) {
		JFreeChart chart = ChartFactory.createPieChart3D(chartTitle, pdSet,	true, true, false);
		PiePlot3D plot = (PiePlot3D) chart.getPlot();
		plot.setStartAngle(290);
		plot.setDirection(Rotation.CLOCKWISE);
		plot.setForegroundAlpha(0.5f);
		return chart;
	}

}