package calc;

import java.util.List;

import model.Coordinate;

public class MinorDistance {

	private List<Coordinate> listCoordinatesImage;
	private List<Coordinate> listCoordinatesRiver;
	private List<Object> listMinorDistance;	

	public MinorDistance(List<Coordinate> listCoordinatesImage, List<Coordinate> listCoordinatesRiver,
			List<Object> listMinorDistance) {
		super();
		this.listCoordinatesImage = listCoordinatesImage;
		this.listCoordinatesRiver = listCoordinatesRiver;
		this.listMinorDistance = listMinorDistance;
	}

	public void compare(){
		boolean flag = false;
		double minorDistance = 0, aux;

		double lat1, lat2, lon1, lon2;

		Haversine haversine = new Haversine();

		for (Coordinate coordinateImage : listCoordinatesImage) {
			for (Coordinate coordinateRiver : listCoordinatesRiver) {
				lat1 = Double.parseDouble(coordinateImage.getLatitude());
				lat2 = Double.parseDouble(coordinateRiver.getLatitude());
				lon1 = Double.parseDouble(coordinateImage.getLongitude());
				lon2 = Double.parseDouble(coordinateRiver.getLongitude());

				if (flag == false){
					flag = true;							
					minorDistance = haversine.measure(lat1, lat2, lon1, lon2); 		
				}

				if (minorDistance > haversine.measure(lat1, lat2, lon1, lon2)){
					minorDistance = haversine.measure(lat1, lat2, lon1, lon2);
					listMinorDistance.add(minorDistance);
				}
			}
		}	
	}


}
