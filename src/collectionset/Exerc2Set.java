package collectionset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exerc2Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Set<Integer> numeros = new HashSet<>();

	        for (int i = 1; i <= 10; i++) {
	            numeros.add(i * 1);
	        }

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número inteiro: ");
	        int numeroDigitado = scanner.nextInt();

	        if (numeros.contains(numeroDigitado)) {
	            System.out.println("Número " + numeroDigitado + " Encontrado!");
	        } else {
	            System.out.println("O número " + numeroDigitado + " não foi encontrado!");
	        }

	        scanner.close();
	}

}
