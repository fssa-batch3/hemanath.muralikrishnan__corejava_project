package day06.solved;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ConvertArrayToList {

	public static void main(String[] args) {

		String[] deptNames = new String[3];
		deptNames[0] = "CSE";
		deptNames[1] = "EEE";
		deptNames[2] = "MECH";
		List<String> list = new ArrayList<>(Arrays.asList(deptNames));
		list.add("ECE");
		System.out.println(list);
	}
}
