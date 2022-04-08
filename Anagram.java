package week3day2assignment;

import java.util.Arrays;

public class Anagram 
{
public static void main(String[] args) {
	
	String text1 = "stops";
	String text2 = "potss";
	boolean result = true;
	if (text1.length() == text2.length()) {
		char[] char1 = text1.toCharArray();
		char[] char2 = text2.toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);
		result = Arrays.equals(char1, char2);

	} else
		result = false;
	if (result)
		System.out.println("Both strings are anagram");
	else
		System.out.println("Both strings are not anagram");
}
}
