package model;

public class Coordinate {
	private String latitude;
	private String longitude;
	private int value;
	
	public Coordinate() {
		// TODO Auto-generated constructor stub
	}	
	
	public Coordinate(String latitude, String longitude, int value) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.value = value;
	}

	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Coordinate [latitude=" + latitude + ", longitude=" + longitude + ", value=" + value + "]";
	}
	
	
	
}
