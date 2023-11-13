package conta;

import java.util.Scanner;

public class Conta {
	private int numero;
	private String nome;
	private double saldo;
	
	public void inicializa(String n, double s) {
		nome = n;
		 saldo = s;
		 if (saldo < 0) {
		   System.out.println("Erro na Criação da Conta!!! \n");
		 }
	}
	public void deposita(double valor) {
		saldo = saldo + valor;
	}
	public void consulta() {
		System.out.println("Cliente: " + nome);
		System.out.println("Saldo Atual: " + saldo);
		System.out.println("Numero da Conta: " + numero);
		
	}
	public int saque(double valor) {
		if (saldo < valor) {
		    return 0;
		}else
		  {
		    saldo = saldo - valor;
		    return 1;
		  }
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Conta(int numero, String nome, double saldo) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}	

	public static void main(String[] args) {
		int num;
		String nome;
		double saldo;
		
		System.out.println("Informe seu nome: ");
		Scanner sc = new Scanner(System.in);
		nome = sc.nextLine();
		
		System.out.println("Informe o número da sua conta: ");
		num = sc.nextInt();
		
		System.out.println("Informe o saldo da conta: ");
		saldo = sc.nextDouble();
		
		Conta conta = new Conta(num, nome, saldo);
		conta.consulta();
		
	}

}
