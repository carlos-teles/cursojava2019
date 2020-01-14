package model;

public class Professor extends Pessoa {
	private String matricula;
	private String segmento;

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the segmento
	 */
	public String getSegmento() {
		return segmento;
	}

	/**
	 * @param segmento the segmento to set
	 */
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	public Professor() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Professor(String nome, String rg, String cpf, String telefone, String email, String matricula,
			String segmento) {
		super(nome, rg, cpf, telefone, email);
		this.matricula = matricula;
		this.segmento = segmento;
	}

}
