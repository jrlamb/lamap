package file;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import calc.DistanceMeasure;
import calc.Haversine;
import model.Coordinate;

public class FileReader {

	private String path;
	private List<Coordinate> listCoordinatesImage;
	private List<Coordinate> listCoordinatesSubject;
	private List listMinorDistance;	

	public FileReader(String path) {
		this.path = path;
		
		listCoordinatesImage = new ArrayList<Coordinate>();
		listCoordinatesSubject = new ArrayList<Coordinate>();
		listMinorDistance = new ArrayList<>();		
	}	

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public List<Coordinate> getListCoordinatesImage() {
		return listCoordinatesImage;
	}

	public void setListCoordinatesImage(List<Coordinate> listCoordinatesImage) {
		this.listCoordinatesImage = listCoordinatesImage;
	}

	public List<Coordinate> getListCoordinatesSubject() {
		return listCoordinatesSubject;
	} 
	
	public void setListCoordinatesSubject(List<Coordinate> listCoordinatesRiver) {
		this.listCoordinatesSubject = listCoordinatesRiver;
	}

	public List getListMinorDistance() {
		return listMinorDistance;
	}

	public void setListMinorDistance(List listMinorDistance) {
		this.listMinorDistance = listMinorDistance;
	}

	public void read(){
		System.out.println("Starting the read proccess ----------");		
		TextFile arquivo = new TextFile(getPath());

		try {
			arquivo.openTextFile();
			while (arquivo.next()) {
				String Linha = arquivo.readLine();
				String[] vDados = Linha.split("[ ]");
				
				listCoordinatesImage.add(new Coordinate(vDados[0], vDados[1], Integer.parseInt(vDados[2])));				
			}

		} catch (IOException e) {
			System.out.println("ERRO: " + e);
		}
		System.out.println("Read proccess finished ----------");
	}
	
	public void printLists(){
		System.out.println(":: List of coordinates ");
		System.out.println(" -- Begin --");
		
		for (Coordinate coordinate : listCoordinatesImage) {
			System.out.println(coordinate);
		}
		
		System.out.println(" -- End ----");
		
		System.out.println("\n\n:: List of subject's points ");
		System.out.println(" -- Begin --");
		
		for (Coordinate coordinate : listCoordinatesSubject) {
			System.out.println(coordinate);
		}
		
		System.out.println(" -- End ----");
		
		System.out.println("\n\n:: List of minor distances ");
		System.out.println(" -- Begin --");
		
		for (Object o : listMinorDistance) {
			System.out.println(o);
		}
		
		System.out.println(" -- End ----");
	}	
	
	public void fillListCoordinatesSubject(int VALUE){
		for (Coordinate coordinate : listCoordinatesImage) {
			if (coordinate.getValue() > VALUE){
				listCoordinatesSubject.add(coordinate);
			}
		}
	}

	public void compare(){
		System.out.println("Comparing ....");
		int cont = 0;
		
		double distance = 99999999, minorDistance = 99999999;
		double lat1, lat2, lon1, lon2;		

		for (Coordinate coordinateImage : listCoordinatesImage) {			
			for (Coordinate coordinateSubject : listCoordinatesSubject) {				
				lat1 = Double.parseDouble(coordinateImage.getLatitude());
				lat2 = Double.parseDouble(coordinateSubject.getLatitude());
				lon1 = Double.parseDouble(coordinateImage.getLongitude());
				lon2 = Double.parseDouble(coordinateSubject.getLongitude());			
				
				distance =  Haversine.haversine(lat1, lon1, lat2, lon2);
				
				if (distance < minorDistance){
					minorDistance = distance;									
				}
			}
			coordinateImage.setDistance(Double.toString(minorDistance));	
			minorDistance = 99999999;
			System.out.println("Contador: " + ++cont);
		}	
		System.out.println("Finished ....");
	}
	
	public void grava(String s){
		TextFile file = new TextFile();
		file.gravaTxt(s, listCoordinatesImage);
		
	}
	
}
