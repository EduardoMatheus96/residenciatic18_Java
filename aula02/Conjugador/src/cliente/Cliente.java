package cliente;

import java.util.Scanner;

public class Cliente {
	private String nome, cpf;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Cliente(String nome, String cpf, int idade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	
	public static void main(String[] args) {
		int idade;
		String nome, cpf;
		
		System.out.println("Informe seu nome: ");
		Scanner sc = new Scanner(System.in);
		nome = sc.nextLine();
		
		System.out.println("Informe seu cpf: ");
		cpf = sc.nextLine();
		
		System.out.println("Informe sua idade: ");
		idade = sc.nextInt();
		
		Cliente cliente = new Cliente(nome, cpf, idade);
		
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("CPF: " + cliente.getCpf());
		System.out.println("Idade: " + cliente.getIdade());
		
		System.out.println("Altere os dados: \n");
		
		System.out.println("Nome: \n");
		cliente.setNome(nome);
		System.out.println("CPF: \n");
		cliente.setCpf(cpf);
		System.out.println("Idade: \n");
		cliente.setIdade(idade);
		
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("CPF: " + cliente.getCpf());
		System.out.println("Idade: " + cliente.getIdade());
		
		
	}
	
}
