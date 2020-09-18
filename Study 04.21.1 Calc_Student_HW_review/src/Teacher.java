import java.util.Arrays;
import java.util.Comparator;

public class Teacher extends People {
	String className;
	Student[] student;
	
	Teacher(String name, int age, String className, Student[] student) {
		super(name, age);
		this.className = className;
		this.setStudent(student);
	}
	
	public void setStudent(Student[] student) {
		this.student = student;
	}
	
//	public void sortStudent() {
//		for (int i = 0; i < student.length; i++) {
//			for (int j = i + 1; j < student.length; j++) {
//				if (student[i].totalScore < student[j].totalScore) {
//					Student temp = student[i];
//					student[i] = student[j];
//					student[j] = temp;
//				}
//			}
//		}
//	}
	
	// 단일 배열이 아닌 매트릭스 배열에서 sort 사용하기.
	public void sortStudent() {
		Arrays.sort(this.student, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.totalScore - o1.totalScore;	// 오름차순 정렬.
			}
		});	
	}
	
	
	public void printStudent() {
		this.sortStudent();
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i] + " 총점 : " + student[i].totalScore);
		}
	}
}
