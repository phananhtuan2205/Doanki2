/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chart;

import Diem.Diem;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author TranHung
 */
public class Chart {
    
    public static ChartPanel getPieChartPanel( ArrayList<Diem> listDiem) {
        ChartPanel chartPanel ;
        
        //tao dataset
        int a=0 , b =0, c=0, d=0;
        
        for (Diem diem : listDiem) {
            if (diem.getDiem()<4) {
                a++;
            }else if (diem.getDiem()<6.5) {
                b++;
            }else if (diem.getDiem()<8.0) {
                c++;
            }else d++;
        }
        
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("FAIL- "+a, a);
        dataset.setValue("PASS- "+b, b);
        dataset.setValue("CREDIT- "+c, c);
        dataset.setValue("DIST- "+d, d);
        
        //tao chart
        JFreeChart chart = ChartFactory.createPieChart(null, dataset, true, true, true);
        
        //tao panel
        chartPanel = new ChartPanel(chart);
        
        return chartPanel;
    }
    
    public static ChartPanel getBarChartPanel(ArrayList<Diem> listDiem){
        ChartPanel chartPanel;
        
        //tao dataset
        int a=0 , b =0, c=0, d=0;
        
        for (Diem diem : listDiem) {
            if (diem.getDiem()<4) {
                a++;
            }else if (diem.getDiem()<6.5) {
                b++;
            }else if (diem.getDiem()<8.0) {
                c++;
            }else d++;
        }
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(d, "Số SV", "DIST");
        dataset.addValue(c, "Số SV", "CREDIT");
        dataset.addValue(b, "Số SV", "PASS");
        dataset.addValue(a, "Số SV", "FAIL");
        
        //tạo chart
        JFreeChart barChart = ChartFactory.createBarChart(
                null,
                null, null,
                dataset, PlotOrientation.VERTICAL, false, false, false);
        
        chartPanel = new ChartPanel(barChart);
        
        return chartPanel;
    }
}
