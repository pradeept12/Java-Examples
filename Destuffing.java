import java.lang.*;
import java.io.*;

class Destuffing {
	void destuff_method(StringBuffer res) {
		/* Bit Destuffing starts here */

		int count = 0;
		StringBuffer output = new StringBuffer();
		int lent = res.length();
		int first = res.indexOf("01111110");
		int last = res.lastIndexOf("01111110");
		if (first == 0 && last == lent - 8) {
			for (int i = 8; i < (lent - 8); i++) {
				if (res.charAt(i) == '1') {
					count++;
					output.append("1");
					if (count == 5) {
						i++;
						count = 0;
					}
				} else {
					count = 0;
					output.append("0");
				}
			}
			System.out.println("Entered string after destuffing is....:" + output);
		} else
			System.out.println("Error occured in data...");
	}
}