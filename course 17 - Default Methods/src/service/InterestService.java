package service;

import java.security.InvalidParameterException;

public interface InterestService {
	double getInterestRate();
	default double payment(double amount, int months) {
		if(amount < 0 || months < 1) {
			throw new InvalidParameterException("Cálculo inválido");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100, months);
	}
}
