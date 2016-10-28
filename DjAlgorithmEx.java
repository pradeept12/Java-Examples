import java.util.Scanner;

class tem {
	tem ta[] = new tem[122];
	tem tb[] = new tem[133];

	void mtc() {
		for (int h = 0; h <= 4; h++) {
			ta[h] = new tem();
		}
		for (int i = 0; i <= 24; i++) {
			tb[i] = new tem();
		}
	}

	int i, j, l, m, n, f, q, w;
	int a[][] = new int[22][22];
	int b[][] = new int[122][122];
	int c[][] = new int[122][122];
	int s[][] = new int[122][122];
	Scanner sc = new Scanner(System.in);

	public void grp() {
		System.out.print("Enter Elements");
		for (i = 0; i <= 4; i++) {
			for (j = 0; j <= 4; j++) {
				System.out.println(i + "->" + j + "     " + "\n");
				a[i][j] = sc.nextInt();
			}
		}
		int h = 1;
		for (i = 0; i <= 4; i++) {
			for (j = 0; j <= 4; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
	}

	void cal() {
		for (int k = 0; k <= 4; k++) {
			for (j = 0; j <= 4; j++) {
				ta[k].b[k][j] = a[k][j];
			}
		}
	}

	void fnl() {
		i = 0;
		l = 0;
		m = 0;
		n = 0;
		f = 0;
		for (i = 0; i <= 4; i++) {
			f = 0;
			for (j = 0; j <= 4; j++) {
				if (a[i][j] != 0) {
					for (int r = 0; r <= 4; r++) {
						tb[i].c[f][r] = ta[j].b[j][r] + a[i][j];
					}
					f++;
				} else {
					for (int r = 0; r <= 4; r++) {
						tb[i].c[f][r] = 0;
					}
					f = f + 1;
				}
			}
			System.out.println();
		}
		for (i = 0; i <= 4; i++) {
			for (j = 0; j <= 4; j++) {
				for (f = 0; f <= 4; f++)
					System.out.print(tb[i].c[j][f]);
				System.out.println();
			}
			System.out.println();
		}
		for (i = 0; i <= 4; i++) {
			int d = 0;
			for (j = 0; j <= 4; j++) {
				if (a[i][j] != 0) {
					System.out.println(i + " -> " + j);
					for (int y = 0; y <= 4; y++) {
						if (tb[i].c[j][y] <= ta[i].b[i][y] && tb[i].c[j][y] != 0 && ta[i].b[i][y] != 0) {
							System.out.println(tb[i].c[j][y]);
							// s[w][q]=tb[i].c[j][y];q=q+1;
						} else {
							System.out.println(ta[i].b[i][y]);
							// s[w][q]=ta[i].b[i][y];q=q+1;
						}
					}
				}
			}
		}
		/*
		 * for(i=0;i<=15;i++) { System.out.print(s[0][i]+"   ");
		 * 
		 * }
		 */
	}
}

class DjAlgorithmEx {
	public static void main(String args[]) {
		tem t = new tem();
		t.mtc();
		t.grp();
		t.cal();
		t.fnl();
	}
}