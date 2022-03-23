package mymain;

import myutil.ElementarySchoolStudent;
import myutil.HighSchoolStudent;
import myutil.MiddleSchoolStudent;
import myutil.Student;

public class MyMainStudent {

	static void momSaid(Student[] studentArray) {

		for (int i = 0; i < studentArray.length; i++) {
			Student student = studentArray[i];

			// ������(polymorphism): ����� ������ ���޹��� ��ü���� �ٸ� �ൿ�� �ϰ� �ϴ°�
			student.study();
		}

	}

	public static void main(String[] args) {
		Student[] studentArray = { new ElementarySchoolStudent(), new MiddleSchoolStudent(), new HighSchoolStudent() };

		momSaid(studentArray);

	}

}
