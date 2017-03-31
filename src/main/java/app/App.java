package app;

import java.io.IOException;

import file.FileReader;
import file.TextFile;
import model.Coordinate;

public class App {
	public static void main(String[] args) {		
		FileReader imageFile = new FileReader();
		imageFile.read("C:\\Users\\JulianoRodrigo\\Dropbox\\TrabalhosMineracao\\Imagens\\HidroTeste.xyz");
		//imageFile.printContent();
		System.out.println("Records: " + imageFile.size() + " rows");
		
		
		//FileReader riverFile = new FileReader();
		//riverFile.read("C:\\Users\\JulianoRodrigo\\Dropbox\\TrabalhosMineracao\\Imagens\\HidrografiaMedianeiraXYZ");
		//riverFile.printContent();
		
	}
}
