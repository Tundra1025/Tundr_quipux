package matriz;

public class matriz {
	public static void main(String[] args) {
		  String[][] matrix = new String[5][7];
		  
		  matrix[0][0] = "Argentina";
	        matrix[0][1] = "Belice";
	        matrix[0][2] = "Bolivia";
	        matrix[0][3] = "Brasil";
	        matrix[0][4] = "Canadá";
	        matrix[0][5] = "Chile";
	        matrix[0][6] = "Colombia";

	        matrix[1][0] = "Costa Rica";
	        matrix[1][1] = "Cuba";
	        matrix[1][2] = "Ecuador";
	        matrix[1][3] = "El Salvador";
	        matrix[1][4] = "Estados Unidos";
	        matrix[1][5] = "Guatemala";
	        matrix[1][6] = "Guyana";

	        matrix[2][0] = "Haití";
	        matrix[2][1] = "Honduras";
	        matrix[2][2] = "Jamaica";
	        matrix[2][3] = "México";
	        matrix[2][4] = "Nicaragua";
	        matrix[2][5] = "Panamá";
	        matrix[2][6] = "Paraguay";

	        matrix[3][0] = "Perú";
	        matrix[3][1] = "República Dominicana";
	        matrix[3][2] = "San Cristóbal y Nieves";
	        matrix[3][3] = "San Vicente y las Granadinas";
	        matrix[3][4] = "Santa Lucía";
	        matrix[3][5] = "Surinam";
	        matrix[3][6] = "Trinidad y Tobago";

	        matrix[4][0] = "Uruguay";
	        matrix[4][1] = "Venezuela";
	        
	        
	        
	        
	        
	        System.out.println("paises de america con 4 letras:");
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                if (matrix[i][j] != null && matrix[i][j].length() == 4) { 
	                    System.out.print(matrix[i][j] + " ");
	        
	}}}}}


