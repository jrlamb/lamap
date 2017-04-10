# lamap
Projeto em JAVA para determinação de matriz de distâncias em imagens XYZ, utilizando o método Haversine para cálculo.

O cálculo de distâncias em atividades de Geoprocessamento é uma atividade extremamente importante e, a determinação da menor distância entre dois pontos diretamente envolvida mas não implementada por muitos GIS.

O presente projeto identifica a menor distãncia de uma COORDENADA para um SUBJECT qualquer presente em uma imagem XYZ.

O SUBJECT pode ser qualquer coisa, como um rio, por exemplo. Deste modo, é possível construir uma imagem com a menor distância de cada coordenada para o rio mais próximo, em linha reta; sem considerar outros elementos, como relevo ou algum tipo de percurso.

Em termos de funcionamento, algumas ações podem ser descritas:

(a) O programa faz a leitura da imagem, verificando coordenada a coordenada se o valor de Z é superior ao informado;
(b) Estas coordenadas são armazenadas em um vetor;
(c) É feita a leitura novamente coordenada a coordenada, sendo que desta vez, a coordenada lida tem a sua distância calculada para cada SUJBECT presente no vetor;
(d) A menor distância encontrada é associada a coordenada lida para construção do arquivo de saída;
(e) É gerado um arquivo XYZ de saída, com as mesmas características do utilizado na entrada (lat long zValue);
(f) O arquivo gerado pode ser perfeitamente aberto em um software de processamento, como o QGIS.

Maiores informações {julianolamb, humbertobeneduzzi}@gmail.com
