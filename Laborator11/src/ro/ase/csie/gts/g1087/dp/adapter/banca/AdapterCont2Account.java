package ro.ase.csie.gts.g1087.dp.adapter.banca;

public class AdapterCont2Account implements BankAccount{
	
	ContBancar cont;
	
	//e bine sa cerem referinta catre ob adaptat
	public AdapterCont2Account(ContBancar cont) {
		super();
		this.cont = cont;
	}

	@Override
	public void accountTransfer(BankAccount account, double amount) {
		ContBancarDebit contDebit=(ContBancarDebit)conversie(account);
		cont.transfer(contDebit, amount);
	}
	
	//am nevoie sa convertesc bankaccount intr un cont
	//nu e tocmai clean, dat pt exemplu merge
	private ContBancarDebit conversie(BankAccount account) {
		DebitAccount debitAccount=(DebitAccount)account;
		ContBancarDebit cont=new ContBancarDebit(debitAccount.value, debitAccount.id+" ");
		return cont;
	}
}
