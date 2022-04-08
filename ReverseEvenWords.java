package week3day2assignment;

public class ReverseEvenWords 
{
public static void main(String[] args) 
{
		String test = "I am a software tester";
		String rev = "";
		String word[] = test.split("\\s");
		for (int i = 0; i < word.length; i++) {
			String words = word[i];
			String revword = "";
			for (int j = words.length() - 1; j >= 0; j--) {
				revword += words.charAt(j);
			}
			rev = rev + revword + " ";
		}
		System.out.println(rev);
	}	
}
