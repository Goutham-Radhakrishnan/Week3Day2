package week3day2assignment;

import java.util.ArrayList;
import java.util.Collections;

public class FindSecondLargest 
{
	public static void main(String[] args) {
		// Here is the input
		ArrayList<String> list = new ArrayList<String>();
		list.add("3");
		list.add("2");
		list.add("11");
		list.add("4");
		list.add("6");
		list.add("7");
		Collections.sort(list);
		System.out.println(list.get(5));

	}
}