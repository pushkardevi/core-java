package JavaTpoint;

import java.util.Stack;

public class LongestPalidromicString {

	public static void main(String[] args) {

		String str = "aaaddffvvvbbggggccceeeeeeeeekkkkkkkk";
		String hold = "", pal = "";
		int len = 0;
		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j < str.length(); j++) {
				hold = str.substring(i, j);
				if (new StringBuilder(hold).reverse().toString().equals(hold) && hold.length() > len) {
					pal = hold;
					len = pal.length();
				}
			}
		}
		System.out.println(pal);
		
	}

}
