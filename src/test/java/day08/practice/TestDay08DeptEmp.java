package day08.practice;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class TestDay08DeptEmp {

//	testing with valid inputs 
	@Test 
	public void testWithValidInputs() {
		
		HashMap<String, ArrayList<String>> deptMap = new HashMap<>();
		ArrayList<String> hrEmp = new ArrayList<>(Arrays.asList("Hemanath", "Joel"));
		ArrayList<String> ceoEmp = new ArrayList<>(Arrays.asList("Hemanath", "Joel"));
		deptMap.put("HR", hrEmp);
		deptMap.put("CEO",ceoEmp);
	}
}
