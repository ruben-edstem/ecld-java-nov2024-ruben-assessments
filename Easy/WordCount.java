//Get Word Count

public class Program {
	public static int countWords(String s) {
		 int count = 1;
		 for (int i = 0; i < s.length(); i++) {
     		if (s.charAt(i) == ' ') {
           count++;
        } 
     }
		 return count;
	}
}
