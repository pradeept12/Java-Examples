import java.io.*;
import java.util.*;

class AgentReport {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("listings.txt");
		BufferedReader br = new BufferedReader(fr);
		SortedSet<String> ss = new TreeSet<String>();
		SortedMap<Double, Double> hm = new TreeMap<Double, Double>();
		String str;
		while ((str = br.readLine()) != null) {
			int i = 0;
			StringTokenizer st = new StringTokenizer(str, " ");
			while (st.hasMoreTokens()) {
				if (i == 0)
					st.nextToken();
				else if (i == 1) {
					ss.add(st.nextToken().toUpperCase());
					System.out.println(ss);
				} else if (i == 2) {
					int status = 0;
					Double s1 = new Double(st.nextToken());
					Double s2 = new Double(st.nextToken());
					Set s = hm.entrySet();
					Iterator it = s.iterator();
					while (it.hasNext()) {

						Map.Entry m = (Map.Entry) it.next();
						Double key = (Double) m.getKey();
						Double value = (Double) m.getValue();

						if (key.compareTo(s2) == 0) {

							hm.put(s2, (s1 + value));
							status = 1;
						}
					}
					if (status == 0)
						hm.put(s2, s1);
					System.out.println("Hash Map values " + hm);
				}
				i++;
			}
		}
		System.out.println("Sorted strings : " + ss);
		fr.close();
	}
}
