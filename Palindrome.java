package week3day2assignment;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		String str = "madam";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equalsIgnoreCase(rev))
			System.out.println(str + " is palindrome");

		else
			System.out.println(str + " is not palindrome");

	}
}
