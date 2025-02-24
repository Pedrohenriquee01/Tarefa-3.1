package random;

import java.util.Random;
public class Randommatiz {

	public static void main(String[] args) {
		   int[][] matriz = new int[5][5];
	        Random random = new Random();

	        for (int i = 0; i < 5; i++) {
	            for (int C = 0; C < 5; C++) {
	                matriz[i][C] = random.nextInt(100) + 1;
	            }
	        }
	        System.out.println("Matriz gerada:");
	        for (int i = 0; i < 5; i++) {
	            int somaLinha = 0;
	            for (int C = 0; C < 5; C++) {
	                System.out.printf("%3d ", matriz[i][C]);
	                somaLinha += matriz[i][C];
	            }
	            System.out.println(" | Soma da linha: " + somaLinha);
	        }


	}

}
