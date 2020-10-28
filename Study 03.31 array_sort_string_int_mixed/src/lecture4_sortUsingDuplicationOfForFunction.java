// 오름차순, 내림차순을 함수 없이 이중 for문으 구현함.

import java.util.Arrays;

public class lecture4_sortUsingDuplicationOfForFunction {
	public static void main(String[] args) {
	
		int[] arrs = new int[30];	// 비어있는 길이 30의 배열 생성.

		for (int i = 0; i < arrs.length; i++) {

			arrs[i] = (int) (Math.random() * 100) + 1; // Math.random()이 0.0 <= x < 1.0 사이의 랜덤 값을 생성한다.
		}
		System.out.println("[30개의 랜덤숫자 리스트]");
		System.out.println(Arrays.toString(arrs) + "\n");

		
		// 이중 for문을 사용한 오름차순 정렬하기.
		for (int i = 0; i < arrs.length; i++) { // i를 앞에 있는 수, j를 뒤에 있는 수로 선언하고 비교하기.
			for (int j = i; j < arrs.length; j++) {
				if (arrs[i] > arrs[j]) {	// 앞에 있는 수 > 뒤에 있는 수 라면 실행.
					int temp = arrs[i];		// 앞에 있는 큰 값을 임시로 저장.
					arrs[i] = arrs[j];		// 뒤에 있는 작은 값을 앞으로 이동.
					arrs[j] = temp;			// 앞에 있던 값을 뒤에다 넣음.
				} else {
					continue;
				}
			}
		}
		System.out.println("[오름차순 정렬]");
		System.out.println(Arrays.toString(arrs) + "\n");
		
		
		// 이중 for문을 사용한 내림차순 정렬하기.
		for (int i = 0; i < arrs.length; i++) { // i를 앞에 있는 수, j를 뒤에 있는 수로 선언하고 비교하기.
			for (int j = i; j < arrs.length; j++) {
				if (arrs[i] < arrs[j]) {	// 앞에 있는 수 < 뒤에 있는 수 라면 실행.
					int temp = arrs[i];		// 앞에 있는 작은 값을 임시로 저장.
					arrs[i] = arrs[j];		// 뒤에 있는 큰 값을 앞으로 이동.
					arrs[j] = temp;			// 앞에 있던 값을 뒤에다 넣음.
				} else {
					continue;
				}
			}
		}
		System.out.println("[내림차순 정렬]");
		System.out.println(Arrays.toString(arrs));
	}

}
