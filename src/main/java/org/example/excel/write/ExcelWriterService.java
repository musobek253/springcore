package org.example.excel.write;

import org.apache.poi.ss.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ExcelWriterService {
    public static void main(String[] args) throws IOException {
        writeExcelFeli("/path/to/org/example/excel/output/file.xlsx");
    }

    public static void writeExcelFeli(String filePath) throws IOException {
        try (Workbook workbook = WorkbookFactory.create(true)){
            Sheet sheet = workbook.createSheet("Sheet 1");
            Row headerRow = sheet.createRow(0);
            List<String> headers = Arrays.asList("Name", "Age", "Email", "Date");
            for (int i = 0; i < headers.size(); i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(headers.get(i));
            }
            // Write data rows
            for (int rowNum = 1; rowNum <= 4; rowNum++) {
                Row row = sheet.createRow(rowNum);
                row.createCell(0).setCellValue("Name" + rowNum);
                row.createCell(1).setCellValue(25 + rowNum);
                row.createCell(2).setCellValue("email" + rowNum + "@example.com");
                row.createCell(3).setCellValue(new Date());
            }
            try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
                workbook.write(fileOut);
            }
        }
    }


}
