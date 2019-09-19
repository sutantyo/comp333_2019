package assg1p1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class RailNetworkTest {

	RailNetwork r;
	@Before public void initialize() {
		String stationData = "src/data/station_data.csv";
		String connectionData = "src/data/adjacent_stations.csv";
		r = new RailNetwork(stationData,connectionData);
	}
	
	/** Tests for routeMinDistance with no failures **/
	@Test
	public void routeMinDistanceTest1() {
		String origin = "Hornsby";
		String destination = "Hornsby";
		String[] expected = {"Hornsby"};
		
		ArrayList<String> actual = r.routeMinDistance(origin, destination);
		assertArrayEquals(expected, actual.toArray());
	}

	
	@Test
	public void routeMinDistanceTest2() {
		String origin = "Hornsby";
		String destination = "Chatswood";
		String[] expected = {"Hornsby","Waitara","Wahroonga","Warrawee",
							 "Turramurra","Pymble","Gordon","Killara",
							 "Lindfield","Roseville","Chatswood"};
		
		ArrayList<String> actual = r.routeMinDistance(origin, destination);
		assertArrayEquals(expected, actual.toArray());
	}

	@Test
	public void routeMinDistanceTest3() {
		String origin = "Wolli Creek";
		String destination = "Town Hall";
		String[] expected = {"Wolli Creek","Tempe","Sydenham","St Peters",
							"Erskineville","Redfern","Central","Town Hall"};
		 
		
		ArrayList<String> actual = r.routeMinDistance(origin, destination);
		assertArrayEquals(expected, actual.toArray());
	}
		
	@Test
	public void routeMinDistanceTest4() {
		String origin = "East Richmond";
		String destination = "Hurstville";
		String[] expected = {"East Richmond","Clarendon","Windsor","Mulgrave",
				"Vineyard","Riverstone","Schofields","Quakers Hill","Marayong",
				"Blacktown","Seven Hills","Toongabbie","Pendle Hill",
				"Wentworthville","Westmead","Parramatta","Harris Park",
				"Granville","Clyde","Auburn","Lidcombe","Flemington","Homebush",
				"Strathfield","Burwood","Croydon","Ashfield","Summer Hill",
				"Lewisham","Petersham","Stanmore","Newtown","Macdonaldtown",
				"Redfern","Erskineville","St Peters","Sydenham","Tempe",
				"Wolli Creek","Arncliffe","Banksia","Rockdale","Kogarah",
				"Carlton","Allawah","Hurstville"};

		
		ArrayList<String> actual = r.routeMinDistance(origin, destination);
		assertArrayEquals(expected, actual.toArray());
	}
		
	/** Test for routeMinStop with no failures **/
	@Test
	public void routeMinStopTest1() {
		String origin = "Hornsby";
		String destination = "Hornsby";
		String[] expected = {"Hornsby"};
		
		ArrayList<String> actual = r.routeMinDistance(origin, destination);
		assertArrayEquals(expected, actual.toArray());
	}
	
	@Test
	public void routeMinStopTest2() {
		String origin = "Hornsby";
		String destination = "Epping";
		String[] expected = {"Hornsby","Normanhurst","Thornleigh","Pennant Hills",
							 "Beecroft","Cheltenham","Epping"};
		
		ArrayList<String> actual = r.routeMinStop(origin, destination);
		assertArrayEquals(expected, actual.toArray());
	}
	
	@Test
	public void routeMinStopTest3() {
		String origin = "Wolli Creek";
		String destination = "Town Hall";
		String[] expected = {"Wolli Creek","International Airport",
							"Domestic Airport","Mascot","Green Square",
							"Central","Town Hall"};
		 
		
		ArrayList<String> actual = r.routeMinStop(origin, destination);
		assertArrayEquals(expected, actual.toArray());
	}
	
	@Test
	public void routeMinStopTest4() {
		String origin = "Richmond";
		String destination = "Hurstville";
		String[] expected = {"Richmond","East Richmond","Clarendon","Windsor","Mulgrave",
				"Vineyard","Riverstone","Schofields","Quakers Hill","Marayong",
				"Blacktown","Seven Hills","Toongabbie","Pendle Hill",
				"Wentworthville","Westmead","Parramatta","Harris Park",
				"Granville","Clyde","Auburn","Lidcombe","Berala","Regents Park",
				"Birrong","Yagoona","Bankstown","Punchbowl","Wiley Park",
				"Lakemba","Belmore","Campsie","Canterbury","Hurlstone Park",
				"Dulwich Hill","Marrickville","Sydenham","Tempe","Wolli Creek",
				"Arncliffe","Banksia","Rockdale","Kogarah","Carlton","Allawah",
				"Hurstville"};

		ArrayList<String> actual = r.routeMinStop(origin, destination);
		assertArrayEquals(expected, actual.toArray());
	}

	/** Tests for routeMinDistance with failures **/
	@Test
	public void routeMinDistanceWithFailuresTest1() {
		String origin = "Hornsby";
		String destination = "Hornsby";
		TreeSet<String> failures = new TreeSet<>();
		String[] expected = {"Hornsby"};
		
		ArrayList<String> actual = r.routeMinDistance(origin, destination, failures);
		assertArrayEquals(expected, actual.toArray());
	}

	
	@Test
	public void routeMinDistanceWithFailuresTest2() {
		String origin = "Hornsby";
		String destination = "Epping";
		TreeSet<String> failures = new TreeSet<>();
		failures.add("Beecroft");

		String[] expected = {"Hornsby","Waitara","Wahroonga","Warrawee",
				"Turramurra","Pymble","Gordon","Killara","Lindfield",
				"Roseville","Chatswood","North Ryde","Macquarie Park",
				"Macquarie University","Epping"};

		
		ArrayList<String> actual = r.routeMinDistance(origin, destination, failures);
		assertArrayEquals(expected, actual.toArray());
	}

	@Test
	public void routeMinDistanceWithFailuresTest3() {
		String origin = "Wolli Creek";
		String destination = "Town Hall";
		TreeSet<String> failures = new TreeSet<>();
		failures.add("Central");
		String[] expected = {"Wolli Creek","Tempe","Sydenham","St Peters",
				"Erskineville","Redfern","Macdonaldtown","Newtown","Stanmore",
				"Petersham","Lewisham","Summer Hill","Ashfield","Croydon",
				"Burwood","Strathfield","North Strathfield","Concord West",
				"Rhodes","Meadowbank","West Ryde","Denistone","Eastwood",
				"Epping","Macquarie University","Macquarie Park","North Ryde",
				"Chatswood","Artarmon","St Leonards","Wollstonecraft","Waverton",
				"North Sydney","Milsons Point","Wynyard","Town Hall"};
		 
		ArrayList<String> actual = r.routeMinDistance(origin, destination, failures);
		assertArrayEquals(expected, actual.toArray());
	}
		
	@Test
	public void routeMinDistanceWithFailuresTest4() {
		String origin = "East Richmond";
		String destination = "Hurstville";
		TreeSet<String> failures = new TreeSet<>();
		failures.add("Burwood");
		failures.add("Bankstown");
		failures.add("Liverpool");
		failures.add("North Ryde");
		String[] expected = {"East Richmond","Clarendon","Windsor","Mulgrave",
				"Vineyard","Riverstone","Schofields","Quakers Hill","Marayong",
				"Blacktown","Seven Hills","Toongabbie","Pendle Hill",
				"Wentworthville","Westmead","Parramatta","Harris Park",
				"Granville","Clyde","Auburn","Lidcombe","Flemington","Homebush",
				"Strathfield","North Strathfield","Concord West","Rhodes",
				"Meadowbank","West Ryde","Denistone","Eastwood","Epping",
				"Cheltenham","Beecroft","Pennant Hills","Thornleigh","Normanhurst",
				"Hornsby","Waitara","Wahroonga","Warrawee","Turramurra","Pymble",
				"Gordon","Killara","Lindfield","Roseville","Chatswood","Artarmon",
				"St Leonards","Wollstonecraft","Waverton","North Sydney",
				"Milsons Point","Wynyard","Town Hall","Central","Redfern",
				"Erskineville","St Peters","Sydenham","Tempe","Wolli Creek",
				"Arncliffe","Banksia","Rockdale","Kogarah","Carlton","Allawah",
				"Hurstville"};
		 
		
		ArrayList<String> actual = r.routeMinDistance(origin, destination, failures);
		assertArrayEquals(expected, actual.toArray());
	}

	@Test
	public void routeMinDistanceWithFailuresTest5() {
		String origin = "Richmond";
		String destination = "Blacktown";
		TreeSet<String> failures = new TreeSet<>();
		failures.add("Central");
		failures.add("North Ryde");
		String[] expected = {"Richmond","East Richmond","Clarendon","Windsor",
				"Mulgrave","Vineyard","Riverstone","Schofields","Quakers Hill",
				"Marayong","Blacktown"};
		 
		 
		ArrayList<String> actual = r.routeMinDistance(origin, destination, failures);
		assertArrayEquals(expected, actual.toArray());
	}

	@Test
	public void routeMinDistanceWithFailuresTest6() {
		String origin = "Waterfall";
		String destination = "Cronulla";
		TreeSet<String> failures = new TreeSet<>();
		failures.add("Sutherland");
		String[] expected = {};
		 
		 
		ArrayList<String> actual = r.routeMinDistance(origin, destination, failures);
		assertArrayEquals(expected, actual.toArray());
	}
	
	@Test
	public void routeMinDistanceWithFailuresTest7() {
		String origin = "Leppington";
		String destination = "Hornsby";
		TreeSet<String> failures = new TreeSet<>();
		failures.add("Central");
		failures.add("Strathfield");
		String[] expected = {};
		 
		 
		ArrayList<String> actual = r.routeMinDistance(origin, destination, failures);
		assertArrayEquals(expected, actual.toArray());
	}
	
	/** Tests for routeMinStop with failures **/
	@Test
	public void routeMinStopWithFailuresTest1() {
		String origin = "Hornsby";
		String destination = "Hornsby";
		TreeSet<String> failures = new TreeSet<>();
		String[] expected = {"Hornsby"};
		
		ArrayList<String> actual = r.routeMinStop(origin, destination, failures);
		assertArrayEquals(expected, actual.toArray());
	}

	
	@Test
	public void routeMinStopWithFailuresTest2() {
		String origin = "Hornsby";
		String destination = "Epping";
		TreeSet<String> failures = new TreeSet<>();
		failures.add("Beecroft");

		String[] expected = {"Hornsby","Waitara","Wahroonga","Warrawee",
				"Turramurra","Pymble","Gordon","Killara","Lindfield",
				"Roseville","Chatswood","North Ryde","Macquarie Park",
				"Macquarie University","Epping"};

		
		ArrayList<String> actual = r.routeMinStop(origin, destination, failures);
		assertArrayEquals(expected, actual.toArray());
	}

	@Test
	public void routeMinStopWithFailuresTest3() {
		String origin = "Wolli Creek";
		String destination = "Town Hall";
		TreeSet<String> failures = new TreeSet<>();
		failures.add("Central");
		String[] expected = {"Wolli Creek","Tempe","Sydenham","St Peters",
				"Erskineville","Redfern","Macdonaldtown","Newtown","Stanmore",
				"Petersham","Lewisham","Summer Hill","Ashfield","Croydon",
				"Burwood","Strathfield","North Strathfield","Concord West",
				"Rhodes","Meadowbank","West Ryde","Denistone","Eastwood",
				"Epping","Macquarie University","Macquarie Park","North Ryde",
				"Chatswood","Artarmon","St Leonards","Wollstonecraft","Waverton",
				"North Sydney","Milsons Point","Wynyard","Town Hall"};
		 
		ArrayList<String> actual = r.routeMinStop(origin, destination, failures);
		assertArrayEquals(expected, actual.toArray());
	}
		
	@Test
	public void routeMinStopWithFailuresTest4() {
		String origin = "East Richmond";
		String destination = "Hurstville";
		TreeSet<String> failures = new TreeSet<>();
		failures.add("Burwood");
		failures.add("Bankstown");
		failures.add("Liverpool");
		failures.add("North Ryde");
		String[] expected = {"East Richmond","Clarendon","Windsor","Mulgrave",
				"Vineyard","Riverstone","Schofields","Quakers Hill","Marayong",
				"Blacktown","Seven Hills","Toongabbie","Pendle Hill",
				"Wentworthville","Westmead","Parramatta","Harris Park",
				"Granville","Clyde","Auburn","Lidcombe","Flemington","Homebush",
				"Strathfield","North Strathfield","Concord West","Rhodes",
				"Meadowbank","West Ryde","Denistone","Eastwood","Epping",
				"Cheltenham","Beecroft","Pennant Hills","Thornleigh",
				"Normanhurst","Hornsby","Waitara","Wahroonga","Warrawee",
				"Turramurra","Pymble","Gordon","Killara","Lindfield","Roseville",
				"Chatswood","Artarmon","St Leonards","Wollstonecraft","Waverton",
				"North Sydney","Milsons Point","Wynyard","Town Hall","Central",
				"Green Square","Mascot","Domestic Airport","International Airport",
				"Wolli Creek","Arncliffe","Banksia","Rockdale","Kogarah","Carlton",
				"Allawah","Hurstville"};
		 
		 
		ArrayList<String> actual = r.routeMinStop(origin, destination, failures);
		assertArrayEquals(expected, actual.toArray());
	}
	
	@Test
	public void routeMinStopWithFailuresTest5() {
		String origin = "Richmond";
		String destination = "Blacktown";
		TreeSet<String> failures = new TreeSet<>();
		failures.add("Central");
		failures.add("North Ryde");
		String[] expected = {"Richmond","East Richmond","Clarendon","Windsor",
				"Mulgrave","Vineyard","Riverstone","Schofields","Quakers Hill",
				"Marayong","Blacktown"};
		 
		 
		ArrayList<String> actual = r.routeMinStop(origin, destination, failures);
		assertArrayEquals(expected, actual.toArray());
	}

	@Test
	public void routeMinStopWithFailuresTest6() {
		String origin = "Waterfall";
		String destination = "Cronulla";
		TreeSet<String> failures = new TreeSet<>();
		failures.add("Sutherland");
		String[] expected = {};
		 
		 
		ArrayList<String> actual = r.routeMinStop(origin, destination, failures);
		assertArrayEquals(expected, actual.toArray());
	}
	
	@Test
	public void routeMinStopWithFailuresTest7() {
		String origin = "Leppington";
		String destination = "Hornsby";
		TreeSet<String> failures = new TreeSet<>();
		failures.add("Central");
		failures.add("Strathfield");
		String[] expected = {};
		 
		 
		ArrayList<String> actual = r.routeMinStop(origin, destination, failures);
		assertArrayEquals(expected, actual.toArray());
	}
	
	/** Tests for findTotalDistance **/
	@Test
	public void findTotalDistanceTest1() {
		String origin = "Hornsby";
		String destination = "Epping";
		TreeSet<String> failures = new TreeSet<>();
		
		int expected = 9703;
		int actual = r.findTotalDistance(r.routeMinDistance(origin, destination, failures));
		assertEquals(expected,actual);
	}
	
	@Test
	public void findTotalDistanceTest2() {
		String origin = "East Richmond";
		String destination = "Hurstville";
		TreeSet<String> failures = new TreeSet<>();
		
		int expected = 70768;	
		int actual = r.findTotalDistance(r.routeMinDistance(origin, destination, failures));
		assertEquals(expected,actual);
	}
	
	@Test
	public void findTotalDistanceTest3() {
		String origin = "East Richmond";
		String destination = "Hurstville";
		TreeSet<String> failures = new TreeSet<>();
		failures.add("Burwood");
		failures.add("Bankstown");
		failures.add("Liverpool");
		failures.add("North Ryde");
		
		int expected = 106712;	
		int actual = r.findTotalDistance(r.routeMinDistance(origin, destination, failures));
		assertEquals(expected,actual);
	}
	
	@Test
	public void findTotalDistanceTest4() {
		String origin = "East Richmond";
		String destination = "Hurstville";
		TreeSet<String> failures = new TreeSet<>();
		failures.add("Burwood");
		failures.add("Bankstown");
		failures.add("Liverpool");
		failures.add("North Ryde");
		
		int expected = 108550;	
		int actual = r.findTotalDistance(r.routeMinStop(origin, destination, failures));
		assertEquals(expected,actual);
	}
	
	@Test
	public void findTotalDistanceTest5() {
		String origin = "Waterfall";
		String destination = "Cronulla";
		TreeSet<String> failures = new TreeSet<>();
		failures.add("Sutherland");
		
		int expected = 0;	
		int actual = r.findTotalDistance(r.routeMinStop(origin, destination, failures));
		assertEquals(expected,actual);
	}
	
	/** Tests for optimalScanCost **/
	
	@Test
	public void optimalScanCostTest1() {
		String origin = "Blacktown";
		String destination = "Pendle Hill";
		
		int expected = 9996;	
		int actual = r.optimalScanCost((r.routeMinDistance(origin, destination)));
		assertEquals(expected,actual);
	}
	
	@Test
	public void optimalScanCostTest2() {
		String origin = "Parramatta";
		String destination = "Blacktown";
		
		int expected = 29313;	
		int actual = r.optimalScanCost((r.routeMinDistance(origin, destination)));
		assertEquals(expected,actual);
	}

	@Test
	public void optimalScanCostTest3() {
		String origin = "Hornsby";
		String destination = "Central";
		
		int expected = 102062;	
		int actual = r.optimalScanCost((r.routeMinDistance(origin, destination)));
		assertEquals(expected,actual);
	}
	
	@Test
	public void optimalScanCostTest4() {
		String origin = "Central";
		String destination = "Richmond";
		
		int expected = 298418;	
		int actual = r.optimalScanCost((r.routeMinDistance(origin, destination)));
		assertEquals(expected,actual);
	}
	
	@Test
	public void optimalScanCostTest5() {
		String origin = "Richmond";
		String destination = "Waterfall";
		
		int expected = 533404;	
		int actual = r.optimalScanCost((r.routeMinDistance(origin, destination)));
		assertEquals(expected,actual);
	}
	
	/** Tests for optimalScanSolution **/
	@Test
	public void optimalScanSolutionTest1() {
		String origin = "Blacktown";
		String destination = "Pendle Hill";
		
		String[] expected = {"Seven Hills"};
		ArrayList<String> actual = r.optimalScanSolution(r.routeMinDistance(origin, destination));
		Collections.sort(actual);
		
		assertArrayEquals(expected,actual.toArray());
	}
	
	@Test
	public void optimalScanSolutionTest2() {
		String origin = "Parramatta";
		String destination = "Blacktown";
		
		String[] expected = {"Toongabbie", "Wentworthville"};
		ArrayList<String> actual = r.optimalScanSolution(r.routeMinDistance(origin, destination));
		Collections.sort(actual);
		
		assertArrayEquals(expected,actual.toArray());
	}
	
	@Test
	public void optimalScanSolutionTest3() {
		String origin = "Central";
		String destination = "Hornsby";
		
		String[] expected = {"Artarmon","Killara","Milsons Point","Pymble",
							 "Roseville","St Leonards","Turramurra","Wahroonga",
							 "Waverton","Wynyard"};

		ArrayList<String> actual = r.optimalScanSolution(r.routeMinDistance(origin, destination));
		Collections.sort(actual);
		
		assertArrayEquals(expected,actual.toArray());
	}
	
	@Test
	public void optimalScanSolutionTest4() {
		String origin = "Richmond";
		String destination = "Central";
		
		String[] expected = {"Ashfield","Blacktown","Burwood","Clarendon","Clyde",
							 "Harris Park","Homebush","Lewisham","Lidcombe",
							 "Macdonaldtown","Mulgrave","Parramatta","Pendle Hill",
							 "Quakers Hill","Riverstone","Seven Hills","Stanmore",
							 "Westmead"};

		ArrayList<String> actual = r.optimalScanSolution(r.routeMinDistance(origin, destination));
		Collections.sort(actual);
		
		assertArrayEquals(expected,actual.toArray());
	}
	
	@Test
	public void optimalScanSolutionTest5() {
		String origin = "Richmond";
		String destination = "Waterfall";
		
		String[] expected = {"Allawah","Arncliffe","Ashfield","Auburn","Burwood",
							 "Clarendon","Clyde","Como","Erskineville",
							 "Flemington","Harris Park","Heathcote","Homebush",
							 "Hurstville","Kogarah","Loftus","Marayong","Newtown",
							 "Oatley","Pendle Hill","Penshurst","Petersham",
							 "Redfern","Rockdale","Schofields","Seven Hills",
							 "Summer Hill","Sutherland","Sydenham","Tempe",
							 "Vineyard","Westmead","Windsor"};

		ArrayList<String> actual = r.optimalScanSolution(r.routeMinDistance(origin, destination));
		Collections.sort(actual);
		
		assertArrayEquals(expected,actual.toArray());
	}
}
