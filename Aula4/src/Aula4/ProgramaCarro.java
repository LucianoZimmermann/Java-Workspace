package Aula4;

class ProgramaCarro {
	
	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.modelo = "Corolla";
		carro.cor = "Branco";
		carro.velocidadeAtual = 0;
		carro.velocidadeMaxima = 160;
		
		System.out.println("Modelo do carro: " + carro.modelo);
		System.out.println("Cor do carro: " + carro.cor);
		System.out.println("Velocidade Atual: " + carro.velocidadeAtual);
		System.out.println("Velocidade Maxima: " + carro.velocidadeMaxima);
		System.out.println("\n");
		
		if(carro.velocidadeAtual == carro.velocidadeMaxima) {
			System.out.println("O carro esta em velocidade maxima!");
		}
		
		if(carro.velocidadeAtual == 0) {
			System.out.println("O carro esta desligado!");
		} else {
			System.out.println(" Velocidade Atual: " + carro.velocidadeAtual);
		}
		
		System.out.println("Acelerando 50 KM/H");
		
		carro.acelera(50);
		
		System.out.println("Modelo do carro: " + carro.modelo);
		System.out.println("Cor do carro: " + carro.cor);
		System.out.println("Velocidade Atual: " + carro.velocidadeAtual);
		System.out.println("Velocidade Maxima: " + carro.velocidadeMaxima);
		System.out.println("\n");
		
		carro.acelera(110);
		
		System.out.println("Modelo do carro: " + carro.modelo);
		System.out.println("Cor do carro: " + carro.cor);
		System.out.println("Velocidade Atual: " + carro.velocidadeAtual);
		System.out.println("Velocidade Maxima: " + carro.velocidadeMaxima);
		System.out.println("\n");
		
		carro.acelera(10);
		
		System.out.println("Modelo do carro: " + carro.modelo);
		System.out.println("Cor do carro: " + carro.cor);
		System.out.println("Velocidade Atual: " + carro.velocidadeAtual);
		System.out.println("Velocidade Maxima: " + carro.velocidadeMaxima);
		
		carro.desacelar(75);
		
		System.out.println("Modelo do carro: " + carro.modelo);
		System.out.println("Cor do carro: " + carro.cor);
		System.out.println("Velocidade Atual: " + carro.velocidadeAtual);
		System.out.println("Velocidade Maxima: " + carro.velocidadeMaxima);
		
		
	}
}
