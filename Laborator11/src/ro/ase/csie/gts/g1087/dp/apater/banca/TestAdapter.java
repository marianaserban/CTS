package ro.ase.csie.gts.g1087.dp.apater.banca;

public class TestAdapter {

	public static void main(String[] args) {
		
		ContBancarDebit cont=new ContBancarDebit(100, "ro12");
		BankAccount account=new AdapterCont2Account(cont);
		account.accountTransfer(new DebitAccount(), 50);
		
		System.out.println("Valoare in cont: "+cont.balanta);
	}

}
