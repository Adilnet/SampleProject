package testprogram;

import java.util.ArrayList;

import model.Employee;

public class ArrayListExm {

	public static void main(String[] args) {
		
		int a [] = new int[5];
		a[0] =10;
		
		ArrayList<Integer> list =  new ArrayList<>();
		//list.add(10);
		//list.add(10);
		//list.add("Stribng");
		for(int i =0; i<10; i++) {
			list.add(i);
		}
		list.add(10,5);
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		/// 585   345 121
		
		
		
		

	}

}
