package assg2p1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ProblemA {

	public ProblemA(String infile) {
		try {	
			processInput(infile);
		}
		catch (IOException e) {
			System.out.println("Exception encountered: " + e);
		}
	}
	
	/**
	 * A helper method to process the input file. 
	 * 
	 * @param infile the file containing the input
	 * @throws IOException
	 */
	public void processInput(String infile) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader(infile));
		/*
		 * INSERT YOUR CODE HERE
		 */
	}
	
	/**
	 * Returns the number of routes between two stations for all pairs 
	 * of stations, as described in the assignment spec. 
	 * 
	 * @return the 2D hashmap containing the number of routes
	 */
	public HashMap<String,HashMap<String,Integer>> findNumberOfRoutes(){
		/*
		 * INSERT YOUR CODE HERE
		 */
	
		return null;
	}
}
