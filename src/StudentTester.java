import java.util.Arrays;
import java.util.List;

public class StudentTester {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
										new Student("Aron",92,88),
										new Student("Blake",78,85),
										new Student("Jaqueline",93,88),
										new Student("Denise",92,95),
										new Student("Nannan",92,88));
		System.out.printf("%-25s %-15s \n", " ", "Quiz Results");
		System.out.println("******************************************************************");
		System.out.printf("%-15s %-15s %-15s %-15s %-15s \n", "Student Name", "Quiz1 Grade", "Quiz2 Grade", "Difference", "Average");
		System.out.println("******************************************************************");
		for(Student pupil: studentList) {
			System.out.println(pupil);
		}
	}
}
