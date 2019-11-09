package assg2p1;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class ProblemBTest {

	ProblemB p;
	@Before public void initialize() {
	}	
	
	@Test(timeout=500)
	public void test01() {

		String data = "src/data/a2p1_problemB_input_01.csv";
		p = new ProblemB(data);
		
		Integer actual = p.computeMinDevice();
		Integer expected = 2;
		assertEquals(expected,actual);
	}
	
	@Test(timeout=500)
	public void test02() {
		String data = "src/data/a2p1_problemB_input_02.csv";
		p = new ProblemB(data);
		
		Integer actual = p.computeMinDevice();
		Integer expected = 6;
		assertEquals(expected,actual);
	}
	
	@Test(timeout=500)
	public void test03() {
		String data = "src/data/a2p1_problemB_input_03.csv";
		p = new ProblemB(data);
		
		Integer actual = p.computeMinDevice();
		Integer expected = 5;
		assertEquals(expected,actual);
	}
	
	@Test(timeout=500)
	public void test04() {
		String data = "src/data/a2p1_problemB_input_04.csv";
		p = new ProblemB(data);
		
		Integer actual = p.computeMinDevice();
		Integer expected = 38;
		assertEquals(expected,actual);
	}
	
	@Test(timeout=500)
	public void test05() {
		String data = "src/data/a2p1_problemB_input_05.csv";
		p = new ProblemB(data);
		
		Integer actual = p.computeMinDevice();
		Integer expected = 46;
		assertEquals(expected,actual);
	}
	
	@Test(timeout=500)
	public void test06() {
		String data = "src/data/a2p1_problemB_input_06.csv";
		p = new ProblemB(data);
		
		Integer actual = p.computeMinDevice();
		Integer expected = 85;
		assertEquals(expected,actual);
	}
	
	@Test(timeout=500)
	public void test07() {
		String data = "src/data/a2p1_problemB_input_07.csv";
		p = new ProblemB(data);
		
		Integer actual = p.computeMinDevice();
		Integer expected = 135;
		assertEquals(expected,actual);
	}
}
