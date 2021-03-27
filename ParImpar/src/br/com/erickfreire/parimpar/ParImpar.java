package br.com.erickfreire.parimpar;

import java.util.Scanner;

/**
 * Crie um programa que recebe um valor do usuario e diz se ele é par ou impar
 * @author Erick Freire
 * @version 1 - Criado em 26-03-2021 as 23:25
 */

public class ParImpar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		
		System.out.print("Digite um valor: ");
		numero1 = entrada.nextInt();
		
		if(numero1 % 2 == 1)
			System.out.println("Ele é impar!");
		
		if(numero1 % 2 == 0)
			System.out.println("Ele é par!");
		

	}

}
