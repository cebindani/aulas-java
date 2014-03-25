package calendar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("(a*)b");
		Matcher m = p.matcher("aaaaaab");
		
		if (m.matches()) {
			System.out.println("Match!!");
			System.out.println("Substituição: "+ ("aaaab".replaceFirst("(a*b)?", "c")));
		}

	}

}
