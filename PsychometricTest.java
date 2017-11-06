
public class PsychometricTest {

	static int[] count = { 0 };

	public static void main(String[] args) {

		int[] scores = new int[] { 2, 3, 4, 5, 6, 8, 9 };
		int[] lowerLimits = new int[] { 3 };
		int[] upperLimits = new int[] { 9 };

		for (int i = 0; i < scores.length; i++) {
			if (lowerLimits[0] <= scores[i] && upperLimits[0] >= scores[i]) {
				count[0]++;
			}
		}
		System.out.println("count::::" + count[0]);
	}

}
