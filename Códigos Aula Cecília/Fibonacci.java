import java.util.Scanner;

public class Fibonacci{
	public static void main(String[] args) {
		int numeroAnterior = 1;
		int resultFibo = 0;
		int contador = 0;
		int tamanhoSequencia;

		System.out.print("Digite a quantidade que deseja ver de numeros da Sequencia de Fibonacci: ");
		tamanhoSequencia = STDIN_SCANNER.nextInt();

		while(contador != tamanhoSequencia) {
			System.out.print(resultFibo + " -> ");
			resultFibo = resultFibo + numeroAnterior;
			numeroAnterior = resultFibo - numeroAnterior;
			contador++;
		}

		System.out.print("FIM");
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}