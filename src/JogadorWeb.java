
public class JogadorWeb extends Jogador {
	
	private String navegador;

	public JogadorWeb(String n, String c, String nav) {
		super(n, c);
		super.setScore(200);
		this.navegador = nav;
	}

	public String getNavegador() {
		return navegador;
	}

	public void setNavegador(String navegador) {
		this.navegador = navegador;
	}
	
	@Override
	public Integer aumentarPontuacao(Integer n) {
		this.setScore(n * 2);
		return this.getScore();
	}
	
	@Override
	public String toString() {
		return String.format("Nome do player: %s | Score: %d", this.getNome(), this.getScore());
	}

}
