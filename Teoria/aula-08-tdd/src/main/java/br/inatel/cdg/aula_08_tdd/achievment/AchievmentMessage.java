package br.inatel.cdg.aula_08_tdd.achievment;

import java.util.ArrayList;
import java.util.List;

public class AchievmentMessage {

	private List<AchievMsgReceiver> receivers;
	
	public AchievmentMessage(){
		receivers = new ArrayList<AchievMsgReceiver>();
	}
	
	public void distribuirMsg(String mensagem) {
		if(receivers.isEmpty()) {
			throw new SemRecebedoresException();
		}
		
		for (AchievMsgReceiver achievMsgReceiver : receivers) {
			achievMsgReceiver.msgReceiver(mensagem);
		}
	}

	public void registrarRecebedor(AchievMsgReceiver receiver) {
		receivers.add(receiver);
	}

}
