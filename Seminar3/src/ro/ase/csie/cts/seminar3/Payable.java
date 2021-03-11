package ro.ase.csie.cts.seminar3;

public interface Payable {
	void withdraw(long amount) throws InsuficientFundsException;
}
