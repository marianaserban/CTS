package ro.ase.csie.cts.g1087.dp.chain;

public class TestChain {
	
	public static void main(String[] args) {
		NodChainAbstract chatGlobal=new ModulChatGlobal();
		NodChainAbstract chatPrivatAbstract=new ModulChatPrivat();
		NodChainAbstract filtruChatAbstract=new ModulFiltru("Reguli limba Romana");
		
		filtruChatAbstract.setNext(chatPrivatAbstract);
		chatPrivatAbstract.setNext(chatGlobal);
		
		NodChainAbstract serverChat=filtruChatAbstract; 
		serverChat.procesareMesajChat(new MesajChat("@Everyone", "esti rau", 1));
		serverChat.procesareMesajChat(new MesajChat("@Everyone", "Esti ok. Ms", 1));
		serverChat.procesareMesajChat(new MesajChat("@Gigel", "Hai sa incercam nivelul 5", 1));

	}
	
}
