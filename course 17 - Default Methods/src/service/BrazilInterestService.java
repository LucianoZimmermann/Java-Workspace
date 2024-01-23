package service;

public class BrazilInterestService implements InterestService{
	private Double interestRate = 2.0;
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}

}
