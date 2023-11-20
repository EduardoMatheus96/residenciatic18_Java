package temperatura;

import java.util.Scanner;

public class ConverteTemperatura {
	private double temperatura;
	private String grau;  
	
	public void pegaTemperatura() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor da temperatura: ");
		this.temperatura = scanner.nextInt();
		
		scanner.nextLine();
		
		do {
			System.out.println("Digite qual o tipo do grau da temperatura (Celsius ou Fahrenheit): ");
			this.grau = scanner.nextLine();
			if(!this.grau.toLowerCase().equals("celsius") && !this.grau.toLowerCase().equals("fahrenheit")) {
				System.out.println("Insira um tipo de grau valido (Celsius ou Farenheit): ");
			}
		}while(!this.grau.toLowerCase().equals("celsius") && !this.grau.toLowerCase().equals("fahrenheit"));
		
	}
	
	public void converteParaCelsius() {
		this.temperatura = (5.0 / 9.0) * (this.temperatura - 32);
		System.out.println("Temperatura em Celsius: " + this.temperatura);
	}
	
	public void converteParaFahrenheit() {
		this.temperatura = (this.temperatura * 9/5) + 32;
		System.out.println("Temperatura em Fahrenheit: " + this.temperatura);

	}

	public String getGrau() {
		return this.grau;
	}
	
	public static void main(String[] args) {
		ConverteTemperatura temperatura = new ConverteTemperatura();
		
		temperatura.pegaTemperatura();
		String grau = temperatura.getGrau();
		if(grau.toLowerCase().equals("celsius")) {
			temperatura.converteParaFahrenheit();
		}
		if(grau.toLowerCase().equals("fahrenheit")){
			temperatura.converteParaCelsius();
		}
	}

}
