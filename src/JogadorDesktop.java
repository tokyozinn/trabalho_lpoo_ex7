
public class JogadorDesktop extends Jogador {

	private String localidade;
	
	public JogadorDesktop(String n, String c, String l) {
		super(n, c);
		super.setScore(100);
		this.localidade = l;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	
	@Override
	public String toString() {
		return String.format("Nome do player: %s | Score: %d", this.getNome(), this.getScore());
	}

}
