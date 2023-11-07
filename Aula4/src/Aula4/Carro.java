package Aula4;

public class Carro {
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	
	void liga() {
		System.out.println("O carro esta ligado!");
	}
	
	void acelera(int quantidade) {
        if (velocidadeAtual + quantidade > velocidadeMaxima) {
            System.out.println("Velocidade máxima atingida!");
            velocidadeAtual = velocidadeMaxima;
        } else {
            velocidadeAtual += quantidade;
        }
    }
	
	void desacelar(int quantidade) {
		
		if(velocidadeAtual == 0) {
			System.out.println("Veiculo ja parado!");
		}else {
			velocidadeAtual -= quantidade;
		}
	}
	
	}
