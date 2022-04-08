package week3day2assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesInArray 
{
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(14);
		list.add(12);
		list.add(13);
		list.add(11);
		list.add(15);
		list.add(14);
		list.add(18);
		list.add(16);
		list.add(17);
		list.add(19);
		list.add(18);
		list.add(17);
		list.add(20);
		Collections.sort(list);
		Set<Integer> s = new HashSet<Integer>();
		for (Integer dup : list) {
			if (s.add(dup) == false) {
				System.out.println(dup + " is duplicated");
			}
		}
	}
}
