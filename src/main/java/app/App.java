package app;

import file.FileReader;

public class App {
	public static void main(String[] args) {

 		/* A variavel VALUE determina os valores que serão considerados como pertinentes. 
		 * Por exemplo, valores em que o SUBJECT apareça será com o Z maior que 1, sendo iniciado em 2.
		 * Onde o subject não existe, aquela coordenada terá como valor Z, igual a 0
		 */
		
		int value = 2;
		
		/*
		 * fileInput é o arquivo XYZ de entrada. Deve ser nesse formato, sendo as colunas separadas por espaços. Padrão QGIS.
		 */
		String fileInput = "C:\\Users\\JulianoRodrigo\\Dropbox\\TrabalhosMineracao\\Arquivos QGis\\XYZ - Hidrografia Medianeira\\MedianeiraXYZ.xyz";
		FileReader imageFile = new FileReader(fileInput);
		
		/*
		 * fileOutput é o arquivo XYZ de saída. Lembre-se de ter permissão de escrita naquele diretório.
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
