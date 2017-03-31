package app;

import file.FileReader;

public class App {
	public static void main(String[] args) {
		String file = "C:\\Users\\JulianoRodrigo\\Dropbox\\TrabalhosMineracao\\Imagens\\temp.xyz";
		FileReader imageFile = new FileReader(file);
		
		imageFile.read();
		imageFile.fillListCoordinatesRiver();
		imageFile.printLists();
		imageFile.compare();
		imageFile.printLists();
				
	}
}
