package com.ashivrina;

import org.apache.poi.xssf.extractor.XSSFExcelExtractor;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class XlsxFileTest {

    @Test
    void simpleXlsxFileTest() throws URISyntaxException, IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL resource = classLoader.getResource("students.xlsx");
        File xslxFile = new File(resource.toURI());
        XSSFWorkbook workbook;
        try (FileInputStream input = new FileInputStream(xslxFile)) {
            workbook = new XSSFWorkbook(input);
        }
        XSSFExcelExtractor extractor = new XSSFExcelExtractor(workbook);
        extractor.setIncludeSheetNames(false);
        String text = extractor.getText();
        workbook.close();
        for (String student : TestData.students) {
            assertTrue(text.contains(student));
        }
    }
}
