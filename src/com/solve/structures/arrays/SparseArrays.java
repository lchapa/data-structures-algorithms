package com.solve.structures.arrays;


import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

import com.solve.Solution;

public class SparseArrays implements Solution<int[]> {
	
	private String input;
	private int n_Strings;
	private String[] strings;
	private int q_Queries;
	private String[] queries;
	
	public SparseArrays(String input) {
		if(input == null || input.isEmpty()) {
			throw new IllegalArgumentException("Valid testcase file must be provided.");
		}
		this.input = input;
	}
	
	
	@Override
	public int[] solve() throws Exception {
		this.readInput();
		int[] result = new int[this.q_Queries];
		
		for(int i = 0; i < q_Queries; i++) {
			for(int j = 0; j < n_Strings; j++) {
				if(queries[i].compareTo(strings[j]) == 0) {
					result[i]++;
				}
			}
		}
		return result;
	}

	private void readInput() throws Exception {
		try(Scanner s = new Scanner(Path.of(this.input))) {
			n_Strings = s.nextInt();
			s.nextLine();
			strings = new String[n_Strings];
			int i = 0;
			while(i < n_Strings) {
				strings[i] = s.nextLine();
				i++;
			}
			q_Queries = s.nextInt();
			s.nextLine();
			queries = new String[q_Queries];
			i = 0;
			while(i < q_Queries) {
				queries[i] = s.nextLine();
				i++;
			}
		} catch(IOException e) {
            System.out.println(String.format("Could not read input for: [%s] -> [%s]", this.input, e.getMessage())); 
            throw e;
        }
	}

}
