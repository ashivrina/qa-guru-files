package com.ashivrina;


import net.lingala.zip4j.ZipFile;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;


public class ZipArchiveTest {

    @Test
    void simpleZipTest() throws IOException {
        ZipFile zipFile = new ZipFile("./src/test/resources/zip/annas_archive.zip");
        if (zipFile.isEncrypted()) {
            zipFile.setPassword("password123".toCharArray());
        }
        zipFile.extractAll("./src/test/resources/extracted");

        String txtFileContent = FileUtils.readFileToString(FileUtils
                .getFile("./src/test/resources/extracted/annas_archive.txt"), "UTF-8");
        Assertions.assertEquals(TestData.expectedArchiveContent, txtFileContent);

    }
}
