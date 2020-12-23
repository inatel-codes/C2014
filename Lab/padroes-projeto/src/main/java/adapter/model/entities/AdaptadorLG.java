package adapter.model.entities;

public class AdaptadorLG implements Projetor{
private ProjetorLG projetor;
	
	public AdaptadorLG(ProjetorLG projetor) {
		this.projetor = projetor;
	}
	
	@Override
	public void liga() {
		projetor.enable(2);
	}
}
