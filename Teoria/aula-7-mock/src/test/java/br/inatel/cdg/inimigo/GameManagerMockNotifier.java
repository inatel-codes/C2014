package br.inatel.cdg.inimigo;

public class GameManagerMockNotifier implements Notifier {
	private boolean executed;
	
	@Override
	public void notifica(Inimigo inimigo) {
		executed = true;
	}
	
	public boolean getExecuted() {
		return executed;
	}
}
