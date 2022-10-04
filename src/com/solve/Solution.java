package com.solve;

import java.nio.file.Path;

/**
 * Interface to be implemented for each single and specific problem asked to solve.
 * 
 * @author luis.chapa
 *
 */
public interface Solution<T>
{   
    /**
     * Method for solving the problem 
     *  
     * @param testCase String Path to the TestCases file to run the solution of the problem
     * @throws Exception Something goes wrong in the execution
     */
    T solve() throws Exception;
}