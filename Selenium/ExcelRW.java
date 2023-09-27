package test3;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;

import java.io.*;

public class ExcelRW {
    public static void main(String[] args) {
        // Specify your Excel file paths
        String inputFilePath = "D://studentdata.xlsx"; // Input file
        String outputFilePath = "D://output.xlsx";      // Output file

        // Read Excel file
        try {
            FileInputStream fileInputStream = new FileInputStream(inputFilePath);
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            XSSFSheet sheet = workbook.getSheetAt(0);

            // Read data from cell A1
            XSSFRow row = sheet.getRow(0);
            XSSFCell cell = row.getCell(0);
            String cellData = cell.getStringCellValue();
            System.out.println("Data in cell A1: " + cellData);

            // Write Excel file
            FileOutputStream fileOutputStream = new FileOutputStream(outputFilePath);

            // Create a new workbook and sheet
            XSSFWorkbook newWorkbook = new XSSFWorkbook();
            XSSFSheet newSheet = newWorkbook.createSheet("Sheet1");

            // Create a new row and cell
            XSSFRow newRow = newSheet.createRow(0);
            XSSFCell newCell = newRow.createCell(0);

            // Set a value in cell A1
            newCell.setCellValue("Hello, Excel!");

            // Write the new workbook to the output file
            newWorkbook.write(fileOutputStream);

            // Close input and output streams
            fileInputStream.close();
            fileOutputStream.close();

            System.out.println("Data written to " + outputFilePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
