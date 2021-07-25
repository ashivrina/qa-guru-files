package com.ashivrina;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static com.ashivrina.TestData.expectedStates;

public class DocxFileTest {

    @Test
    void simpleDocxTest() throws IOException, URISyntaxException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL resource = classLoader.getResource("countries_europe.docx");
        File docxFile = new File(resource.toURI());
        XWPFDocument document;
        try (FileInputStream input = new FileInputStream(docxFile)) {
            document = new XWPFDocument(input);
        }
        List<XWPFParagraph> paragraphs = document.getParagraphs();
        List<String> actualStates = new ArrayList<>();
        for (XWPFParagraph para : paragraphs) {
            actualStates.add(para.getText());
        }

        Assertions.assertLinesMatch(expectedStates, actualStates);
    }
}
