package assg1p1;

import java.io.*;
import java.util.*;


public class RailNetwork {

	//private final double THRESHOLD = 0.000001;
	
	private TreeMap<String,Station> stationList;
	
	public RailNetwork(String trainData, String connectionData) {
		stationList = new TreeMap<>();
		
		try {	
			readStationData(trainData);
			readConnectionData(connectionData);
		}
		catch (IOException e) {
			System.out.println("Exception encountered: " + e);
		}
	}
	
	/**
	 * Reads the CSV file containing information about the stations and 
	 * populate the TreeMap<String,Station> stationList. Each row of 
	 * the CSV file contains the name, latitude and longitude coordinates
	 * of the station.
	 * 
	 * You need to make a Station object for each row and add it to the 
	 * TreeMap<String,Station> stationList where the key value is the 
	 * name of the station (as a String).
	 * 
	 * @param infile	   the path to the file
	 * @throws IOException if the file is not found
	 */
	public void readStationData(String infile) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader(infile));
		/*
		 * INSERT YOUR CODE HERE
		 */
		in.close();
	}
	/**
	 * Reads the CSV file containing information about connectivity between 
	 * adjacent stations, and update the stations in stationList so that each
	 * Station object has a list of adjacent stations.
	 * 
	 * Each row contains two Strings separated by comma. To obtain the distance
	 * between the two stations, you need to use the latitude and longitude 
	 * coordinates together with the computeDistance() methods defined below
	 * 
	 * @param infile	   the path to the file
	 * @throws IOException if the file is not found
	 */	
	public void readConnectionData(String infile) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader(infile));
		/*
		 * INSERT YOUR CODE HERE
		 */
		in.close();
	}
	
	/**
	 * Given the latitude and longitude coordinates of two locations x and y, 
	 * return the distance between x and y in metres using Haversine formula,
	 * rounded down to the nearest integer.
	 * 
	 * Note that two more methods are provided below for your convenience 
	 * and you should not directly call this method
	 * 
	 * source://www.geeksforgeeks.org/haversine-formula-to-find-distance-between-two-points-on-a-sphere/
	 * 
	 * @param lat1 latitude coordinate of x
	 * @param lon1 longitude coordinate of x
	 * @param lat2 latitude coordinate of y
	 * @param lon2 longitude coordinate of y
	 * @return distance between x and y
	 */
	public static int computeDistance(double lat1, double lon1, double lat2, double lon2) {
        // distance between latitudes and longitudes 
        double dLat = Math.toRadians(lat2 - lat1); 
        double dLon = Math.toRadians(lon2 - lon1); 
  
        // convert to radians 
        lat1 = Math.toRadians(lat1); 
        lat2 = Math.toRadians(lat2); 
  
        // apply formulae 
        double a = Math.pow(Math.sin(dLat / 2), 2) +  
                   Math.pow(Math.sin(dLon / 2), 2) *  
                   Math.cos(lat1) *  
                   Math.cos(lat2); 
        double rad = 6371.0; 
        Double c = 2 * Math.asin(Math.sqrt(a)); 
        Double distance = rad * c * 1000;
        return distance.intValue(); 
	}	
	
	/**
	 * Compute the distance between two stations in metres, where the stations
	 * are given as String objects
	 * 
	 * @param a		the first station
	 * @param b		the second station
	 * @return		the distance between the two stations in metres
	 */
	public int computeDistance(String a, String b) {
		Station u = stationList.get(a);
		Station v = stationList.get(b);
		return computeDistance(u.getLatitude(),u.getLongitude(),
							   v.getLatitude(),v.getLongitude());
	}
	
	/**
	 * Compute the distance between two stations in metres, where the stations
	 * are given as Station objects
	 * 
	 * @param a		the first station
	 * @param b		the second station
	 * @return		the distance between the two stations in metres
	 */
	public int computeDistance(Station a, Station b) {
		return computeDistance(a.getLatitude(),a.getLongitude(),
							   b.getLatitude(),b.getLongitude());
	}
	
	/**
	 * The method finds the shortest route (in terms of distance travelled) 
	 * between the origin station and the destination station.
	 * The route is returned as an ArrayList<String> containing the names of 
	 * the stations along the route, including the origin and the destination 
	 * stations.
	 * 
	 * If the route cannot be completed (there is no path between origin and
	 * destination), then return an empty ArrayList<String>
	 * 
	 * If the origin or the destination stations are not in the list of stations,
	 * return an empty ArrayList<String>. 
	 * 
	 * If the origin and the destination stations are the same, return an 
	 * ArrayList<String> containing the station.
	 * 
	 * @param origin		the starting station
	 * @param destination	the destination station
	 * @return
	 */
	public ArrayList<String> routeMinDistance(String origin, String destination){
		if (!stationList.containsKey(origin) || !stationList.containsKey(destination)) {
			return new ArrayList<String>();
		}
		if (origin.equals(destination)) {
			ArrayList<String> ans = new ArrayList<String>();
			ans.add(origin);
			return ans;
		}
		/*
		 * INSERT YOUR CODE HERE
		 */
	
		return null;
	}

	/**
	 * The method finds the shortest route (in terms of distance travelled) 
	 * between the origin station and the destination station under the 
	 * condition that the route must not pass through any stations in 
	 * TreeSet<String> failures
	 * 
	 * The route is returned as an ArrayList<String> containing the names of 
	 * the stations along the route, including the origin and the destination 
	 * stations.
	 * 
	 * If the route cannot be completed (there is no path between origin and
	 * destination), then return an empty ArrayList<String>
	 * 
	 * If the origin or the destination stations are not in the list of stations,
	 * return an empty ArrayList<String>. 
	 * 
	 * If the origin and the destination stations are the same, return an 
	 * ArrayList<String> containing the station.
	 * 
	 * @param origin		the starting station
	 * @param destination	the destination station
	 * @param failures		the list of stations that cannot be used
	 * @return
	 */
	public ArrayList<String> routeMinDistance(String origin, String destination, TreeSet<String> failures){
		if (!stationList.containsKey(origin) ||  !stationList.containsKey(destination) ||
			failures.contains(origin) || failures.contains(destination)) {
			return new ArrayList<String>();
		}
		if (origin.equals(destination)) {
			ArrayList<String> ans = new ArrayList<String>();
			ans.add(origin);
			return ans;
		}
		/*
		 * INSERT YOUR CODE HERE
		 */
		return null;
	}
	/**
	 * The method finds the shortest route (in terms of number of stops)
	 * between the origin station and the destination station.
	 * The route is returned as an ArrayList<String> containing the names of 
	 * the stations along the route, including the origin and the destination 
	 * stations.
	 * 
	 * If the route cannot be completed (there is no path between origin and
	 * destination), then return an empty ArrayList<String>
	 * 
	 * If the origin or the destination stations are not in the list of stations,
	 * return an empty ArrayList<String>. 
	 * 
	 * If the origin and the destination stations are the same, return an 
	 * ArrayList<String> containing the station.
	 * 
	 * @param origin		the starting station
	 * @param destination	the destination station
	 * @return
	 */
	public ArrayList<String> routeMinStop(String origin, String destination){
		if (!stationList.containsKey(origin) || !stationList.containsKey(destination)) {
			return new ArrayList<String>();
		}
		if (origin.equals(destination)) {
			ArrayList<String> ans = new ArrayList<String>();
			ans.add(origin);
			return ans;
		}
		/*
		 * INSERT YOUR CODE HERE
		 */
		return null;
	}

	/**
	 * The method finds the shortest route (in terms of number of stops)
	 * between the origin station and the destination station under the 
	 * condition that the route must not pass through any stations in 
	 * TreeSet<String> failures (i.e. the rail segment cannot be travelled on)
	 * 
	 * The route is returned as an ArrayList<String> containing the names of 
	 * the stations along the route, including the origin and the destination 
	 * stations.
	 * 
	 * If the route cannot be completed (there is no path between origin and
	 * destination), then return an empty ArrayList<String>
	 * 
	 * If the origin or the destination stations are not in the list of stations,
	 * return an empty ArrayList<String>. 
	 * 
	 * If the origin and the destination stations are the same, return an 
	 * ArrayList<String> containing the station.
	 * 
	 * @param origin		the starting station
	 * @param destination	the destination station
	 * @param failures		the list of stations that cannot be used
	 * @return
	 */
	public ArrayList<String> routeMinStop(String origin, String destination, TreeSet<String> failures){
		if (!stationList.containsKey(origin) || !stationList.containsKey(destination)) {
			return new ArrayList<String>();
		}
		if (origin.equals(destination)) {
			ArrayList<String> ans = new ArrayList<String>();
			ans.add(origin);
			return ans;
		}
		/*
		 * INSERT YOUR CODE HERE
		 */
		return null;	
	}
	
	/**
	 * Given a route between two stations, compute the total distance 
	 * of this route. Return 0 if there is one or less station in the 
	 * route.
	 * 
	 * @param path	the list of stations in the route (as String objects)
	 * @return		the length of the route between the first station
	 * 				and last station in the list, 0 if path is empty
	 * 				or null
	 */
	public int findTotalDistance(ArrayList<String> path) {
		int distance = 0;
		if (path == null || path.isEmpty())
			return 0;
		/*
		 * INSERT YOUR CODE HERE
		 */
		return distance;
	}
	
	
	/** 
	 * Given a route between two stations, compute the minimum total cost 
	 * of performing an exhaustive scan on this route, as described in the 
	 * assignment specification for Stage 2.
	 * 
	 * Return 0 if there are 2 or less stations in the route. 
	 * 
	 * @param route  the list of stations in the route (as String objects)
	 * @return		 the minimum cost of performing exhaustive scans
	 */
	public int optimalScanCost(ArrayList<String> route) {
		if (route == null || route.size() <= 2)
			return 0;
		/*
		 * INSERT YOUR CODE HERE
		 */
		
		return 0;
	}
	
	/***
	 * Given a route between two stations, return the list of stations (in
	 * the order that they were chosen) that gives the segmentation that 
	 * leads to the minimum cost for performing an exhaustive scan on the 
	 * the route (as described in the assignment specification for Stage 2.
	 * 
	 * Return an empty ArrayList if there are 2 or less stations in the route.
	 * 
	 * @param route
	 * @return
	 */
	public ArrayList<String> optimalScanSolution(ArrayList<String> route){
		if (route == null || route.size() <= 2)
			return new ArrayList<String>();
		/*
		 * INSERT YOUR CODE HERE
		 */
		
		return null;
	}
	
}
