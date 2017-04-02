package app;

import file.FileReader;

public class App {
	public static void main(String[] args) {
		String file = "C:\\Users\\JulianoRodrigo\\Dropbox\\TrabalhosMineracao\\Arquivos QGis\\XYZ - Hidrografia Medianeira\\MedianeiraXYZ.xyz";
		FileReader imageFile = new FileReader(file);
		
		imageFile.read();
		imageFile.fillListCoordinatesRiver();
		imageFile.printLists();
		imageFile.compare();
		//imageFile.printLists();
		imageFile.grava();
				
	}
}
