package com.ashivrina;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class PdfFileTest {

    @Test
    void simplePdfTest() throws URISyntaxException, IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL resource = classLoader.getResource("pdfSampleFile.pdf");
        File pdfFile = new File(resource.toURI());
        PDDocument pdfDocument;
        try (FileInputStream input = new FileInputStream(pdfFile)) {
            pdfDocument = PDDocument.load(input);
        }
        PDFTextStripper pdfTextStripper = new PDFTextStripper();
        String pdfText = pdfTextStripper.getText(pdfDocument);
        Assertions.assertEquals(TestData.expectedPdfText, pdfText);
    }
}
