package day05.practice;

public class TestSudentDept {

	public static void main(String[] args) {

		Department stu1Dept = new Department();
		stu1Dept.setDeptName("DCSE");
		stu1Dept.setDeptId(10);

		Student stu1 = new Student();
		stu1.setName("HemanathM");
		stu1.setId(100);
		stu1.setDepartment(stu1Dept);
		
		stu1.printStuDetails();

	}
}
