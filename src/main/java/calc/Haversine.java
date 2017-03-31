package calc;

public class Haversine {

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
	
    public static final double R = 6372.8; // In kilometers
    
    public static double haversine(double lat1, double lon1, double lat2, double lon2) {
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);
 
        double a = Math.pow(Math.sin(dLat / 2),2) + Math.pow(Math.sin(dLon / 2),2) * Math.cos(lat1) * Math.cos(lat2);
        double c = 2 * Math.asin(Math.sqrt(a));
        return R * c;
    }
}
