
public class CommandoPular implements ICommand{

	Player player;
	
	public CommandoPular(Player player) {
		this.player = player;
	}
	
	@Override
	public void executa() {
		player.pulou();
	}
}
