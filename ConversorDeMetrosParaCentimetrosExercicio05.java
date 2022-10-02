package ListaDeExercícios;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * 
 * @author Renner Alves Martins Este programa recebe um valor em centímetros e
 *         faz a conversão para metros.
 *
 */
public class ConversorDeMetrosParaCentimetrosExercicio05 {

	public static void main(String[] args) {
	
		double conversor = 0.0;
		int numeroCorreto = 0;
		double valorEmMetros = 0.0;
		
		while (numeroCorreto != 1){
		Scanner scanner = new Scanner (System.in);
		System.out.print("Insira um valor em METROS: ");
		
		try {
			valorEmMetros = scanner.nextDouble();
		numeroCorreto++;
		} catch (InputMismatchException ex) {
			System.out.println("Erro! Insira um valor válido. Se incluir casas"
					+ " decimais, faça a separação com vírgula.");
		}
		}
		conversor = valorEmMetros * 100;
		
		System.out.println("O valor " + valorEmMetros + "m é, em centímetros: ");
		System.out.println(conversor + "cm");

	

	}
}
