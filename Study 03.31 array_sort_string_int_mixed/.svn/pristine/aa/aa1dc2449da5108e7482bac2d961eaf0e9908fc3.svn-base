// 1. 숫자 30개를 랜덤하게 생성해 정렬함.
// 2. 숫자 9개를 입력 받아 3x3 행렬을 만들고 4x4 행렬에 넣고 정렬한 다음 마지막 행렬에 합을 출력함.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW_ArraySrot_MatrixArray {
	public static void main(String[] args) {
		
		// 1. 0~100까지 임의의 수를 30개 발생시켜 배열에 넣은 후 정렬하세요.
		//	조건 1) 정렬 전/후의 값을 화면에 출력.
		//	조건 2) sort 알고리즘 중 사용한 알고리즘을 설명한 레포트 (형식 무관, 내용만 제출) 첨부.
		
		Random r = new Random();
		int thirtyArray[] = new int[30];
		
		for (int i = 0; i < thirtyArray.length; i++) {
			thirtyArray[i] = r.nextInt(101);	// 0~100까지니까 101이 들어가야 0~100이 생성된다.
		}
		
		System.out.println("숫자 30개는 다음과 같습니다. " + Arrays.toString(thirtyArray));
		
		Arrays.sort(thirtyArray);
		System.out.println("숫자 30개를 정렬했습니다. " + Arrays.toString(thirtyArray));
		
		System.out.println("");
		
		
		// 2. 사용자에게 9개의 숫자를 입력 받아서 3x3 이중 배열에 넣은 후 각 행의 덧셈 합을 출력하시오.
		//	조건 1) 출력시 4x4 행렬로 출력. 마지막 줄에는 덧셈 합.
		//	조건 2) 데이터는 정렬된 형식으로 출력할 것.
		
		Scanner s = new Scanner(System.in);
		
		int matrix[][] = new int[3][3];
		
		System.out.println("숫자를 9개 입력하겠습니다.\n");
		
		for (int i = 0; i < matrix.length; i++) {	// 여기다가는 matrix[i]를 쓰면 안 된다. for문 조건에는 인덱스를 쓰면 정확한 i를 모르는 상태에서 matrix[i]에 접근하기 때문에 에러가 발생한다. 그리고 어차피 행이 몇 개 있는지를 알려면 matrix.length를 써야한다. matrix[i].length를 쓰면 행이 아니라 열을 구한다.
			for (int j = 0; j < matrix[i].length; j++) {	// 여기는 matrix[i]를 쓰면 된다. 바깥 for문에 의해 정확한 i값이 정해져서 들어오고 배열 안의 i번째 배열에 값이 몇개 있는지. 즉, 행렬 구조로 생각해볼 때 열이 몇개인지를 확인할 수 있다. 
				System.out.print((i * 3 + j + 1) + "번째 숫자를 입력해주세요.   ");
				matrix[i][j] = s.nextInt();
//				System.out.print(i + "" + j);	// 디버깅용 
			}
			Arrays.sort(matrix[i]);
			System.out.println("");
		}
		
		// 디버깅
//		System.out.println(Arrays.toString(matrix[0]));
//		System.out.println(Arrays.toString(matrix[1]));
//		System.out.println(Arrays.toString(matrix[2]));
		
		int matrixSum[][] = new int[4][4];
		
		for (int i = 0; i < matrixSum.length; i++) {
			for (int j = 0; j < matrixSum[i].length; j++) {
				if (i < 3 && j < 3) {
					matrixSum[i][j] = matrix[i][j];					
				} else if (j == 3) {
					matrixSum[i][j] = Arrays.stream(matrixSum[i]).sum();
//					System.out.println(matrixSum[i][j]);	// 디버깅용 
				} else {	// if i == 3 인 경우인데 나머지 조건이 위에 앞선 조건으로 들어가 있어 그냥 else만 써도 된다. 
					matrixSum[i][j] = matrixSum[0][j] + matrixSum[1][j] + matrixSum[2][j];
//					System.out.println(matrixSum[i][j]);	// 디버깅용 
				} 
//				System.out.print(i + "" + j);	// 디버깅용 
			}
		}
		
		for (int i = 0; i < matrixSum.length; i++) {
			System.out.println(Arrays.toString(matrixSum[i]));
		}

		
	}

}
