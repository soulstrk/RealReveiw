package review;

public class Baekjoon4673 {

	public static void main(String[] args) {
		int[] checkArr = new int[10001];
		for (int i = 1; i < checkArr.length; i++) {
			checkArr[selfNumCheck(i)]++;
		}

		for (int i = 0; i < checkArr.length; i++) {
			if (checkArr[i] == 0) {
				System.out.println(i);
			}
		}
	}

	static int selfNumCheck(int i) {
		int result = i;
		do {
			result += i % 10;
		} while ((i /= 10) != 0);
		if (result > 10000)
			return 0;
		return result;
	}
}
