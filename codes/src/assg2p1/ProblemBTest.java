package assg2p1;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class ProblemBTest {

	ProblemB p;
	@Before public void initialize() {
	}	
	
	@Test
	public void test01() {

		String data = "src/data/a2p1_problemB_input_01.csv";
		p = new ProblemB(data);
		
		Integer actual = p.computeMinDevice();
		Integer expected = 2;
		assertEquals(expected,actual);
	}
	
	@Test
	public void test02() {
		String data = "src/data/a2p1_problemB_input_02.csv";
		p = new ProblemB(data);
		
		Integer actual = p.computeMinDevice();
		Integer expected = 6;
		assertEquals(expected,actual);
	}
}
