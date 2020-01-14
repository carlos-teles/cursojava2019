package model;

public class Aluno extends Pessoa {
	private String matricula;
	private String curso;
	private static int numStudents = 0;

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
	 * @return the curso
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}

	public static int getNumAlunos() {
		return numStudents;
	}

	public Aluno() {
		// TODO Auto-generated constructor stub
		super();

	}

	public Aluno(String nome, String rg, String cpf, String telefone, String email, String matricula, String curso) {
		super(nome, rg, cpf, telefone, email);
		numStudents++;
		this.matricula = matricula;
		this.curso = curso;
	}
}
