package day03.practice;

public class Employee {
	 
    private int id;
    private String name;
    
//    default constructor
    public Employee() {
    	
    	
    }
 
//    parameterized constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
//	method which will convert the object has string and return it
	public String toString() {
		
		return "id = "+id+" , name = "+name;
	}
    
    
}
