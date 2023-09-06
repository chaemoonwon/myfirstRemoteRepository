package test;

import java.util.ArrayList;

public class Test1 {

	//main method
	public static void main(String[] args) {
		System.out.println("hi");
		
		
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		
		int tot = 0;
		
		arrayList.add(30);
		
		arrayList.add(40);
		
		
		
		for(int value:arrayList) {
			tot += value;
		}
		
		System.out.println(tot);
	}

}
