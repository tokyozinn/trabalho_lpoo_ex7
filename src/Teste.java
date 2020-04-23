import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
		Jogador j1 = new JogadorWeb("João", "11122233344", "Explorer");
		Jogador j2 = new JogadorDesktop("José", "55566677788", "SP");
		
		JOptionPane.showMessageDialog(null, j1);
		JOptionPane.showMessageDialog(null, j2);
		
		j1.aumentarPontuacao(1000);
		j2.aumentarPontuacao(1000);
		
		JOptionPane.showMessageDialog(null, j1);
		JOptionPane.showMessageDialog(null, j2);
	}

}
