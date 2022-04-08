package week3day2assignment;

import java.util.ArrayList;

public class FindIntersection {
	/*
	 * Pseudo Code
	 * 
	 * a) Declare An array for {3,2,11,4,6,7}; b) Declare another array for
	 * {1,2,8,4,9,7}; c) Declare for loop iterator from 0 to array length d) Declare
	 * a nested for another array from 0 to array length e) Compare Both the arrays
	 * using a condition statement
	 * 
	 * f) Print the first array (should match item in both arrays)
	 */
	public static void main(String[] args) {
		String intersection="";
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("3");
		list1.add("2");
		list1.add("11");
		list1.add("4");
		list1.add("6");
		list1.add("7");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("1");
		list2.add("2");
		list2.add("8");
		list2.add("4");
		list2.add("9");
		list2.add("7");
		
for(int i=0;i<list1.size();i++) 
{
	if(list1.get(i)==list2.get(i)) 
	{
		intersection+=list1.get(i)+" ";
	}
}

System.out.println(intersection.trim());
		}
}
