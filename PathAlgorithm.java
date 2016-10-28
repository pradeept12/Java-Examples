import java.util.*;
import java.io.*;

class PathAlgorithm {
	char name;
	int label;
	char probe;

	PathAlgorithm(int n, int l, char p) {
		name = (char) n;
		label = l;
		probe = p;
	}

	public String toString() {
		return name + "(" + label + "," + probe + ")";
	}

	/*
	 * int getLabel(){ return label; }
	 */
	public static void main(String[] args) throws IOException {
		int no;
		System.out.println("Enter no of nodes");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		no = Integer.parseInt(br.readLine());
		int[][] arr = new int[no][no];
		PathAlgorithm[] nodes = new PathAlgorithm[no];
		for (int i = 0; i < no; i++)
			nodes[i] = new PathAlgorithm(i + 65, 0, '-');
		for (int i = 0; i < no; i++)
			for (int j = 0; j < no; j++)
				arr[i][j] = 0;
		// int n;
		String arr2;
		for (int i = 0; i < no; i++) {
			// System.out.println("enter no of links for "+nodes[i].name);
			// n=Integer.parseInt(br.readLine());
			System.out.println("enter nodes to be linked for " + nodes[i].name);
			arr2 = br.readLine();

			Scanner s;
			for (int j = 0; j < no; j++) {
				s = new Scanner(arr2);
				while (s.hasNext()) {
					String s1 = s.next();
					if (s1.equals(Character.toString(nodes[j].name))) {
						System.out.println("enter weight for " + nodes[i].name + "," + nodes[j].name);
						arr[i][j] = Integer.parseInt(br.readLine());
					}
				}
			}
		}
		for (int i = 0; i < no; i++)
			for (int j = 0; j < no; j++)
				if (arr[i][j] != 0)
					arr[j][i] = arr[i][j];
		PathAlgorithm one;
		Cmpalgo cmp = new Cmpalgo();
		PriorityQueue<PathAlgorithm> pq = new PriorityQueue<PathAlgorithm>(10, cmp);
		ArrayList<PathAlgorithm> res = new ArrayList<PathAlgorithm>();
		res.add(nodes[0]);
		for (int i = 0; i != 3;) {
			for (int j = 0; j < no; j++) {
				if (arr[i][j] != 0 && !res.contains(nodes[j])
						&& (nodes[j].label > nodes[i].label + arr[i][j] || nodes[j].label == 0)) {
					nodes[j].label = nodes[i].label + arr[i][j];
					nodes[j].probe = nodes[i].name;
					pq.remove(nodes[j]);
					pq.add(nodes[j]);
				}
			}
			one = pq.poll();
			i = one.name - 65;
			res.add(one);
			// System.out.println(res);
		}
		System.out.println(res);
		int i = 3;
		while (i != 0) {
			System.out.println(nodes[i]);
			i = (int) nodes[i].probe - 65;
		}
	}
}

class Cmpalgo implements Comparator<PathAlgorithm> {
	public int compare(PathAlgorithm one, PathAlgorithm two) {
		if (one.label > two.label)
			return 1;
		else if (one.label < two.label)
			return -1;
		else
			return 0;
	}
}