package br.inatel.cdg.inimigo;

public class UIMockNotifier implements Notifier{
	private boolean executed = false;
	
	@Override
	public void notifica(Inimigo inimigo) {
		// faz uns trem doido
		executed = true;
	}
	
	public boolean getExecuted() {
		return executed;
	}

}
