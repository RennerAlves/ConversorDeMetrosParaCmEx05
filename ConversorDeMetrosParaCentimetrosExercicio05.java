package ListaDeExerc�cios;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * 
 * @author Renner Alves Martins Este programa recebe um valor em cent�metros e
 *         faz a convers�o para metros.
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
			System.out.println("Erro! Insira um valor v�lido. Se incluir casas"
					+ " decimais, fa�a a separa��o com v�rgula.");
		}
		}
		conversor = valorEmMetros * 100;
		
		System.out.println("O valor " + valorEmMetros + "m �, em cent�metros: ");
		System.out.println(conversor + "cm");

	

	}
}
