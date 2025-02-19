package Projetos_LPA_JT.aula04;

import java.util.Scanner;

public class lpa_fluxogorithm_to_java {

	public static void main(String[] args) {
		double horatrab, valorhora, sal_bruto, sal_liquido, inss;
		Scanner ler = new Scanner(System.in);
		System.out.println("informe quantas horas foram trabalhadas");
		horatrab = ler.nextDouble();

		System.out.println("informe o valor recebido por hora");
		valorhora = ler.nextDouble();
		sal_bruto = horatrab * valorhora;
		inss = sal_bruto * 0.12;
		sal_liquido = sal_bruto - inss;

		System.out.println("seu salário bruto é de $ " + sal_bruto);
		System.out.println("seu salário líquido é de $ " + sal_liquido);

	}

}
