package com.solve;

import java.util.Arrays;

import com.solve.structures.arrays.CanWinGame;
import com.solve.structures.arrays.SparseArrays;

public class SolutionApp {

	public static void main(String[] args) {
		System.out.println("Init Solutions App for Data Structures and Algorithms");
		
		try {
			Solution<int[]> solution = new SparseArrays("src/resources/SparseArrays.txt");
			int[] result = solution.solve();
			System.out.println("Result: " + Arrays.toString(result));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			CanWinGame canWin = new CanWinGame("src/resources/CanWinGame.txt");
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
