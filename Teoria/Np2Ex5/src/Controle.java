
public class Controle {

	ICommand comandoA;
	ICommand comandoB;

	public void setComandoBotaoA(ICommand comando) {
		this.comandoA = comando;
	}

	public void setComandoBotaoB(ICommand comando) {
		this.comandoB = comando;
	}

	public void apertarA() {
		comandoA.executa();
	}

	public void apertarB() {
		comandoB.executa();
	}
}
