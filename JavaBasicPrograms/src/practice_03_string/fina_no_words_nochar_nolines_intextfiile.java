package practice_03_string;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fina_no_words_nochar_nolines_intextfiile {

	public static void main(String[] args) {
		
		// Write a java program to find number of characters, number of words and number of lines in a text file
		 String filePath = "example.txt";  // Replace with your file path

	        int wordCount = 0;
	        int charCount = 0;
	        int textCount = 0;
	        int lineCount = 0;

	        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	            String line;

	            while ((line = reader.readLine()) != null) {
	                lineCount++;  // Increment line count
	                charCount += line.length();  // Count characters including spaces
	                String[] words = line.split("\\s+");  // Split by whitespace
	                wordCount += words.length;  // Count words
	                
	                // Count non-space characters (text)
	                for (char c : line.toCharArray()) {
	                    if (c != ' ') {
	                        textCount++;
	                    }
	                }
	            }
	        } catch (IOException e) {
	            System.out.println("An error occurred while reading the file: " + e.getMessage());
	        }

	        System.out.println("Number of lines: " + lineCount);
	        System.out.println("Number of words: " + wordCount);
	        System.out.println("Number of characters (including spaces): " + charCount);
	        System.out.println("Number of text characters (excluding spaces): " + textCount);
	    }
	}