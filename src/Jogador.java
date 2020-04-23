
public abstract class Jogador {
	
	private String nome;
	private String cpf;
	private Integer score = 0;
	
	public Jogador(String n, String c) {
		
		this.nome = n;
		this.cpf = c;
	}
	
	public Integer aumentarPontuacao(Integer i) {
		return this.score += i;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}; 
	
}
