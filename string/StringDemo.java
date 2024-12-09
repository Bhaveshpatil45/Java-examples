package com.bhavesh.practice.string;

import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

public class StringDemo {
    public static void main(String[] args) {

        // isBlank() demo
        String sentence = "This is my string."; // sentence contains black space
        var wordSet = " world word2 word3 "; // set of words contains blank spaces
        var blacks = "     "; // only blacks spaces

        System.out.println("IsBlank (sentence) : " + sentence.isBlank());
        System.out.println("IsBlank (wordSet) : " +wordSet.isBlank());
        System.out.println("IsBlank (blanks) : " + blacks.isBlank());
        System.out.println("--------------------------------------");

        // lines() demo
        sentence = "this\nis\nmy\nString"; // sentence contains blank spaces

        System.out.println("sentence : " + sentence);

        Stream<String> lines = sentence.lines();

        lines.forEach(System.out::println);

        System.out.println("--------------------------------------");

        // repeat() demo
        var blah = "blah" ; // blah
        System.out.println("blah.repeat(3) : " + blah.repeat(3));
        System.out.println("blah.repeat(0) : " + blah.repeat(0));
        System.out.println("--------------------------------------");

        // trim demo
        var spaceContainedString = " first-word second-word ";
        System.out.println("blah.trim() : " + blah.trim());
        System.out.println("blah.spaceContainedString.trim() : " + spaceContainedString.trim());
        System.out.println("--------------------------------------");

        //strip() demo
        System.out.println("blah.strip() : " + blah.strip());
        System.out.println("blah.contains(\" \") : " + blah.contains(" "));
        System.out.println("blah.strip().contains(\" \") : " + blah.strip().contains(" "));
        System.out.println("--------------------------------------");

        // stripLeading() and stripTrailing()
        var nextWhitespaceString = "\n\t\u2005hey buddy\u2005";
        System.out.println("Actual String with white spaces : " + nextWhitespaceString);
        System.out.println("String after striping leading whitespaces : " + nextWhitespaceString.stripLeading());
        System.out.println("String after striping trailing whitespaces : " + nextWhitespaceString.stripTrailing());
        System.out.println("--------------------------------------");

        String blah1 = new String("blah ");
        System.out.println("blah.equals(blah1): " + blah.equals(blah1));
        System.out.println("blah == blah1: " + (blah == blah1));
        System.out.println("--------------------------------------");

        System.out.println("blah,length(): " + blah.length());
        System.out.println("--------------------------------------");

        System.out.println("blah.toUpperCase() : " + blah.toUpperCase());
        System.out.println("--------------------------------------");

        System.out.println("blah.toLowerCase(): " + blah.toUpperCase().toLowerCase());
        System.out.println("--------------------------------------");

        byte[] blahBytes = blah.getBytes();
        for (byte blahbyte : blahBytes){
            System.out.println("blahbyte: " + blahbyte);
        }
        System.out.println("--------------------------------------");

        System.out.println("blah.concat(\" *double blah*\") : " + blah.concat("*double blah*"));
        System.out.println("blah after concat : " + blah);
        System.out.println("--------------------------------------");

        System.out.println("blah.replace(\" \", \"##\") : " + blah.replace(" ", "##"));
        System.out.println("--------------------------------------");

        System.out.println("blah.substring(2, 4): " + blah.substring(2, 4));
        System.out.println("blah.substring(2): " + blah.substring(2));
        System.out.println("--------------------------------------");

    }

}

