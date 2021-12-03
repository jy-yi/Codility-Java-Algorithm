package street11;

public class Test1 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		System.out.println(t1.solution(1000));
	}

	public int solution(int N) {
		int sumOfDigit = getSumOfDigit(N);

		while (true) {
			int M = ++N;
			if (getSumOfDigit(M) == sumOfDigit) {
				return M;
			}
		}
	}

	/**
	 * �� �ڸ����� �� ��ȯ
	 * @param n		�ڸ����� ���� ���� �ڿ���
	 * @return		�� �ڸ����� ��
	 */
	public int getSumOfDigit(int n) {
		int answer = 0;

		while (n > 0) {
			answer += n % 10;
			n /= 10;
		}

		return answer;
	}
}
