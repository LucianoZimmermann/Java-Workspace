package service;

public class UsaInterestService implements InterestService{
	private Double interestRate = 1.0;

	@Override
	public double getInterestRate() {
		return interestRate;
	}

}
