package assg1p2;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class Stage3Test {

	
	Double epsilon = 0.000001;

	RailNetworkAdvanced r;
	@Before public void initialize() {
		String stationData = "src/data/station_data.csv";
		String connectionData = "src/data/adjacent_stations.csv";
		String linesData = "src/data/lines_data.csv";
		r = new RailNetworkAdvanced(stationData,connectionData,linesData);
	}	
	
	@Test
	public void computeRatioTest1() {

		String origin = "Parramatta";
		String destination = "Strathfield";
		
		Double expected = 1.097584920479088;
		Double actual = r.computeRatio(origin, destination);

		assertEquals(expected,actual,epsilon);
	}
	
	@Test
	public void computeRatioTest2() {

		String origin = "Bankstown";
		String destination = "Hornsby";
		
		Double expected = 1.3356612123918958;
		Double actual = r.computeRatio(origin, destination);

		assertEquals(expected,actual,epsilon);
	}
	
	@Test
	public void computeRatioTest3() {

		String origin = "Richmond";
		String destination = "Hurstville";
		
		Double expected = 1.3687600644122384;
		Double actual = r.computeRatio(origin, destination);

		assertEquals(expected,actual,epsilon);
	}
	
	@Test
	public void computeRatioTest4() {

		String origin = "Hurstville";
		String destination = "Richmond";
		
		Double expected = 1.3687600644122384;
		Double actual = r.computeRatio(origin, destination);

		assertEquals(expected,actual,epsilon);
	}
	
	@Test(timeout=10000)
	public void computeAllRatioTest1() {

		String origin = "Parramatta";
		String destination = "Strathfield";
		
		HashMap<String,HashMap<String,Double>> ans = r.computeAllRatio();
		Double expected = 1.097584920479088;
		Double actual = ans.get(origin).get(destination);

		assertEquals(178,ans.size());
		assertEquals(expected,actual,epsilon);
	}

	@Test(timeout=5000)
	public void computeAllRatioTest2() {
		String origin = "Bankstown";
		String destination = "Hornsby";
		
		HashMap<String,HashMap<String,Double>> ans = r.computeAllRatio();
		Double expected = 1.3356612123918958;
		Double actual = ans.get(origin).get(destination);

		assertEquals(178,ans.size());
		assertEquals(expected,actual,epsilon);
	}
	
	@Test(timeout=1000)
	public void computeAllRatioTest3() {
		String origin = "Richmond";
		String destination = "Hurstville";
		
		HashMap<String,HashMap<String,Double>> ans = r.computeAllRatio();
		Double expected = 1.3687600644122384;
		Double actual = ans.get(origin).get(destination);

		assertEquals(178,ans.size());
		assertEquals(expected,actual,epsilon);
	}
	
	@Test(timeout=1000)
	public void computeAllRatioTest4() {
		String origin = "Hurstville";
		String destination = "Richmond";
		
		HashMap<String,HashMap<String,Double>> ans = r.computeAllRatio();
		Double expected = 1.3687600644122384;
		Double actual = ans.get(origin).get(destination);

		assertEquals(178,ans.size());
		assertEquals(expected,actual,epsilon);
	}
}
