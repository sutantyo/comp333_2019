package assg2p1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProblemB {

	public ProblemB(String infile) {
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
	 * Returns the minimum number of device failures that will cause 
	 * the two stations in the input file to be disconnected 
	 * (please refer to the assignment spec for the details)
	 * 
	 * @return an integer denoting the minimum number of device failures
	 */
	public Integer computeMinDevice() {
		/*
		 * INSERT YOUR CODE HERE
		 */
	
		return 0;
	}
}
