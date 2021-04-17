package corp.naver;

import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author jy-yi
 * https://www.javatpoint.com/program-to-divide-a-string-in-n-equal-parts
 */
public class Task3 {
	public static void main(String[] args) {
		System.out.println(Solution("azABaabza"));
		System.out.println("-------------------------");
		System.out.println(Solution("TacoCat"));
		System.out.println("-----------------------");
		System.out.println(Solution("AcZCbaBz"));
		System.out.println("-----------------------");
		System.out.println(Solution("abcdefghizklmnop"));
	}
	
	public static int Solution(String S) {
		for (int i = 1; i <= S.length(); i++) {
			for (int j = 0; j < S.length() - i + 1; j++) {
				// �߻� Ƚ���� �߿����� �����Ƿ� Set ���
				Set<Character> lowerSet = new TreeSet<>();
				Set<Character> upperSet = new TreeSet<>();
				
				String temp = S.substring(j, j + i); // �տ������� 1��°, 2��° ... n��° ���ڿ�
				char[] tempCharArr = temp.toCharArray();
				
				for (char ch : tempCharArr) {
					if (Character.isLowerCase(ch)) {
						lowerSet.add(ch);
					} else {
						upperSet.add(ch);
					}
				}
				
				if (isBalanced(lowerSet, upperSet) && isBalanced(upperSet, lowerSet)) {
					return i;
				}
			}
		}
		
		return -1;
	}

	public static boolean isBalanced(Set<Character> first, Set<Character> second) {
		Set<Character> lower1 = new TreeSet<>();
		Set<Character> lower2 = new TreeSet<>();
		
		for (Character c : first) {
			lower1.add(Character.toLowerCase(c));
		}
		
		for (Character c : second) {
			lower2.add(Character.toLowerCase(c));
		}
		
		return lower1.containsAll(lower2);
	}
}
