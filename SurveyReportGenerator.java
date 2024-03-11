package com.demo.Survey;
	
	import org.apache.poi.ss.usermodel.*;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.List;

	public class SurveyReportGenerator {
	    public static void generateExcelReport(List<SurveyResponse> responses) {
	        try (Workbook workbook = new XSSFWorkbook()) {
	            Sheet sheet = workbook.createSheet("Survey Report");

	            Row headerRow = sheet.createRow(0);
	            String[] headers = {"Question", "Response Count"};
	            for (int i = 0; i < headers.length; i++) {
	                Cell cell = headerRow.createCell(i);
	                cell.setCellValue(headers[i]);
	            }

	            int rowNum = 1;
	            for (SurveyResponse response : responses) {
	                Row row = sheet.createRow(rowNum++);
	                row.createCell(0).setCellValue(response.getQuestion());
	                row.createCell(1).setCellValue(response.getResponseCount());
	            }

	            try (FileOutputStream outputStream = new FileOutputStream("survey_report.xlsx")) {
	                workbook.write(outputStream);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	   
	    
	}



