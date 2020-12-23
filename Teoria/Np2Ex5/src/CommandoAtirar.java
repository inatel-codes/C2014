
public class CommandoAtirar implements ICommand {

	Player player;
	
	public CommandoAtirar(Player player) {
		this.player = player;
	}
	
	@Override
	public void executa() {
		player.atirou();
	}
}
