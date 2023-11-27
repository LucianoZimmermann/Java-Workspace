package entities;

public class ContaPoupanca extends Conta {

	private double fee;
	
	public ContaPoupanca() {
		super();
	}
	
	public ContaPoupanca(String holder, Integer number, Double amount, double fee) {
		super(holder, number, amount);
		this.fee = fee;
	}

	public double calcFee() {
		return getAmount() * (fee / 10);
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
