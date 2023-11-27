package entities;

public abstract class Conta {
	private String holder;
	private Integer number;
	private Double amount;
	
	public Conta() {
	}

	public Conta(String holder, Integer number, Double amount) {
		this.holder = holder;
		this.number = number;
		this.amount = amount;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public Double getAmount() {
		return amount;
	}

	public abstract double withdraw(double value);
	
	public abstract double deposit(double value);

	@Override
	public String toString() {
		return "Titular: " + holder 
				+ "\nNumero da conta: " + number 
				+ "\nSaldo: " + amount;
	}
	
	
	
}
