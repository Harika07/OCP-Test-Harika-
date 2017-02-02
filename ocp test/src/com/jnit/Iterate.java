package com.jnit;
import java.util.*;

public class Iterate {

	public static void main(String[] args) {
		List<String> iterateList = new ArrayList<String> ();
		iterateList.add("TCS");
		iterateList.add("IBM");
		iterateList.add("WIPRO");
		System.out.println("Iterate for loop");
for (int i =0; i<iterateList.size();i++){
	System.out.println(iterateList.get(i));
}
	}

}
