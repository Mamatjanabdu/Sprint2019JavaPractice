
import java.nio.file.*;
import java.util.*;

public class TextFileToList {

	public static void main(String[] args) {

		List<String> lineLst = getTextFileAsList("hero3.text");
		System.out.println(lineLst);
		
		System.out.println(lineLst.size() );
		
//		
//		String s="erat_quisque_erat.xls ";
//		String fileType=s.substring(s.indexOf(".")+1 );
//		System.out.println(fileType);
//		
//		
//	String ftSum="";
//	String fT=each.substring(each.indexOf(".")+1 );
//				for (int i=0; i<lineLst.size(); i++) {
//					
//					ftSum+=fT;
//				}System.out.println(ftSum);
		
		int counter=0;
		String longest=lineLst.get(0);
		for (String each : lineLst) {
			if (each.endsWith(".xls")&& each.length()>longest.length()) {
				longest=each;
			}
			
		}System.out.println(longest);
	
	
	}
//		
//		//find out file "ppt" file
//		for (String each : lineLst) {
//			String fileType=each.substring(each.indexOf(".")+1 );
//			if (fileType.equals("doc")) {
//				counter++;
//			}
//			
//		}System.out.println(counter);
//		
//		for (String each : lineLst) {
//			String fileType=each.substring(each.indexOf(".")+1 );
//			if (fileType.equals("ppt")) {
//				counter++;
//			}
//			
//		}System.out.println(counter);
//		
//	}
//		
	
	/*
	 * DO NOT MODIFY AND JUST USE IT
	 * Method name : getTextFileAsList
	 * @parameter  location of text file as String
	 * 	if your file is at root path (right under project folder)
	 *  you may directly path your filename.txt
	 *  if not pass /your/own/folder/name/filename.txt as String to method
	 * 
	 * @return List of String that contain each line as per element

	 */
	public static List<String> getTextFileAsList(String filePath) {

		List<String> allLines = null;
		try {
			allLines = Files.readAllLines(Paths.get(filePath));
		} catch (Exception e) {
			System.out.println("Wrong file path probably");
		}
		return allLines;
	}}