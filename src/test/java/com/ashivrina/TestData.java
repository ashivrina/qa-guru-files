package com.ashivrina;

import java.util.List;

public class TestData {
    public static List<String> expectedStates = List.of("Russia", "Germany", "United Kingdom", "France", "Italy", "Spain", "Ukraine",
            "Poland", "Romania", "Netherlands", "Belgium", "Czech Republic (Czechia)", "Greece", "Portugal", "Sweden",
            "Hungary", "Belarus", "Austria", "Serbia", "Switzerland", "Bulgaria", "Denmark", "Finland", "Slovakia",
            "Norway", "Ireland", "Croatia", "Moldova", "Bosnia and Herzegovina",
            "Albania", "Lithuania", "North Macedonia", "Slovenia", "Latvia", "Estonia", "Montenegro", "Luxembourg",
            "Malta", "Iceland", "Andorra", "Monaco", "Liechtenstein", "San Marino", "Holy See");

    public static List<String> students = List.of("Dulce\tAbril", "Mara\tHashimoto", "Philip\tGent", "Kathleen\tHanner",
            "Nereida\tMagwood", "Gaston\tBrumm", "Etta\tHurn", "Earlean\tMelgar", "Vincenza\tWeiland");

    public static String expectedPdfText = " A Simple PDF File \n" +
            " This is a small demonstration .pdf file - \n" +
            " just for use in the Virtual Mechanics tutorials. More text. And more \n" +
            " text. And more text. And more text. And more text. \n" +
            " And more text. And more text. And more text. And more text. And more \n" +
            " text. And more text. Boring, zzzzz. And more text. And more text. And \n" +
            " more text. And more text. And more text. And more text. And more text. \n" +
            " And more text. And more text. \n" +
            " And more text. And more text. And more text. And more text. And more \n" +
            " text. And more text. And more text. Even more. Continued on page 2 ...\n" +
            " Simple PDF File 2 \n" +
            " ...continued from page 1. Yet more text. And more text. And more text. \n" +
            " And more text. And more text. And more text. And more text. And more \n" +
            " text. Oh, how boring typing this stuff. But not as boring as watching \n" +
            " paint dry. And more text. And more text. And more text. And more text. \n" +
            " Boring.  More, a little more text. The end, and just as well. \n";

    public static String expectedArchiveContent = "Hello everyone!\n" +
            "This is the content of a password-protected archive.";
}
