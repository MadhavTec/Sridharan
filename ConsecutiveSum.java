public class ConsecutiveSum {

	static int consecutive(long num) {
		System.out.println("Num " + num);
		int count = 0;

		for (int n = 1; n * (n + 1) < 2 * num; n++) {
			float i = (float) ((1.0 * num - (n * (n + 1)) / 2) / (n + 1));

			if (i - Math.round(i) == 0.0)
				count++;

		}
		System.out.println("count:::" + count);
		return count;
	}

	public static void main(String[] args) {
		consecutive(10);
	}

}
