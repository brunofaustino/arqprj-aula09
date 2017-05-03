package pontos.desktop;

import java.util.Scanner;

import pontos.interfaces.*;

public class PontosDektop {

	private IPontoProcess processo;
	
	public PontosDektop(IPontoProcess processo){
		this.processo = processo;
	}
	public void consultaPontos(){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero identificador");
		int identificador = Integer.parseInt(entrada.nextLine());
		Mapeamento mapeamento = processo.getMapeamento();
		System.out.println("\n");
		for (Character letra : mapeamento.getMapa().keySet()) {
			Integer[] nums = mapeamento.getMapa().get(letra);
			System.out.println(nums[0] + " ou " + nums[1] + " > " + letra);
			
		}
		System.out.println("\n Entre as letra correspondentes aos numeros da sua senha: ");
		String letraDigitadas = entrada.nextLine();
		int pontos = processo.getPontos(identificador, letraDigitadas, mapeamento);
		System.out.println("Total de Pontos: " + pontos);
		entrada.close();
	}
	
}
