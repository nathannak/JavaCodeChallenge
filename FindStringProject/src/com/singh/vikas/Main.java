package com.singh.vikas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

public static void main(String[] args) {

//	//read file in to string using bufferedreader and filereader
//	BufferedReader br = null;
//	FileReader fr = null;
//	String parsedString="";
//
//	try 
//	{
//
//		fr = new FileReader("test.txt");
//		br = new BufferedReader(fr);
//
//		String sCurrentLine;
//
//		while ((sCurrentLine = br.readLine()) != null) {
//			parsedString += sCurrentLine;
//		}
//
//	} catch (IOException e) {
//
//		e.printStackTrace();
//
//	} finally {
//
//		try {
//
//			if (br != null)
//				br.close();
//
//			if (fr != null)
//				fr.close();
//
//		} catch (IOException ex) {
//
//			ex.printStackTrace();
//
//		}
//
//	}
//	//
	
	//read text using String class constructor and File class utility function
	String parsedString="";
	
    try {
		parsedString = new String(Files.readAllBytes(Paths.get("test.txt")));
	} catch (IOException e) {
		e.printStackTrace();
		System.out.println("couldn't read test.txt file from drive");
	}

	// print read string for debugging
	System.out.println("\nparsed string from file is: " + parsedString);


//	//1.grab string which in between [ and ] using regex
//    Pattern pattern = Pattern.compile("(\\[)(.*?)(\\])");
//    Matcher matcher = pattern.matcher(parsedString);
//    List<String> listMatches = new ArrayList<>();
//
//    while(matcher.find())
//    {
//        listMatches.add(matcher.group(2));
//    }
//
//    //print what's found after regex
//    for(String s : listMatches)
//    {
//        System.out.println("after regex, item in between [] is: " + s);
//    }
//    //
    
	
    //2.find items in between spaces w/o regex
	while( parsedString.contains("v") && parsedString.contains("s") && (parsedString.indexOf("v") < parsedString.indexOf("s")) ) {

    String noRegexStringResult = parsedString.substring(parsedString.indexOf("v"),parsedString.indexOf("s")+1);
    if(parsedString.indexOf("s") - parsedString.indexOf("v") == 4)
    {
    	System.out.println("item in between v and s is (no regex):	" + noRegexStringResult );
    }
    
    parsedString = parsedString.replace(noRegexStringResult, "");

	}

	
	}
}
