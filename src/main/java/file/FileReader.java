package file;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Coordinate;

public class FileReader {

	private List<Coordinate> listCoordinates;	
	private List<Object> listMinorDistance;

	public List<Coordinate> getList() {
		return listCoordinates;
	}

	public void setList(List<Coordinate> list) {
		this.listCoordinates = list;
	}
	
	public int size(){
		return listCoordinates.size();		
	}

	public void addMinorDistance(double value){		
		listMinorDistance.add(value);
	}
	
	public FileReader() {
		listCoordinates = new ArrayList<Coordinate>();
		listMinorDistance = new ArrayList<>();
	}

	public void read(String s){
		Coordinate aux = new Coordinate();
		TextFile arquivo = new TextFile(s);

		try {
			arquivo.openTextFile();
			while (arquivo.next()) {
				String Linha = arquivo.readLine();
				String[] vDados = Linha.split("[ ]");

				aux.setLatitude(vDados[0]);
				aux.setLongitude(vDados[1]);
				aux.setValue(Integer.parseInt(vDados[2]));
				
				listCoordinates.add(aux);				
			}

		} catch (IOException e) {
			System.out.println("ERRO: " + e);
		}
	}
	
	public void printContent(){
		
		for (Coordinate coordinate : listCoordinates) {
			System.out.println(coordinate);
		}
	}

}
