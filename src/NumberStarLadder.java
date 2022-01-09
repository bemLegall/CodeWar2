
public class NumberStarLadder {
	public static String pattern(int n) {
		if (n == 1) {
			return "1";
		}
		String resp = "";
		String nova = "";
		int j = 1;
		int k = 0;
		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				k = 1;
				while (j <= i) {
					while (j - 1 >= k) {
						resp = resp + "*";
						k++;
					}
					resp = resp + i + ",";
					j++;
				}
			}
			String[] formatada = resp.split(",");
			int o = 0;
			while (o < n) {
				if (o == 0) {
					nova = formatada[o] + "\n";
					o++;
				}
				if (o == n - 1) {
					nova += formatada[0] + formatada[o];
					break;
				}
				nova = nova + formatada[0] + formatada[o] + "\n";
				o++;
			}
		}
		return nova;
	}
}
