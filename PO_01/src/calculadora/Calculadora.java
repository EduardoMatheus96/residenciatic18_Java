package calculadora;

import java.util.Scanner;

public class Calculadora {
	private double numero01, numero02;

	public void pegaNumeros() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro numero: ");
		this.numero01 = scanner.nextInt();
		
		System.out.println("Digite o valor do segundo numero: ");
		this.numero02 = scanner.nextInt();
		
	}
	
	public void adicao() {
		System.out.println(this.numero01 + " + " + this.numero02 + " = " + (this.numero01 + this.numero02));
	}
	
	public void subtracao() {
		System.out.println(this.numero01 + " - " + this.numero02 + " = " + (this.numero01 - this.numero02));
	}

	public void multiplicacao() {
		System.out.println(this.numero01 + " * " + this.numero02 + " = " + (this.numero01 * this.numero02));
	}
	
	public void divisao() {
		System.out.println(this.numero01 + " / " + this.numero02 + " = " + (this.numero01 / this.numero02));
	}
	
	public Calculadora() {
		super();
	}

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		calculadora.pegaNumeros();
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
            System.out.println("Selecione uma opercao:");
            System.out.println("1. Adicao");
            System.out.println("2. Subtracao");
            System.out.println("3. Multiplicacao");
            System.out.println("4. Divisao");
            System.out.println("0. Sair");

            System.out.print("Opcao: ");
            int escolha = scanner.nextInt();

            if (escolha == 0) {
                System.out.println("Saindo do programa. Até mais!");
                break;
            }

            double resultado = 0.0;

            switch (escolha) {
                case 1:
                    calculadora.adicao();
                    break;
                case 2:
                    calculadora.subtracao();
                    break;
                case 3:
                    calculadora.multiplicacao();                             
                    break;
                case 4:
                    calculadora.divisao();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }
        }
        scanner.close();
		
		
	}
}

