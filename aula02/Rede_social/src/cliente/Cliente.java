package cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
	private String nome, email, nacionalidade;
	private int quantidadeDePostagens, pontuacao;
	private ArrayList<String> postagens;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public ArrayList<String> getPostagens() {
		return postagens;
	}
	public void setPostagens(ArrayList<String> postagens) {
		this.postagens = postagens;
	}
	
	public void adicionaPostagens(String postagem) {
		this.quantidadeDePostagens++;
		postagens.add(postagem);
	}
	
	public void listaPostagens() {
		for (String post : postagens) {
			System.out.println(post);
		}
		
//		for (int i = 0; i < this.postagens.size(); i++) {
//			System.out.println(this.postagens.get(i));
//		}
	}
	
	public void alteraPontuacao(int delta) {
		pontuacao+=delta;
		if (pontuacao < 0) {
			pontuacao = 0;
		}
	}
	
	public Cliente(String nome, String email, String nacionalidade) {
		super();
		this.nome = nome;
		this.email = email;
		this.nacionalidade = nacionalidade;
		this.quantidadeDePostagens = 0;
		this.pontuacao = 0;
		this.postagens = new ArrayList<String>();
	}
	
	public static void main(String[] args) {
		String nome, email, nacionalidade, postagem;
		Cliente cliente;
		
//		System.out.println("Informe seu nome: ");
//		Scanner sc = new Scanner(System.in);
//		nome = sc.nextLine();
//		
//		System.out.println("Informe seu email: ");
//		email = sc.nextLine();
//		
//		System.out.println("Informe sua nacionalidade: ");
//		nacionalidade = sc.nextLine();
//		
//		System.out.println("Escreva uma postagem: ");
//		postagem = sc.nextLine();
//		
//		cliente = new Cliente(nome, email, nacionalidade);
//		
//		cliente.adicionaPostagens(postagem);
//		
//		System.out.println("Escreva mais uma postagem: ");
//		postagem = sc.nextLine();
//		
//		cliente.adicionaPostagens(postagem);
//		
//		System.out.println("Escreva mais uma postagem: ");
//		postagem = sc.nextLine();
//		
//		cliente.adicionaPostagens(postagem);
//		
//		cliente.listaPostagens();
		
		String sn;
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		do {
			
			System.out.println("Informe seu nome: ");
			Scanner sc = new Scanner(System.in);
			nome = sc.nextLine();
			
			System.out.println("Informe seu email: ");
			email = sc.nextLine();
			
			System.out.println("Informe sua nacionalidade: ");
			nacionalidade = sc.nextLine();
			
			System.out.println("Escreva uma postagem: ");
			postagem = sc.nextLine();
			
			cliente = new Cliente(nome, email, nacionalidade);
			
			cliente.adicionaPostagens(postagem);
			
			System.out.println("Deseja inserir mais Clientes ?(s/n): ");
			sn = sc.nextLine();
		} while (!sn.equals("n"));
	
		cliente.listaPostagens();
	}
		
}
