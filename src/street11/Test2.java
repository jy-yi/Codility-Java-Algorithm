package street11;

public class Test2 {
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		
		int[] A = {1, 1, 1, 2, 3, 4, 5, 6, 1};
		int K = 6;
		
		System.out.println(t2.solution(A, K));
	}

	public boolean solution(int[] A, int K) {
		int n = A.length;
		for (int i = 0; i < n - 1; i++) {
			if (A[i] + 1 < A[i + 1])
				return false;
		}
		if (A[0] != 1 || A[n - 1] != K)
			return false;
		else
			return true;
	}
}
