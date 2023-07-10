package day03.practice;


public class TestEmployee {
	 
    public static void main(String[] args) {
//    	creating object with parameterized constructors
        Employee e1 = new Employee(1, "naresh");
        Employee e2 = new Employee(2, "suresh");
        
//        creating object with default constructor
//        initialize the values using setter
        Employee e3 = new Employee();
        e3.setId(3);
        e3.setName("Hemanath");
        
        Employee e4 = new Employee();
        e4.setId(4);
        e4.setName("Vijay");
        
//        printing the object as string using to string method
       System.out.println(e1);
       System.out.println(e2);
       System.out.println(e3);
       System.out.println(e4);
        
    }
}
