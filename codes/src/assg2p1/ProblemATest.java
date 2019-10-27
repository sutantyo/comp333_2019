package assg2p1;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class ProblemATest {

	ProblemA p;
	@Before public void initialize() {
	}	
	
	@Test
	public void test01() {

		String data = "src/data/a2p1_problemA_input_01.csv";
		p = new ProblemA(data);
		HashMap<String,HashMap<String,Integer>> actual = p.findNumberOfRoutes();
		
		String[] s = {"Hornsby","Lidcombe","Redfern","Strathfield","Sydenham"};

		Integer[][] expected = {{0,0,1,0,0},
								{1,0,3,1,1},
								{0,0,0,0,0},
								{1,0,3,0,1},
								{0,0,1,0,0}};
		
		for(int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				assertEquals(expected[i][j],actual.get(s[i]).get(s[j]));
			}
		}
	}
	
	@Test
	public void test02() {

		String data = "src/data/a2p1_problemA_input_02.csv";
		p = new ProblemA(data);
		HashMap<String,HashMap<String,Integer>> actual = p.findNumberOfRoutes();
		
		String[] s = {"Hornsby","Lidcombe","Redfern","Strathfield","Sydenham"};

		Integer[][] expected = {{-1,0,-1,-1,-1},
								{-1,0,-1,-1,-1},
								{-1,0,-1,-1,-1},
								{-1,0,-1,-1,-1},
								{0,0,0,0,0}};;
		
		for(int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				assertEquals(expected[i][j],actual.get(s[i]).get(s[j]));
			}
		}
	}
	
	@Test
	public void test03() {

		String data = "src/data/a2p1_problemA_input_03.csv";
		p = new ProblemA(data);
		HashMap<String,HashMap<String,Integer>> actual = p.findNumberOfRoutes();
		
		String[] s = {"Blacktown","Burwood","Central","Chatswood","Eastwood",
					  "Epping","Hornsby","Redfern","Strathfield"};

		Integer[][] expected = {{-1,-1,0,0,-1,-1,-1,0,0},
								{-1,-1,0,0,-1,-1,-1,0,0},
								{-1,-1,0,1,-1,-1,-1,1,1},
								{0,0,0,0,1,0,0,0,0},
								{0,0,0,0,0,0,0,0,0},
								{-1,-1,0,0,-1,-1,-1,0,0},
								{-1,-1,0,0,-1,-1,-1,0,0},
								{-1,-1,0,1,-1,-1,-1,0,0},
								{-1,-1,0,0,-1,-1,-1,0,0}};
		
		for(int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				assertEquals(expected[i][j],actual.get(s[i]).get(s[j]));
			}
		}
	}
	
	@Test
	public void test04() {

		String data = "src/data/a2p1_problemA_input_04.csv";
		p = new ProblemA(data);
		HashMap<String,HashMap<String,Integer>> actual = p.findNumberOfRoutes();
		
		String[] s = {"1","2","3","4","5","6","7","8"};
		Integer[][] expected = {
		  {0,0,0,1,1,1,1,3},
		  {0,0,0,1,1,1,1,3},
		  {0,0,0,1,1,1,1,3},
		  {0,0,0,0,1,1,1,3},
		  {0,0,0,0,0,0,0,1},
		  {0,0,0,0,0,0,0,1},
		  {0,0,0,0,0,0,0,1},
		  {0,0,0,0,0,0,0,0}};
		
		for(int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				assertEquals(expected[i][j],actual.get(s[i]).get(s[j]));
			}
		}
	}
	
	@Test
	public void test05() {

		String data = "src/data/a2p1_problemA_input_05.csv";
		p = new ProblemA(data);
		HashMap<String,HashMap<String,Integer>> actual = p.findNumberOfRoutes();
		
		String[] s = {"Bankstown","Blacktown","Central","Chatswood","Epping",
					  "Glenfield","Hornsby","Lidcombe","Liverpool","Macarthur",
					  "Parramatta","Penrith","Revesby","Richmond","Strathfield"
					  ,"Tallawong"};

		Integer[][] expected = {{0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
								{2,0,6,2,1,1,1,1,1,1,1,0,1,0,1,0},
								{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
								{0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
								{0,0,2,2,0,0,1,0,0,0,0,0,0,0,0,0},
								{0,0,1,0,0,0,0,0,0,1,0,0,1,0,0,0},
								{0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0},
								{1,0,4,2,1,0,1,0,0,0,0,0,0,0,1,0},
								{1,0,2,0,0,1,0,0,0,1,0,0,1,0,0,0},
								{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
								{1,0,4,2,1,0,1,1,0,0,0,0,0,0,1,0},
								{2,1,6,2,1,1,1,1,1,1,1,0,1,0,1,0},
								{0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
								{2,1,6,2,1,1,1,1,1,1,1,0,1,0,1,0},
								{0,0,3,2,1,0,1,0,0,0,0,0,0,0,0,0},
								{0,0,2,2,1,0,1,0,0,0,0,0,0,0,0,0}};
		
		for(int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				assertEquals(expected[i][j],actual.get(s[i]).get(s[j]));
			}
		}
	}
	

	
}
