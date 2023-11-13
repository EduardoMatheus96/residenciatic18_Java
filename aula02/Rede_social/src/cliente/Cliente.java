package cliente;

import java.util.ArrayList;

public class Cliente {
	private String nome, email, nacionalidade;
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
	
	public Cliente(String nome, String email, String nacionalidade, ArrayList<String> postagens) {
		super();
		this.nome = nome;
		this.email = email;
		this.nacionalidade = nacionalidade;
		this.postagens = postagens;
	}
	
	
	
	
	
}
