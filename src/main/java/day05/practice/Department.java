package day05.practice;

public class Department {
	private String deptName;
	private int deptId;

//	default constructor
	public Department() {

	}

//	parameterized constructor
	public Department(String deptName, int deptId) {

		this.deptName = deptName;
		this.deptId = deptId;
	}

//	get and set for department name
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

//	get and set for department id
	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	public String toString() {
		
		return  "Department Name = " + deptName + " , Department Id = "+ deptId;
	}

}
