package corp.naver;

/**
 * 
 * @author jy-yi
 * https://zxi.mytechroad.com/blog/math/leetcode-1573-number-of-ways-to-split-a-string/
 */
public class Task2 {
	public static void main(String[] args) {
		System.out.println(solution("babaa"));
		System.out.println(solution("ababa"));
		System.out.println(solution("aba"));
		System.out.println(solution("bbbbb"));
	}

	public static int solution(String S) {

		int n = S.length();
		int aCount = 0;
		final int MAX_RANGE = 40000;

		for (int i = 0; i < n; i++) {
			char c = S.charAt(i);
			if (c == 'a') {
				aCount++;
			}
		}

		if (aCount % 3 != 0) {
			return 0;
		} else if (aCount == 0) {
			return ((1 + (n - 2)) * (n - 2) / 2) % (MAX_RANGE + 1);
		}
		
		aCount /= 3;
		
		int l = 0, r = 0;
		for (int i = 0, c = 0; i < n; ++i) {
			if (S.charAt(i) == 'a') {
				c++;
			}
			
			if (c == aCount) l++;
			else if (c == aCount * 2) r++;
		}

		return (l * r) % (MAX_RANGE + 1);
	}
}
