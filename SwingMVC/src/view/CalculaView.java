package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculaView extends JFrame{
	private JTextField primeiroNumero = new JTextField(10);
	private JTextField segundoNumero = new JTextField(10);
	private JTextField resultado = new JTextField(10);
	private JLabel sinalMais = new JLabel(" + ");
	private JButton botaoCalcula = new JButton("Calcula");
	
	public CalculaView(){
		JPanel painel = new JPanel();
		
		painel.add(primeiroNumero);
		painel.add(sinalMais);
		painel.add(segundoNumero);
		painel.add(botaoCalcula);
		painel.add(resultado);
		
		this.add(painel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
	}

	public int getResultado() {
		return Integer.parseInt(primeiroNumero.getText());
	}

	public void setResultado(int resultado) {
		this.resultado.setText(Integer.toString(resultado));
	}

	public int getPrimeiroNumero() {
		return Integer.parseInt(primeiroNumero.getText());
	}

	public int getSegundoNumero() {
		return Integer.parseInt(segundoNumero.getText());
	}
	
	
	
	
	
	
	
	
	
	
}
