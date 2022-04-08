package week3day2assignment;

public class CharOccurence {

	public static void main(String[] args) {
		
		// Check number of occurrences of a char (eg 'e') in a String

				String str = "welcome to chennai";

				// declare and initialize a variable count to store the number of occurrences
				int count = 0;
				char a;
				
				// get the length of the array
				int len = str.length();
				
				// traverse from 0 till the array length
				for (int i = 1; i < len; i++) {
					
				// Check the char array has the particular char in it
                a = str.charAt(i);
			    if (a == 'e')
			    	
			    // if is has increment the count
                count++;
				}
				
				// print the count out of the loop
				System.out.println("Occurence of the character is "+count);
			}
		}
