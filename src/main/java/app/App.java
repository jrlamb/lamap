package app;

import file.FileReader;

public class App {
	public static void main(String[] args) {

 		/* A variavel VALUE determina os valores que ser�o considerados como pertinentes. 
		 * Por exemplo, valores em que o SUBJECT apare�a ser� com o Z maior que 1, sendo iniciado em 2.
		 * Onde o subject n�o existe, aquela coordenada ter� como valor Z, igual a 0
		 */
		
		int value = 2;
		
		/*
		 * fileInput � o arquivo XYZ de entrada. Deve ser nesse formato, sendo as colunas separadas por espa�os. Padr�o QGIS.
		 */
		String fileInput = "C:\\Users\\JulianoRodrigo\\Dropbox\\TrabalhosMineracao\\Arquivos QGis\\XYZ - Hidrografia Medianeira\\MedianeiraXYZ.xyz";
		FileReader imageFile = new FileReader(fileInput);
		
		/*
		 * fileOutput � o arquivo XYZ de sa�da. Lembre-se de ter permiss�o de escrita naquele diret�rio.
		 */
		
		String fileOutput = "C:\\temp\\Lista.txt";
		
		imageFile.read();
		imageFile.fillListCoordinatesSubject(value);
		imageFile.printLists();
		imageFile.compare();
		//imageFile.printLists();
		imageFile.grava(fileOutput);
				
	}
}
