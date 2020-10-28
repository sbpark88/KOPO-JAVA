// Arrays 클래스를 이용한 정렬을 학습함. 내림차순 정렬하는 방법을 확인함.

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class lecture3_sort {
	public static void main(String[] args) {
		
		Integer arr1[] = {4,6,2,3,4,2,2,5,6,7,24,3,52,51,4,4};
		Integer arr2[] = {4,6,2,3,4,2,2,5,6,7,24,3,52,51,4,4};

		// 오름차순 정렬하기. (숫자, 영문자, 한글 모두 가능하다.)
		Arrays.sort(arr1);	
		// 배열을 메모리 레퍼런스가 아닌 값으로 출력하기 위해 Arrays.toString() 사용. 
		System.out.println(Arrays.toString(arr1));	
		
		// 내림차순 정렬하기. 내림차순은 int로는 안 된다. Integer arr[] = {4,6,2,3,4,2,2,5,6,7,24,3,52,51,4,4}; 로 해야한다.
		Arrays.sort(arr1, Comparator.reverseOrder());	
		System.out.println(Arrays.toString(arr1));
		
		// Collections 메소드로도 가능하다.
		Arrays.sort(arr2, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr2));
				
	}

}
