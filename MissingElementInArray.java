package week3day2assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInArray 
{
	public static void main(String[] args) 
	{
	List<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(7);
	list.add(6);
	list.add(8);
	Collections.sort(list);

	for (int i = 1; i <= list.size(); i++) {
		if (list.get(i - 1) == i) {
			continue;
		} else {
			System.out.println(i + " is the missing element");
			break;
		}
	}

}
}
