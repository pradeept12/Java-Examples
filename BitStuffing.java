class BitStuffing {
	StringBuffer stuff_method(String input) {
		/* Bit Stuffing starts here */

		StringBuffer res = new StringBuffer("01111110");
		System.out.println("Entered string is....:" + input);
		int len = input.length();
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (input.charAt(i) == '1') {
				res.append("1");
				count++;
				if (count == 5) {
					res.append("0");
					count = 0;
				}
			} else {
				count = 0;
				res.append("0");
			}

		}
		count = 0;
		res.append("01111110");
		System.out.println("Entered string after stuffing is....:" + res);
		return (res);
	}
}
