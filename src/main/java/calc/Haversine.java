package calc;

public class Haversine implements DistanceMeasure {

	/**
	 * This is the implementation Haversine Distance Algorithm between two places
	 * @author ananth
	 *  R = earth’s radius (mean radius = 6,371km)
	    Δlat = lat2− lat1
	    Δlong = long2− long1
	    a = sin²(Δlat/2) + cos(lat1).cos(lat2).sin²(Δlong/2)
	    c = 2.atan2(√a, √(1−a))
	    d = R.c
	 *
	 */

	@Override
	public double measure(double latitude1, double latitude2, double longitude1, double longitude2) {
		final int R = 6371; // Radious of the earth
		Double lat1 = latitude1;
		Double lon1 = latitude2;
		Double lat2 = longitude1;
		Double lon2 = longitude2;
		Double latDistance = toRad(lat2-lat1);
		Double lonDistance = toRad(lon2-lon1);
		Double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2) + 
				Math.cos(toRad(lat1)) * Math.cos(toRad(lat2)) * 
				Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
		Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		Double distance = R * c;

		//System.out.println("The distance between two lat and long is::" + distance);
		return distance;
	}

	private static Double toRad(Double value) {
		return value * Math.PI / 180;
	}


}
