package entities;

public class ContaCorrente extends Conta{
	
	private double moneyInvested;
	
	public ContaCorrente() {
		super();
	}
	
	public ContaCorrente(String holder, Integer number, Double amount, double moneyInvested) {
		super(holder, number, amount);
		this.moneyInvested = moneyInvested;
	}
	
	public double calcLimit() {
		return getAmount() + (moneyInvested * 0.1);
	}

	@Override
	public double withdraw(double value) {
		return getAmount() - value;
	}

	@Override
	public double deposit(double value) {
		return getAmount() + value;
	}

}
